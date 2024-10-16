package datastructures.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nnkipkorir
 * created 16/10/2024
 * Heap is just trea with values of parent being greater than its children
 * We store values in an array where parent will be index 0 , child index 1 and 2 , etc
 */

public class Heap {
    private List<Integer> heap;
    public Heap() {
        heap = new ArrayList<>();
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }
    private int rightChild(int index) {
        return 2 * index + 2;
    }
    private int parent(int index) {
        return (index - 1) / 2;
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1); //get value at index1
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    //say we want to insert 100 to the heap
    public void insert(int value) {
        heap.add(value); //adds value to the last index
        int current = heap.size() - 1; // points at the index of the inserted value
        while(current > 0 && heap.get(current) > heap.get(parent(current))){ //todo: loop will stop when we are at index 0
            swap(current, parent(current)); // swap the values if the value of current is greater than parent
            current = parent(current);  //update current to point to new index of value after swapping
        }
    }
}
