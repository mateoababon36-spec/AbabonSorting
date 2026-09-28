/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class SelectionSortTest {
    public static void main(String[] args) {
        int[] arr = {13, 32, 26, 9, 33, 18};
        
        System.out.println("original array:");
        for (int num : arr){
            System.out.println(num + " ");
        }
        SelectionSort.selectionSort(arr);
        
        System.out.println("\nSorted Array:");
        for (int num : arr){
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
