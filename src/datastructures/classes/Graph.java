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

    public boolean removeEdge(String vertex1, String vertex2) {
        if(adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2)!=null) {
            adjacencyList.get(vertex1).remove(vertex2);
            adjacencyList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    //todo: first get the vertices that are lonked to the vertex [ all of them will have edges connected to the vertex
    //hence we can loop as we remove
    /*
    {
        // Node "A" is connected to "B" and "C"
        "A": ["B", "C"],

        // Node "B" is connected to "A"
        "B": ["A"],

        // Node "C" is connected to "A"
        "C": ["A"],

        // Node "D" is connected to "A", "B", and "C"
        "D": ["A", "B", "C"]
    }
     */

    //if we want to remove D , we sure know that it has vertex ABC connected to it
    //so we will loop as we delete the vertex before removing D
    public boolean removeVertex(String vertex) {
        //check if vertex is in the graph
        if(adjacencyList.get(vertex) == null) {
            return false;
        }

        for(String otherVetex : adjacencyList.get(vertex)) { //loop through the array list of D
            adjacencyList.get(otherVetex).remove(vertex); //remove the edges linked to it
        }
        adjacencyList.remove(vertex); // remove the vertex from the hashmap
        return true;
    }

}
