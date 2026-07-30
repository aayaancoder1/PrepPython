import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorStr {
    public static void main (String arg[]){
        
        ArrayList<String> str = new ArrayList<>(Arrays.asList("Aayaan", "Kishan", "Khushi", "Shivam"));
        System.out.println(str + " ");
        Comparator<String> cmp = (String a, String b) -> {
             if (a.charAt(0) > b.charAt(0)){// checking first charecter
                 return 1;              // swap
             }
             else{
                 return -1;             // not swap
             }
        };

        Collections.sort(str, cmp);     // changing default comparator with the created one
        System.out.println(str);
    }
}
