package datastructures.classes.quiz1;

/**
 * @author nnkipkorir
 * created 10/10/2024
 */

/*
Find Middle Node ( ** Interview Question)
Implement a method called findMiddleNode that returns the middle node of the linked list.

If the list has an even number of nodes, the method should return the second middle node

When the linked list has an odd number of nodes, like 1 -> 2 -> 3 -> 4 -> 5, the function will find the exact middle node. In this case, it will return the node containing the value 3.

When the linked list has an even number of nodes, there will be two middle nodes. The findMiddleNode function will return the second of these two middle nodes.
 */

public class LinkedList {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    //todo here
    public  Node findMiddleNode(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){ //loop will stop when condition is false
            slow = slow.next; //slow moves one step
            fast = fast.next.next; //fast moves two steps
        }
        return slow;
    }
    /*
    This algorithm uses the slow and fast pointer technique,
     also known as Floyd's Tortoise and Hare algorithm, to find the middle element of the linked list.
     */
}
