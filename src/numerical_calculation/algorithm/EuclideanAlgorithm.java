package numerical_calculation.algorithm;

public class EuclideanAlgorithm {
    public int calc(int a, int b) {
        if (a % b == 0) return b;

        return calc(b, a % b);
    }
}
