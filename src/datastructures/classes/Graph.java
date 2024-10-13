package datastructures.classes;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author nnkipkorir
 * created 13/10/2024
 */

public class Graph {
    //create an empty hashmap to store our adjacency list {}
    private HashMap<String, ArrayList<String>> adjacencyList = new HashMap<>();

    public void printGraph(){
        System.out.println(adjacencyList);
    }

    public boolean addVertex(String vertex) {
        //first check if the vertex is already in the graph
        if(adjacencyList.get(vertex) == null) {
            adjacencyList.put(vertex, new ArrayList<>()); //i.e { "A": [] } //TODO must add new key word to create empty list
            return true;
        }
        return false;
    }
}
