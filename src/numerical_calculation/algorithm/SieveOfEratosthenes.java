package numerical_calculation.algorithm;

public class SieveOfEratosthenes {
    public int[] calc(int[] array) {
        double sqrt = Math.sqrt(array.length);

        array[0] = 0;

        for (int x = 2; x <= sqrt; x++) {
            for (int y = 2; x * y <= array.length; y++) {
                array[x * y - 1] = 0;
            }
        }

        return array;
    }
}
