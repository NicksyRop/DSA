package datastructures.classes;

/**
 * @author nnkipkorir
 * created 17/10/2024
 */

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int Value) {
    Node newNode = new Node(Value);
    head = newNode;
    tail = newNode;
    length = 1;
    }

    class Node {
        int value;
        Node next;
        Node prev;
        public Node(int value) {
            this.value = value;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        //empty linked list
        if(length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail; //make a pointer that points back to the tail
            tail = newNode; //update tail to be newly added node
        }
        length++;
    }

    public Node removeLast(){
        Node temp = tail;
        if(length == 0) {
            return null;
        }else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null; //disconnect arrow that pointed back to prev node
        }
        length--;
        if (length == 1) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node renoveFirst(){
        Node temp = head;
        if(length == 0) {
            return null;
        }else {

            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public void prinList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("length: " + length);
    }
}
