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

    public boolean addEdge(String vertex1, String vertex2) {
        //first check if the vertices exist
        if(adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2)!=null) {
            adjacencyList.get(vertex1).add(vertex2); // this will return the array list i.e empty if not linked  [] and add the new vertex
            adjacencyList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
}
