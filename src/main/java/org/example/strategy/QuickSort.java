package org.example.strategy;

public class QuickSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Array sorted using Quick Sort");
    }
}
