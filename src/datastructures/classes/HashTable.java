package datastructures.classes;

/**
 * @author nnkipkorir
 * created 14/10/2024
 */

public class HashTable {
    private int size = 7; // having it as prime number reduces collision
    private Node[] dataMap; //array of pointer to nodes

    public HashTable() {
        dataMap = new Node[size]; //set size to 7
    }

    public class Node{
        private String key;
        private int value;
        private Node next;
        //to create a node we need to pass a key and value (unlike linked list we passed just a value)
        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] chars = key.toCharArray(); // converts key to array of chars i.e pain = [p,a,i,nt]
        for (int i = 0; i < chars.length; i++) {
            int asciiValie = chars[i];
        }


        // todo : remove below

        return 1;
    }

    public void printTable(){
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }
}
