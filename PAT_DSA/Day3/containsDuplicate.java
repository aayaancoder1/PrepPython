import java.util.*;

public class containsDuplicate{
    public static void main(String arg[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7));
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(arr);

        Iterator<Integer> it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("No nodes exists");
    }
}