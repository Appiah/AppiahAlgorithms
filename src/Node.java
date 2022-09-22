public class Node {

    public final String value;
    public double g_scores;
    public /*final*/ double h_scores;
    public double f_scores = 0;
    public Edge[] adjacencies;
    public Node parent;
    public double shortestDistance = Double.POSITIVE_INFINITY;

    public Node(String val, double hVal){
        value = val;
        h_scores = hVal;//h scores is the stright-line distance from the currentNode
    }

    public Node(String val){
        value = val;
    }

    public String toString(){
        return value;
    }

    public int compareTo(Node other){
        return Double.compare(shortestDistance, other.shortestDistance);
    }

}
