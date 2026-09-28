/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class QuickSort {

    // Partition method
    public static int partition(int[] arr, int left, int right, int pivot) {

        int leftPointer = left;
        int rightPointer = right - 1;

        while (true) {

            // Move left pointer
            while (arr[leftPointer] < pivot) {
                leftPointer++;
            }

            // Move right pointer
            while (rightPointer >= left && arr[rightPointer] > pivot) {
                rightPointer--;
            }

            // Stop when pointers meet
            if (leftPointer >= rightPointer) {
                break;
            }

            // Swap elements
            int temp = arr[leftPointer];
            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = temp;
        }

        // Put pivot in correct position
        int temp = arr[leftPointer];
        arr[leftPointer] = arr[right];
        arr[right] = temp;

        return leftPointer;
    }

    // Quick Sort method
    public static void quickSort(int[] arr, int left, int right) {

        // Base condition
        if (left >= right) {
            return;
        }

        // Rightmost element is the pivot
        int pivot = arr[right];

        // Partition the array
        int partition = partition(arr, left, right, pivot);

        // Sort left partition
        quickSort(arr, left, partition - 1);

        // Sort right partition
        quickSort(arr, partition + 1, right);
    }
}
