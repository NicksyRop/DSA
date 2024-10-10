package datastructures.classes;

public class Main {
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
        myStack.printStack();

    }
}