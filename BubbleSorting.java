package com.algorithmproblems;


import java.util.Arrays;

public class BubbleSorting {
    public void bubbleSortArray(int[] arrayToSort) {

        for (int i = 0; i < arrayToSort.length - 1; i++)
        {
            for (int j = 0; j < arrayToSort.length - i - 1; j++)
            {
                if (arrayToSort[j] > arrayToSort[j + 1])
                {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array is : ");
        for (int i:arrayToSort)
        {
            System.out.print(" "+i);
        }
    }
        public static void main (String args[])
        {
            int[] arrayInt = {45,67,12,9,34};

            BubbleSorting sort = new BubbleSorting();
            sort.bubbleSortArray(arrayInt);

        }

}

