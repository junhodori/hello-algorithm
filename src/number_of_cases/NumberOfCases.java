package number_of_cases;

import number_of_cases.algorithm.NumberOfCasesAlgorithm;
import number_of_cases.algorithm.impl.Combination;
import number_of_cases.algorithm.impl.Permutation;

public class NumberOfCases {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
        int[] array = {1, 2, 3};
        int num = 2;

        System.out.println("Combination");
        NumberOfCasesAlgorithm numberOfCasesAlgorithm = new Combination();
        System.out.println("count : " + numberOfCasesAlgorithm.count(array.length, num));
        numberOfCasesAlgorithm.cases(array.clone(), num);

        System.out.println("Permutation");
        numberOfCasesAlgorithm = new Permutation();
        System.out.println("count : " + numberOfCasesAlgorithm.count(array.length, num));
        numberOfCasesAlgorithm.cases(array.clone(), num);
    }
}
