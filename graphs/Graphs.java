package graphs;
import java.util.ArrayList;
// Todos:
// 1. Adjacency List
// 2. Adjacency Matrix - TODO
// 3. BFS for undirected graph
// 4. DFS for undirected graph
// 5. DFS for directed graph
// 5. Track discovery time and finish time - time interval = finish - discovery time
// That the amount of time it lives on the stack
// 6. Vertex with last finishing time is the root of the DFS tree
// 7. Back edges in DFS Directed graph represents a cycle
// 8. If we have a cycle we will have a back edge in dfs

// Adjacency List

class Graph {
    public static void createEdge(ArrayList<ArrayList<Integer>> list, int start, int end) {
        list.get(start).add(end);
        // list.get(end).add(start);
    }

    static void displayGraph(ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("\n (" + i + ")");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(" - " + list.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create the graph
        int numOfVertices = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(numOfVertices);
        for (int i = 0; i < numOfVertices; i++) list.add(new ArrayList<Integer>());

        // Add the edges
        createEdge(list, 0, 1);
        createEdge(list, 0, 2);
        createEdge(list, 0, 3);
        createEdge(list, 1, 2);
        createEdge(list, 3, 2);

        displayGraph(list);
    }
}
