import java.util.*;

public class DijkstraAlgoShortestPath00{

    public static void computePaths(Node source){

        source.shortestDistance = 0;

        int initialCapacity = 20;

        PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>(
                initialCapacity,
                new Comparator<Node>(){
                    //override compare method
                    public int compare(Node i, Node j){
                        if(i.f_scores > j.f_scores){
                            return 1;
                        }
                        else if (i.f_scores < j.f_scores){
                            return -1;
                        }
                        else{
                            return 0;
                        }
                    }

                }
        );

        priorityQueue.add(source);

        while(!priorityQueue.isEmpty()){
            Node currentNode = priorityQueue.poll();

			/*visit the adjacencies, starting from
			the nearest node(smallest shortestDistance)*/

            for(Edge e: currentNode.adjacencies){

                Node destination = e.target;
                double weight = e.weight;

                //relax(u,v,weight)
                double distanceFromCurrentNode = currentNode.shortestDistance+weight;
                if(distanceFromCurrentNode<destination.shortestDistance){

					/*remove v from priorityQueue for updating
					the shortestDistance value*/
                    priorityQueue.remove(destination);
                    destination.shortestDistance = distanceFromCurrentNode;
                    destination.parent = currentNode;
                    priorityQueue.add(destination);

                }
            }
        }
    }

    public static List<Node> getShortestPathTo(Node target){

        //trace path from target to source
        List<Node> path = new ArrayList<Node>();
        for(Node node = target; node!=null; node = node.parent){
            path.add(node);
        }

        //reverse the order such that it will be from source to target
        Collections.reverse(path);

        return path;
    }

    public static void main(String[] args){

        //initialize the graph base on the Romania map
        Node n1 = new Node("Arad");
        Node n2 = new Node("Zerind");
        Node n3 = new Node("Oradea");
        Node n4 = new Node("Sibiu");
        Node n5 = new Node("Fagaras");
        Node n6 = new Node("Rimnicu Vilcea");
        Node n7 = new Node("Pitesti");
        Node n8 = new Node("Timisoara");
        Node n9 = new Node("Lugoj");
        Node n10 = new Node("Mehadia");
        Node n11 = new Node("Drobeta");
        Node n12 = new Node("Craiova");
        Node n13 = new Node("Bucharest");
        Node n14 = new Node("Giurgiu");

        //initialize the edges
        n1.adjacencies = new Edge[]{
                new Edge(n2,75),
                new Edge(n4,140),
                new Edge(n8,118)
        };

        n2.adjacencies = new Edge[]{
                new Edge(n1,75),
                new Edge(n3,71)
        };

        n3.adjacencies = new Edge[]{
                new Edge(n2,71),
                new Edge(n4,151)
        };

        n4.adjacencies = new Edge[]{
                new Edge(n1,140),
                new Edge(n5,99),
                new Edge(n3,151),
                new Edge(n6,80),
        };

        n5.adjacencies = new Edge[]{
                new Edge(n4,99),
                new Edge(n13,211)
        };

        n6.adjacencies = new Edge[]{
                new Edge(n4,80),
                new Edge(n7,97),
                new Edge(n12,146)
        };

        n7.adjacencies = new Edge[]{
                new Edge(n6,97),
                new Edge(n13,101),
                new Edge(n12,138)
        };

        n8.adjacencies = new Edge[]{
                new Edge(n1,118),
                new Edge(n9,111)
        };

        n9.adjacencies = new Edge[]{
                new Edge(n8,111),
                new Edge(n10,70)
        };

        n10.adjacencies = new Edge[]{
                new Edge(n9,70),
                new Edge(n11,75)
        };

        n11.adjacencies = new Edge[]{
                new Edge(n10,75),
                new Edge(n12,120)
        };

        n12.adjacencies = new Edge[]{
                new Edge(n11,120),
                new Edge(n6,146),
                new Edge(n7,138)
        };

        n13.adjacencies = new Edge[]{
                new Edge(n7,101),
                new Edge(n14,90),
                new Edge(n5,211)
        };

        n14.adjacencies = new Edge[]{
                new Edge(n13,90)
        };

        Node[] nodes = {n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14};

        //compute paths
        computePaths(n1);

        //print shortest paths

		/*for(Node n: nodes){
			System.out.println("Distance to " +
				n + ": " + n.shortestDistance);
    		List<Node> path = getShortestPathTo(n);
    		System.out.println("Path: " + path);
		}*/

        List<Node> path = getShortestPathTo(n13);
        System.out.println("Path: " + path);

    }

}