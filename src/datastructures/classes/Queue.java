package datastructures.classes;

/**
 * @author nnkipkorir
 * created 10/10/2024
 */

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node node = new Node(value);
        first = node;
        last = node;
        length = 1;
    }

    class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public void getFirst(){
        System.out.println("First:" + first.value);
    }

    public void getLast(){
        System.out.println("Last:" + last.value);
    }

    public void length(){
        System.out.println("Length:" + length);
    }

    //add node
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;

        }else {
            last.next = newNode;
            last = newNode;
        }
        length ++;
    }
}
