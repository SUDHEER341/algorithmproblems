package com.algorithmproblems;
import java.util.Scanner;

public class InsertionSortStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of strings to be sorted: ");
        int n = input.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.next();
        }
        insertionSort(arr);
        System.out.println("Sorted strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(temp) > 0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}

