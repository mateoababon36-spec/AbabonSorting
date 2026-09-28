/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class TestQuickSort {

    public static void main(String[] args) {

        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        QuickSort.quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted Array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
