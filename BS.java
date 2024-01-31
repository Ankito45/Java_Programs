public class BS {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,99};
            int target = 4;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
        if(start > end){
            return -1;
        }
        int m = start + (end-start)/2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr,target,start, m-1);
        }
        return search(arr,target,m+1,end);
    }
}
