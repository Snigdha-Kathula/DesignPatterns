package org.example.strategy;

public class SortingContext {
    public SortingStrategy strategy;

    public SortingContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    public void sort(int[] A){
        strategy.sort(A);
    }
}
