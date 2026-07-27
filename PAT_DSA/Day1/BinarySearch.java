public class BinarySearch{
    public static void main(String arg[]){
        int arr[] = {2, 5, 9, 12, 18, 22, 34};
        int target = 202;
        int l = 0;
        int r = arr.length - 1;
        boolean flag = true;
        
        while(l <= r){
            int mid = (l + r) / 2;
            if(target == arr[mid]){
                System.out.println("Target found at: " +mid);
                flag = false;
                break;
            }
            else if(target > arr[mid]){
                l = mid + 1;
            }
            else if(target < arr[mid]){
                r = mid - 1;
            }
            else{
                System.out.println("Target not found");
            }
        }
        if(flag){
            System.out.println("Not Found");
        }
    }
}