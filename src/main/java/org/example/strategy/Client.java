package org.example.strategy;

public class Client {
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext(new BubbleSort());
        sortingContext.sort(new int[3]);
        SortingContext sortingContext1 = new SortingContext(new QuickSort());
        sortingContext1.sort(new int[3]);
    }
}
//The Strategy Design Pattern is a behavioral design pattern.
//It allows you to dynamically change the behavior of an object by encapsulating
//it into different strategies. This pattern enables an object to choose from multiple
//algorithms and behaviors at runtime, rather than statically choosing a single one.
