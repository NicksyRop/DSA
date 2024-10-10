package datastructures.classes.quiz3;

/**
 * @author nnkipkorir
 * created 10/10/2024
 */
/*
Find Kth Node From End ( ** Interview Question)
Implement a method called findKthFromEnd that returns the k-th node from the end of the list.

If the list has fewer than k nodes, the method should return null.
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


    //todo : here
    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    /*
    This code defines a method called findKthFromEnd inside a LinkedList class, which takes an integer k as input and returns the kth node from the end of the LinkedList.
The method initializes two pointers, slow and fast, both pointing to the head of the LinkedList.

It then moves the fast pointer k steps ahead in the LinkedList. If fast becomes null at any point during this process, it means that k is out of bounds (greater than the length of the LinkedList), so the method returns null.

After moving the fast pointer k steps ahead, the method enters a while loop. This loop continues until the fast pointer reaches the end of the LinkedList (i.e., fast becomes null).

Inside the while loop, both the slow and fast pointers move one step at a time. Since the fast pointer is already k steps ahead of the slow pointer, when the fast pointer reaches the end of the LinkedList, the slow pointer will be at the kth node from the end.

Finally, the method returns the slow pointer, which now points to the kth node from the end of the LinkedList.
     */
}
