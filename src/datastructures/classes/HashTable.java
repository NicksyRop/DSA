package datastructures.classes;

/**
 * @author nnkipkorir
 * created 14/10/2024
 */

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
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

    public void printTable(){
        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null){
                System.out.print(" {" + temp.key + ":" + temp.value + "} ");
                temp = temp.next;
            }
        }
    }
}
