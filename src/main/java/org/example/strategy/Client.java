package org.example.strategy;

public class Client {
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext(new BubbleSort());
        sortingContext.sort(new int[3]);
        SortingContext sortingContext1 = new SortingContext(new QuickSort());
        sortingContext1.sort(new int[3]);
    }
}
