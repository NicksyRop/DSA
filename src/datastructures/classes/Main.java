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
       // System.out.println("Head " +  linkedList.getHead().value);
      //  System.out.println("Tail " + linkedList.getTail().value);

        //todo : we have two items in the node (remove last three times) [2,3]
      //  System.out.println(linkedList.removeLast().value); // returns the value  3
      //  System.out.println(linkedList.removeLast()); // returns a node
       // System.out.println(linkedList.removeLast()); // todo returns null (first edge case)

        //todo: prepend
        linkedList.prepend(1);
        linkedList.printList();
    }
}