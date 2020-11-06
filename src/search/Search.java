package search;

import search.algorithm.SearchAlgorithm;
import search.algorithm.impl.BinarySearch;
import search.algorithm.impl.HashSearch;
import search.algorithm.impl.LinearSearch;
import sort.algorithm.SortAlgorithm;
import sort.algorithm.impl.SelectionSort;

public class Search {
    public static void main(String[] args) {
        int findNum = 24873;

        SearchAlgorithm searchAlgorithm = new LinearSearch();
        int[] arrayA = {117, 782, 9821, 819, 114, 6281, 8871, 3209, 24873, 6671};

        print("Search-A" + findNum, searchAlgorithm.search(arrayA, findNum));

        SearchAlgorithm binarySearch = new BinarySearch();
        int[] arrayB = binarySearch.store(new SelectionSort().sort(arrayA.clone()));

        print("Search-B" + findNum, searchAlgorithm.search(arrayB, findNum));

        SearchAlgorithm hashSearch = new HashSearch();
        int[] arrayC = hashSearch.store(arrayA.clone());

        print("Search-C" + findNum, searchAlgorithm.search(arrayC, findNum));


    }

    public static void print(String name, boolean a) {
        System.out.print(name + " : ");
        if (a) {
            System.out.println("find number");
        } else {
            System.out.println("not find number");
        }

    }
}
