/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */

public class BubbleSortTest {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 4, 2, 1, 7, 6};

        BubbleSort bubbleSort = new BubbleSort(numbers);

        System.out.println("Before Sorting:");
        bubbleSort.print();

        System.out.println("\n\nBubble Sort:");
        bubbleSort.sort();

        System.out.println("\nAfter Sorting:");
        bubbleSort.print();
    }
}
