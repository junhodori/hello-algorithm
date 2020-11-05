package sort.algorithm;

public abstract class SortAlgorithm {
    public abstract int[] sort(int[] array);

    public int[] swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

        return array;
    }

    public int[] move(int[] array, int a, int b) {
        array[b] = array[a];
        return array;
    }
}
