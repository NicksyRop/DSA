package datastructures.classes;

import java.util.Hashtable;

public class Main {
    public static void methodThree(){
        System.out.println("Three");
    }
    public static void methodTwo(){
        methodThree();
        System.out.println("Two");
    }
    public static void methodOne(){
        methodTwo();
        System.out.println("One");
    }

    public static int factorial(int n){
        if(n == 1){ //base case - where function call stops
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {

        Cookie cookie1 = new Cookie("Green");
        Cookie cookie2 = new Cookie("Blue");
        cookie2.setColor("green");

       // System.out.println(cookie1.getColor());
      //  System.out.println(cookie2.getColor());

        LinkedList linkedList = new LinkedList(2);
        linkedList.append(3);
        linkedList.append(5);
       // System.out.println("Head " +  linkedList.getHead().value);
      //  System.out.println("Tail " + linkedList.getTail().value);

        //todo : we have two items in the node (remove last three times) [2,3]
      //  System.out.println(linkedList.removeLast().value); // returns the value  3
      //  System.out.println(linkedList.removeLast()); // returns a node
       // System.out.println(linkedList.removeLast()); // todo returns null (first edge case)

        //todo: prepend
        linkedList.prepend(1);

        //todo: remove first [ prints 2, 3 ]
        linkedList.removeFirst();

        //todo: insert
        linkedList.set(0,3);

        //todo: insert
        linkedList.insert(2,6);

        //todo: remove
        linkedList.remove(2);

        //todo: print the first index
        System.out.println("index zero " + linkedList.get(0).value);
        linkedList.printList();

        //todo: reverse a linked list
        linkedList.reverse();
        System.out.println("Reverse");
        linkedList.printList();


        Stack myStack = new Stack(4);
        myStack.getHeight();
        myStack.getTop();
        //todo: push a node to a stack
        myStack.push(3);
        myStack.push(5);
        myStack.push(1);
        myStack.pop();
        myStack.printStack();


        Queue queue = new Queue(4);
        System.out.println("queue");
        //todo: removes the last node
        queue.enqueue(5);
        //todo: removes the first node
        queue.dequeue();
//        queue.getLast();
//        queue.getFirst();
        queue.print();

        System.out.println("Binary search tree");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(47);
        bst.insert(21);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);
        bst.insert(27);
        System.out.println("value at is :" + bst.root.left.right.value);
        System.out.println("Contains value  21 ? " + bst.contains(21));


        System.out.println("call stack output");
        methodOne();

        System.out.println("Factorial");
        int myf = factorial(4);
        System.out.println(myf);

        System.out.println("Graphs");
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A","B");
        //todo : remove edge
       // graph.removeEdge("A","B");
        //todo:remove vertex
        graph.removeVertex("B");
        graph.printGraph();
        System.out.println("Hashtable");
        Hashtable ht = new Hashtable();

        System.out.println("Heap");
        Heap heap = new Heap();
        heap.insert(95);
        heap.insert(75);
        heap.insert(80);
        heap.insert(55);
        heap.insert(60);
        heap.insert(50);
        heap.insert(65);
        System.out.println(heap.getHeap());

        //todo remove value from heap i.e element at index 0
        heap.remove();
        System.out.println(heap.getHeap());
        //output
       // [95, 75, 80, 55, 60, 50, 65]
        // [80, 75, 65, 55, 60, 50]

        //todo: insert
        heap.insert(120);

        System.out.println("Doubly linked list");
        DoublyLinkedList myDll = new DoublyLinkedList(7);
       // myDll.getHead();
       // myDll.getTail();
      //  myDll.getLength();
        myDll.append(8);
        myDll.append(9);
        //todo: prepend
        myDll.prepend(10);
        myDll.removeLast();
        myDll.renoveFirst();
        myDll.append(9);
        myDll.append(10);
        //todo: get element
        System.out.println("element at index zero :" +myDll.get(0).value);
      //  System.out.println(myDll.removeLast().value);
        myDll.prinList();
        }
}