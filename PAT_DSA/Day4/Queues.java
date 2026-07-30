import java.util.*;
class Queues{
    public static void main(String arg[]){
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.poll();
        System.out.println("Priority Queue: " + q);
        System.out.println("Peek: " + q.peek());

    }
}