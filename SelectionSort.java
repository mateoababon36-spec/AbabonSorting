/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
 public class SelectionSort {
     public static void selectionSort(int[] arr) {
         for (int i = 0; i < arr.length - 1; i++) {
             int min = i;
             System.out.println("\nPass " + (i + 1) + ": looking for smallest from index " + i);
             
             for (int j = i + 1; j < arr.length; j++) {
                 System.out.print(" Compare arr[" + j + "]=" + arr[j] + " with arr[" + min + "]=" + arr[min]);
                 if (arr[j] < arr[min]) {
                     min = j;
                     System.out.println(" -> arr[" + j + "] is smaller, new min index = " + min);
                 } else {
                     System.out.println(" -> no change");
                 }
             }
             
             if (min != i) {
                 System.out.println(" Swap arr[" + i + "]=" + arr[i] + " and arr[" + min + "]=" + arr[min]);
                 int temp = arr[i];
                 arr[i] = arr[min];
                 arr[min] = temp;
             } else {
                 System.out.println(" No swap, arr[" + i + "] is already the smallest");
             }
             
             System.out.print(" Array now: ");
             for (int num : arr) {
                 System.out.print(num + " ");
             }
             System.out.println();
         }
     }
 }
