package numerical_calculation;

import numerical_calculation.algorithm.EuclideanAlgorithm;
import numerical_calculation.algorithm.SieveOfEratosthenes;

public class NumericalCalculation {
    public static void main(String[] args) {
        System.out.println("Algorithm A - Sieve of Eratosthenes");

        int[] num = new int[100];

        for (int x = 0; x < num.length; x++) {
            num[x] = 1;
        }

        printPrime("Input Number", num);

        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        printPrime("Prime Number", sieveOfEratosthenes.calc(num));

        System.out.println();

        System.out.println("Algorithm B - Euclidean Algorithm");

        int a = 1112;
        int b = 695;

        printNumber("Input Number A", a);
        printNumber("Input Number B", b);

        EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm();
        printNumber("GCD Number", euclideanAlgorithm.calc(a, b));
    }

    public static void printNumber(String name, int num) {
        System.out.println(name + " : " + num);
    }

    public static void printPrime(String name, int[] array) {
        System.out.print(name + " : ");
        for (int x = 0; x < array.length; x++) {
            if (array[x] == 1) {
                System.out.print("[" + (x + 1) + "] ");
            }
        }
        System.out.println();
    }
}
