import java.util.*;

class TopologicalSort {
    private int V; // number of vertices
    private LinkedList<Integer> adj[]; // adjacency list

    TopologicalSort(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void topologicalSort() {
        int[] inDegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int node : adj[i]) {
                inDegree[node]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        int count = 0;
        List<Integer> topOrder = new ArrayList<>();

        while (!queue.isEmpty()) {
            int u = queue.poll();
            topOrder.add(u);

            for (int node : adj[u]) {
                if (--inDegree[node] == 0) {
                    queue.add(node);
                }
            }
            count++;
        }

        if (count != V) {
            System.out.println("There exists a cycle in the graph");
            return;
        }

        System.out.println("Topological Sort: " + topOrder);
    }

    public static void main(String[] args) {
        TopologicalSort g = new TopologicalSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(3, 1);
        g.addEdge(2, 3);
        g.addEdge(1, 0);
        g.topologicalSort();
    }
}
