package datastructures.classes;

/**
 * @author nnkipkorir
 * created 07/10/2024
 */

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

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
        length = 1;

    }


    //   +===================================================+
    //   |                  WRITE YOUR CODE HERE             |
    //   | Description:                                      |
    //   | - Constructor for the LinkedList class.           |
    //   | - Initializes the linked list with a single node. |
    //   |                                                   |
    //   | Parameters:                                       |
    //   | - value: The integer value of the first node in   |
    //   |   the newly created linked list.                  |
    //   |                                                   |
    //   | Behavior:                                         |
    //   | - A new Node is created with the given value.     |
    //   | - This node is set as both the head and tail of   |
    //   |   the list, indicating it is the only node in the |
    //   |   list at creation.                               |
    //   | - The length of the list is initialized to 1.     |
    //   +===================================================+


    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    //create a temp var that points to the head
    //loop through it ( stops when tail.next  is null
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    //adds a node to the last part
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length ++;
    }


    public Node removeLast() {
        //edge cases -> empty list or LinkedList lenth == 1
        if(length == 0) { // ypu can also test with head/tail being null
            return null;
        }
        //initialize two pointers to keep track of two subsequent nodes as we loop
        Node temp = head; // value to be removed
        Node prev = head; // value that becomes the tails

        //todo : this length == 1 edge case wont run this loop and will be catered for in the code after
        // while loop
        while (temp.next != null) { // this loop stop when we arrive at the last node i.e when temp.next is null
            prev = temp;
            temp = temp.next;
        }
        tail = prev; // set value before tail to be tail (removes the last node)
        tail.next = null; // set next value as null
        length --;

        //this means the head and tail still points to node
        // checks for when Linked list has one value
        if (length == 0) {
            head = null;
            tail = null;

        }

        return temp; // returns the value removed
    }

        public void prepend(int value) {
        Node newNode = new Node(value);
        //todo: check for the first edge case if list is null
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else{
          newNode.next = head; // make new node point to head
          head = newNode;
        }

        length ++;
    }

    public Node removeFirst(){
        if (length == 0) {
            return null;
        }else {
            Node temp = head;// create a temp node to hold the first node
            head = head.next;
            temp.next = null; // detatch it from the linked list
            length --;

            if (length == 0) { //remove tail for edge case where list has one value
                tail = null;
            }
            return temp; // return node we removed
        }
    }

    public Node get(int index){
        if( index < 0 || index >=  length ) { // indexes start from zero
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }
    //Replace a node with a new value
    public boolean set(int index, int value) {
        //todo:use the get method to find the node then update values
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public  boolean insert(int index, int value) {
        if( index < 0 || index > length) {
            return false;
        }

        //prepend if index == 0
        if( index == 0) {
            prepend(value);
            return true;
        }
        //append
        if (index == length -1) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp  = get(index -1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }

    public Node remove(int index){
        if(index < 0 || index >= length){ //check for index out of range
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == length -1) {
            return removeLast();
        }

        //to remove node in the middle of a linked list
        // we need to var one pointing at the index (temp) and one one a node before it (prev)
        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head; //create a temp to point to head then swap values i.e head to be to tail and tail to be temp
        head = tail;
        tail = temp;
        //todo create three variables one pointing at value after temp and before (null)  so we swap values
        Node after = temp.next;
        Node before = null;

        for (int i=0; i < length; i++) { //todo (this will keep reversing how the nodes are pointed to
            after = after.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

}


