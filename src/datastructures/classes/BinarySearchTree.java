package datastructures.classes;

/**
 * @author nnkipkorir
 * created 11/10/2024
 */

public class BinarySearchTree {
     Node root;  //we do not need a constrictor , this value will be null automatically , remove private so we have visibility
                //we will set value of root in the insert method (initial value will be null)

    class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) { //loop will run unless we return false
            //todo: check for already existing values
            if(newNode.value == temp.value) {
                return false;
            }
            if(newNode.value < temp.value) {
                //todo: insert to left
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }else {
                    //todo: move temp to the next node after root of temp.next is not null
                    temp = temp.left;
                }
            }else {
                //todo: insert to right
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }else {
                    temp = temp.right;
                }

            }
        }
    }
}
