import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1, -3, 5, 6, 8, 9, 12, 33, 55, 77, 99, -11};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 3, 2, -1};
        int target = 22;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static  int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            // Find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                // return my ans
                return mid;
            }
        }
        return -1;
    }
}
