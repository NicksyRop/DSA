package datastructures.classes;

/**
 * @author nnkipkorir
 * created 10/10/2024
 * we add ( enqueue ) to the last node
 * we remove the first node
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

    //add node to a queue
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

    //todo : remove the first item in the queue
    public Node dequeue(){
        if(length == 0){
            return null;
        }
        Node temp = first;
        //todo : when we have one item in the queue
        if(length == 1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
        }

        length--;
        return temp;
    }
    public void print(){
     Node temp = first;
     while(temp != null){
         System.out.println(temp.value + "\n");
         temp = temp.next;
     }
    }
}
