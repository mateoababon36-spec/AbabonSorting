/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class TestMergeSort {

    public static void main(String[] args) {

        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        MergeSort mergeSort = new MergeSort(numbers);

        System.out.println("Original Array:");
        mergeSort.displayElements();

        mergeSort.performMergeSort(numbers);

        System.out.println("Sorted Array:");
        mergeSort.displayElements();
    }
}
