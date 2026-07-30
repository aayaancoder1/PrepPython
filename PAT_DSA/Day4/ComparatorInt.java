import java.util.*;

public class ComparatorInt {
    public static void main(String arg[]){
        ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(90, 87, 55, 12, 4, 11));
        System.out.println(arrL + " ");
        Comparator<Integer> cmp = (Integer a, Integer b) -> {
            if (a % 10 > b % 10){       // checking unit digit
                return 1;               // swap
            }
            else{
                return -1;              // not swap
            }
        };

        Collections.sort(arrL, cmp);    // changing default comparator with the created one
        System.out.println(arrL);
    }
}