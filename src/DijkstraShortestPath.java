// A Java program for Dijkstra's single source shortest path
// algorithm. The program is for adjacency matrix representation of the graph.

class DijkstraShortestPath {

    private static final int NO_PARENT = -1;

    // Function that implements Dijkstra's single source shortest path
    // algorithm for a graph represented using adjacency matrix representation
    private static void dijkstra(int[][] overallMatrixOrMap, int startVertex) {
        int vertexTotal = overallMatrixOrMap[0].length;

        // shortestDistances[i] will hold the shortest distance from src to i
        int[] shortestDistances = new int[vertexTotal];

        /* visitedVertexBool[i] will be true if vertex i is included in shortest path tree
         or shortest distance from src to i is finalized */
        boolean[] visitedVertexBool = new boolean[vertexTotal];

        // Initialize all distances as INFINITE and visitedVertexBool[] as false
        for (int vertexIndex = 0; vertexIndex < vertexTotal; vertexIndex++) {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            visitedVertexBool[vertexIndex] = false;
        }

        // Distance of source vertex from itself is always 0
        shortestDistances[startVertex] = 0;

        // Parent array to store shortest path tree
        int[] parents = new int[vertexTotal];

        // The starting vertex does not have a parent
        parents[startVertex] = NO_PARENT;

        // Find shortest path for all vertices
        for (int i = 1; i < vertexTotal; i++) {

            /* Pick the minimum distance vertex from the set of vertices not yet
            processed. nearestVertex is always equal to startNode in first iteration.*/
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0; vertexIndex < vertexTotal; vertexIndex++) {
                if (!visitedVertexBool[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }

            // Mark the picked vertex as processed
            visitedVertexBool[nearestVertex] = true;

            // Update dist value of the adjacent vertices of the picked vertex.
            for (int vertexIndex = 0; vertexIndex < vertexTotal; vertexIndex++) {
                int edgeDistance = overallMatrixOrMap[nearestVertex][vertexIndex];

                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                }
            }
        }

        printSolution(startVertex, shortestDistances, parents);
    }

    // A utility function to print the constructed distances array and shortest paths
    private static void printSolution(int startVertex, int[] distances, int[] parents) {
        int vertexTotal = distances.length;
        System.out.print("Vertex\t Distance\tPath");

        for (int vertexIndex = 0; vertexIndex < vertexTotal; vertexIndex++) {
            if (vertexIndex != startVertex) {
                System.out.print("\n" + startVertex + " -> " +vertexIndex + " \t\t "+ distances[vertexIndex] + "\t\t");
                printPath(vertexIndex, parents);
            }
        }
    }

    // Function to print shortest path from source to currentVertex using parents array
    private static void printPath(int currentVertex, int[] parents) {
        // Base case : Source node has been processed
        if (currentVertex == NO_PARENT){
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");
    }

    // Driver Code
    public static void main(String[] args) {
        int[][] overallMatrixOrMap = {
            //    0  1   2  3   4   5   6  7   8    : [ To : (horizontal) ]
                { 0, 4,  0, 0,  0,  0,  0, 8,  0 },  //0 [ From : (vertical)
                { 4, 0,  8, 0,  0,  0,  0, 11, 0 },  //1
                { 0, 8,  0, 7,  0,  4,  0, 0,  2 },  //2
                { 0, 0,  7, 0,  9,  14, 0, 0,  0 },  //3
                { 0, 0,  0, 9,  0,  10, 0, 0,  0 },  //4
                { 0, 0,  4, 14, 10, 0,  2, 0,  0 },  //5
                { 0, 0,  0, 0,  0,  2,  0, 1,  6 },  //6
                { 8, 11, 0, 0,  0,  0,  1, 0,  7 },  //7
                { 0, 0,  2, 0,  0,  0,  6, 7,  0 }   //8
        };
        dijkstra(overallMatrixOrMap, 8);
    }
}

// This code is contributed by Harikrishnan Rajan