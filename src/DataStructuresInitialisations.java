public class DataStructuresInitialisations {

/*


    Array.

Arrays are collections of data items that are of the same type, stored together in adjoining memory locations. Each data item is known as an “element.” Arrays are the most basic, fundamental data structure. Aspiring Data Scientists should master array construction before moving on to other structures such as queues or stacks.

    Graphs.

Graphs are a nonlinear pictorial representation of element sets. Graphs consist of finite node sets, also called vertices, connected by links, alternately called edges. Trees, mentioned below, are a graph variation, except the latter has no rules governing how the nodes connect.

    Hash Tables.

Hash tables, also called hash maps, can be used as either a linear or nonlinear data structure, though they favor the former. This structure is normally built using arrays. Hash tables map keys to values. For example, every book in a library has a unique number assigned to it that facilitates looking up information about the book, like who has checked it out, its current availability, etc. The books in the library are hashed to a unique number.

    Linked List.

Linked lists store item collections in a linear order. Each element in a linked list contains a data item and a link, or reference, to the subsequent item on the same list.

    Stack.

Stacks store collections of items in a linear order and are used when applying the operations. For example, the order could be “first in, first out” (FIFO) or “last in, first out” (LIFO).



    Queue.

Queues store item collections sequentially like stacks, but the operation order must be “first in, first out” only. Queues are linear lists.

Also Read: Queue Implementation Using Array

    Tree.

Trees store item collections in an abstract hierarchy. They are multilevel data structures that use nodes. The bottom nodes are called “leaf nodes,” while the topmost node is known as the “root node.” Each node has pointers that point to adjacent nodes.


        {

        Types of Trees in Data structure
            General Tree

            A tree is considered a general tree if its hierarchy is not constrained. There is no limit on the number of children that a node can have in the General Tree. All other trees are subsets of the tree.
            Binary Tree

            A binary tree is a sort of tree data structure in which each parent node has no more than two child nodes. As the name implies, binary means two, therefore each node might have zero, one, or two nodes. The popularity of this tree is higher than that of most others. A Binary tree may be modified to accommodate certain limitations and features, such as by using the AVL tree, the BST tree, the RBT tree, and others. We will go through all of these styles in depth as we progress.
            Binary Search Tree

            These tree data structures are non-linear, with one node connecting to several others. At most two child nodes can be attached to the node. A binary search tree is so named because:

                Each node can have up to two child nodes.
                It may be utilized to search for an element in 0(log(n)) time and is hence referred to as a search tree.

            AVL Tree

            The AVL tree is a self-balancing binary search tree. Adelson-Velshi and Landis are the inventors behind the term AVL. Dynamically balanced trees were first created here. Based on whether the AVL tree is balanced or not, each node is assigned a balancing factor. The node kids have a maximum height of one AVL vine. The right balance factors in the AVL tree are 1, 0, and -1. If a new node is added to the tree, it will be rotated to ensure that it is balanced. Then it will be rotated. In the AVL tree, common operations like viewing, insertion, and removal require O(log n) time. It is usually used while doing Lookups activities.
            B Tree

            A B Tree is a more generic binary search tree. A height-balanced m way tree refers to this type of tree, where m denotes the order of the tree. Each tree node can have multiple keys and more than two child nodes. The leaf nodes of a binary tree may not be at the same level. It is important that all leaf nodes in a B Tree be equal in height.
            Types of Graphs
            The Null Graph

            The order zero graphs is another name for the Null Graph. A graph with an empty edge set is referred to as a "null graph." As the name implies, a null graph has 0 edges and consists only of isolated vertices.
            Trivial Graph

            If a graph contains only one vertex, it is called a trivial graph. One vertex is all that is needed to construct the trivial graph, which is the smallest possible graph.
            The Finite Graph

            If the number of vertices and edges in the graph is restricted, the graph is termed a finite graph.
            Infinite Graph

            If the number of vertices and edges in the graph is infinite, the graph is called finite.
            Graph With Directions

            Digraphs is another term for directed graphs. A graph is called a directed graph or digraph if all of the edges connecting any of its vertices or nodes are directed or have a definite direction. By directed edges, we mean graph edges that have a direction to indicate where they begin and where they stop.
            Simple Graph

            Every pair of nodes or vertices in a simple graph has just one edge connecting them. As a consequence, only one edge connects two vertices, illustrating one-to-one interactions between two components.
            Multiple Graphs

            When there are many edges connecting two vertices in a graph G= (V, E), the graph is called a multigraph. A Multigraph has no self-loops.
            Complete Graph

            A graph is complete if it is a simple graph. Edges having an n number of vertices must be linked. It is also known as a complete graph since the degree of each vertex must be n-1.
            Pseudo Graph

            A pseudograph is one that has a self-loop in addition to other edges.
            Regular Graph

            A regular graph is one such category of graph type that is a simple graph along with the exact same value of the degree at each of the vertices. As a result, every graph on its whole is a regular graph.
            Bipartite Graph

            Bipartite graphs can be divided into two non-empty disjoint parts with the same vertex set. V1(G) and V2(G) so that each edge e of E(G) has one end in V1(G) and the other end in V2(G) (G). Bipartite of G refers to the partition V1 U V2 = V.
            Weighted Graph

            A labeled or weighted graph is one with each edge having a value or weight expressing the expense of crossing that edge.
            Connected Graph

            The graph is linked if there is a path connecting one vertex of a graph data structure to any other vertex.
            Disconnected Graph

            When there is no edge connecting the vertices, the null graph is referred to as a disconnected graph.
            The Cyclic Graph

            A graph is termed cyclic if it has at least one graph cycle.
            Acyclic Graph

            A graph is said to be acyclic if it contains no cycles.
            Acyclic Directed Graph

            It is a type of graph data structure which has directed edges but no cycle, and it is also termed a DAG. The full form of DAG is a directed acyclic graph. Because it guides the vertices and maintains certain data, it depicts the edges with an ordered pair of vertices.
            Subgraph

            A subgraph is a set of vertices and edges in one graph that are subsets of another.

        }


        Trie.

        Not to be confused with a Tree, Tries are data structures that store strings like data items and are placed in a visual graph. Tries are also called keyword trees or prefix trees. Whenever you use a search engine and receive autosuggestions, you’re witnessing the trie data structure in action.




        ALGORITHMS :

    Dynamic programming: Computes solutions with smaller instances to construct solutions (e.g: recursion)

    Greedy programming: Computes solutions with locally optimum for each step. This means we might be focusing on local optima rather than global optima (e.g: gradient descent in Artificial Neural Network — ANN)

    Divide and conquer: Divide problems into smaller subproblems. Then upon solving each subproblem, we can reflect the solution to the whole problems (e.g: mergesort)

    Sorting: Brute force always produces O(n²) — insertion sort,bubble sort while optimal sorting should produce quasi-linear O(n log n) — quick sort, merge sort (more info)

    Breadth First Search: Traverse trees starting from initial depth to incrementally higher depth. This is useful in finding solutions to Minimum Spanning Tree (MST) problems.

    Depth First Search: Traverse trees starting from initial left to right subtree based on covering all depths first.

    Dijkstra: Algorithms to find shortest paths in graphs. A* is a heuristics that is built on top of the Dijkstra algorithm.




*/

}
