package com.utility.tree;

public class Main {
    public static void main(String[] args) {
        Utility u = new Utility();

        //int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        Heap h = new Heap(arr);
        h.printHeap();
    }
}
