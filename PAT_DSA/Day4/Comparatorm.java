import java.util.*;

public class Comparatorm {
    public static void main(String arg[]){
        ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(90, 87, 55, 12, 4, 11));
        System.out.println(arrL + " ");
        Comparator<Integer> cmp = (Integer a, Integer b) -> {
            if (a % 10 > b % 10){
                return 1;
            }
            else{
                return -1;
            }
        };

        Collections.sort(arrL, cmp);
        System.out.println(arrL);
    }
}