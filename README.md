# Data-Structures-and-Algortithms

Here's a concise description of each algorithm presented earlier, in a pointwise format:

### 1. Dijkstra's Algorithm
- **Purpose:** Finds the shortest path from a source vertex to all other vertices in a graph with non-negative weights.
- **Method:**
  - Initialize distances from the source to all vertices as infinite, except for the source itself (distance = 0).
  - Use a priority queue to explore the nearest vertex.
  - Update distances for adjacent vertices if a shorter path is found.

### 2. Prim's Algorithm
- **Purpose:** Finds the Minimum Spanning Tree (MST) of a weighted undirected graph.
- **Method:**
  - Start with an arbitrary vertex, mark it as part of the MST.
  - Expand the MST by adding the smallest edge connecting a vertex in the MST to a vertex outside it.
  - Repeat until all vertices are included.

### 3. Kruskal's Algorithm
- **Purpose:** Also finds the Minimum Spanning Tree (MST) of a weighted undirected graph.
- **Method:**
  - Sort all edges by weight.
  - Initialize a forest (disjoint sets).
  - Add edges to the MST in order of weight, ensuring no cycles are formed using union-find data structure.

### 4. Bellman-Ford Algorithm
- **Purpose:** Finds the shortest paths from a source vertex to all other vertices in a graph, allowing negative weights.
- **Method:**
  - Initialize distances from the source.
  - Relax all edges |V| - 1 times, where |V| is the number of vertices.
  - Check for negative-weight cycles by attempting to relax edges again.

### 5. Knapsack Problem
- **Purpose:** Maximizes the total value of items placed in a knapsack of limited capacity.
- **Method:**
  - Use dynamic programming to keep track of maximum value for each capacity.
  - For each item, decide whether to include it based on weight and value compared to current capacity.

### 6. Huffman Coding
- **Purpose:** Compresses data by creating variable-length codes based on the frequency of characters.
- **Method:**
  - Build a priority queue of characters and their frequencies.
  - Create a binary tree, combining the two least frequent nodes until only one node remains.
  - Assign binary codes based on the tree structure.

### 7. Floyd-Warshall Algorithm
- **Purpose:** Finds the shortest paths between all pairs of vertices in a weighted graph.
- **Method:**
  - Initialize a distance matrix.
  - Use three nested loops to update the matrix based on potential intermediate vertices.
  - Results indicate shortest paths or infinite distance if no path exists.

### 8. Topological Sorting (Kahn's Algorithm)
- **Purpose:** Orders the vertices of a Directed Acyclic Graph (DAG) in a linear sequence.
- **Method:**
  - Compute in-degrees for all vertices.
  - Use a queue to process vertices with zero in-degree.
  - Add processed vertices to the topological order and update in-degrees accordingly.

### 9. Binary Search
- **Purpose:** Efficiently finds the position of a target value in a sorted array.
- **Method:**
  - Initialize left and right pointers.
  - Calculate the mid-point, comparin




  
 




  


