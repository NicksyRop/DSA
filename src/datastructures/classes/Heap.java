package datastructures.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nnkipkorir
 * created 16/10/2024
 * Heap is just trea with values of parent being greater than its children
 * We store values in an array where parent will be index 0 , child index 1 and 2 , etc
 * Heaps are used to implement priority queues
 * insert or remove is o(log n)
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

    //todo: always removes and returns the top item
    public Integer remove() {
        if(heap.size() == 0) return null; //when heap is empty
        if(heap.size() == 1) return heap.remove(0); //when heap has one element
        //when we have more than two items in the heap
        //get the first item in the heap
        int maxValue  = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));  //remove the last value and put it on index 0 to make the heap complete  , remove returns the element
        sinkDown(0);
        return maxValue;

    }

    //todo :compares the temp value at with its child elements
    private void sinkDown(int index) {
        int maxIndex = index;
        while(true){
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            if(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)){ //update maxIndex if val of leftIndex is greater than val of maxIndex
                maxIndex = leftIndex;
            }
            //rightIndex < heap.size() - checks if we have a value at that index
        if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)){ //make sure to check if the index on the left has a value / is valid node
                maxIndex = rightIndex;
        }

        if(maxIndex != index){
            swap(index, maxIndex);
            index = maxIndex;
        }else {
            return;
        }
        }
    }
}
