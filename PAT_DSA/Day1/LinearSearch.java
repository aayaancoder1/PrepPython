public class LinearSearch{
    public static void main(String arg[]){
        int[] arr = {2, 3, 5, 52, 23, 6, 8, 85, 45, 43};
        int target = 5;
        boolean flag = false;
        int i = 0;
        for (i = 0; i < arr.length; i++){
            if (arr[i] == target){
                //System.out.println("Target found at: " +i);
                flag = true;
            }
        } 
        System.out.println(flag ? "Target found at: " + i : "target not found");
    }
}