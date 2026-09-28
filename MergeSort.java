/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class MergeSort {

    int[] TestArray;

    // Constructor
    public MergeSort(int[] val) {
        this.TestArray = val;
    }

    // Sort Elements Method
    public int[] sortElements(int[] arr) {

        // Get the length of the array
        int len = arr.length;

        // Get the middle of the array
        int mid = len / 2;

        // If array contains only one element,
        // it is already sorted
        if (len == 1) {
            return arr;
        }

        // Create left and right arrays
        int[] l_arr = new int[mid];
        int[] r_arr = new int[len - mid];

        // Copy elements into left array
        for (int i = 0; i < mid; i++) {
            l_arr[i] = arr[i];
        }

        // Copy elements into right array
        int k = 0;

        for (int j = mid; j < len; j++) {
            r_arr[k] = arr[j];
            k++;
        }

        // Recursive sorting and merging
        return merge(
                sortElements(l_arr),
                sortElements(r_arr)
        );
    }

    // Merge Method
    private int[] merge(int[] l_arr, int[] r_arr) {

        int sizeL = l_arr.length;
        int sizeR = r_arr.length;

        // Create result array
        int[] resArray = new int[sizeL + sizeR];

        // Create temporary arrays
        int[] l_array = new int[sizeL];
        int[] r_array = new int[sizeR];

        // Copy data to temporary left array
        for (int i = 0; i < sizeL; i++) {
            l_array[i] = l_arr[i];
        }

        // Copy data to temporary right array
        for (int j = 0; j < sizeR; j++) {
            r_array[j] = r_arr[j];
        }

        // Index variables/initialize the index of 1st & 2nd sub array
        int i = 0; // first sub array
        int j = 0; // second sub array
        int k = 0; // merge sub array

        // Merge the two arrays
        while (i < sizeL && j < sizeR) {

            // Compare elements
            if (l_array[i] <= r_array[j]) {

                resArray[k] = l_array[i];
                i++;

            } else {

                resArray[k] = r_array[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from left array
        while (i < sizeL) {

            resArray[k] = l_array[i];

            i++;
            k++;
        }

        // Copy remaining elements from right array
        while (j < sizeR) {

            resArray[k] = r_array[j];

            j++;
            k++;
        }

        return resArray;
    }

    // Display Elements Method
    public void displayElements() {

        for (int a : TestArray) {
            System.out.print(a + " ");
        }

        System.out.println();
    }

    // Perform Merge Sort Method
    public void performMergeSort(int[] num) {

        this.TestArray = new int[num.length];

        TestArray = sortElements(num);
    }
}