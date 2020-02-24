package graph;
//src: https://www.geeksforgeeks.org/graph-and-its-representations/

import java.util.LinkedList;

public class Graph {

    int V;
    LinkedList<Integer> adjListArray[];


    Graph(int V) {

        this.V = V;

        adjListArray = new LinkedList[V];

        for(int i = 0; i <V; i++){
            adjListArray[i] = new LinkedList<>();
        }
    }

    static void addEdge(Graph graph, int src, int dest){
        graph.adjListArray[src].add(dest);
        graph.adjListArray[dest].add(src);
    }

}


