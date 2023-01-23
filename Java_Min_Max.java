package Core_Java;

public class Java_Min_Max {
    public static void main(String[] args) {
        int[] arr = {1,5,9,8,2,3,4,6,7,10,11,12,13,14,15,16,17};
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
