import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;


public class taskPQueue {
    /*You are given a stream of integers. At any point, you need
to keep track of the k largest elements seen so far using a
PriorityQueue.

Read numbers one by one from the list.

Maintain a PriorityQueue of size k = 3.

After processing all numbers, print the 3 largest
elements. */
    public static void main(String arg[]){
//=========Smalest Element=============
        // ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(1, 2, 6, 8, 3, 34, 536));
        // PriorityQueue<Integer> q = new PriorityQueue<>();
        // PriorityQueue<Integer> q2 = new PriorityQueue<>();
        // int k = 3;
        // for (int i = 0; i < arrL.size(); i++){
        //     q.offer(arrL.get(i));
        // }
        // for(int i = 0; i < k; i++){
        //     q2.offer(q.poll());
        // }
        // System.out.println("3 Smallest elements are: " + q2);

//========Largest Elements=============
        ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(1, 2, 6, 8, 3, 34, 536));
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int k = 3;
        for (int i = 0; i < arrL.size(); i++){
            q.offer(arrL.get(i));
            if(q.size() > k){
                q.poll();
            }
        }

        System.out.println("3 Largest elements are: " + q);
    }
}
