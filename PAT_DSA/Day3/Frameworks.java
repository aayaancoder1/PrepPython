import java.util.*;
public class Frameworks{
    public static void main(String args[]){
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(10);
        System.out.println("Hash Set : " + hashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);
        System.out.println("Tree Set : " + treeSet);
    }
}