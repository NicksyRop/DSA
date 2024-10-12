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

    public boolean contains(int value) {
        //todo: the line below is not necessary since , the first step in the while checks for this and iuf true the loop will stop running and we return false
        if(root == null){ //return false if tree has no values
            return false;
        }
        //creat a temp variable equal to root initially
        Node temp = root;
        while (temp != null) {
            if(value < temp.value) { //go left if value is less than temp
                temp = temp.left; //todo: if true the while loop will run again after updating temp

            }else if(value > temp.value) {//go right if value is greater
                temp = temp.left;

            }else { // when the while loop run and finds temp equal to value it returns true
                return true; //return true this means the values are equal
            }
        }
        return false; //todo (if we break out of the will loop
                      //todo:  ( we have traversed and not found the value , we will  break out of the loop) return false
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
