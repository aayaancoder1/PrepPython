public class Searching{
    public static void main(String[] arg){
        int[] arr = new int[10];

        int cnt = 1;

        for (int i = 0; i < 10; i++){
            arr[i] = cnt * cnt;
            cnt++;
        }
        for(int val : arr){
            System.out.print(val)
        }
    }
}