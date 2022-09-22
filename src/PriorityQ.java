/*Priority Queue

In priority queue, the elements are ordered according to the key values.
The element with the lowest key value may be the head of the queue
or it may be the last element in the queue depending on the programming language.

poll() removes the element with the largest priority value
*/

import java.util.Comparator;
        import java.util.PriorityQueue;

public class PriorityQ{

    public static void main(String[] args){

        int initialCapacity = 10;

        PriorityQueue<String> priorityQueue =  new PriorityQueue<String>(
            initialCapacity,
            new Comparator<String>(){
                public int compare(String car1, String car2) {
                    int price1 = Integer.parseInt(car1.split(":")[1].trim());
                    int price2 = Integer.parseInt(car2.split(":")[1].trim());
                    return price2 - price1;
                }
            }
        );

        //Add elements to the PriorityQueue
        priorityQueue.add("Maserati GranTurismo: 523000");
        priorityQueue.add("MINI Cooper: 150800");
        priorityQueue.add("Lexus: 220000");
        priorityQueue.add("McLaren: 998000");
        priorityQueue.add("Ferrari: 1160000");
        priorityQueue.add("RangeRover: 180000");

        System.out.println("[BEFORE] The size of the priorityQueue is : "+priorityQueue.size());

        //Get the head
        System.out.println("\nThe head is : "+ priorityQueue.poll());

        /*while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }*/

        System.out.println("\n[AFTER] The size of the priorityQueue is : "+priorityQueue.size());




    }

}