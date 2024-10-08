package datastructures.classes;

/**
 * @author nnkipkorir
 * created 10/10/2024
 * Stack we pop and pull ( first node )
 */

public class Stack {
    private Node top;
    //private Node bottom; // we dont need the bottom pointer since we add / remove from top o(1)
    private int heigth;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        heigth = 1;
    }

    class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.value+ "\n" );
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Stack top :"+ top.value);
    }

    public void getHeight(){
        System.out.println("Stack height :"+ heigth);
    }

    public void push(int value) {
        Node newNode = new Node(value);
        //todo:empty stack
        if(heigth == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        heigth ++;
    }

    public Node pop() {
        if(heigth == 0){
            return null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        heigth--;
        return temp;
    }
}
