package Core_Java;

public class Pair_Sum {
    public static void main(String[] args) {
        int[] arr = {1,5,9,8,2,3,4,6,7,10,11,12,13,14,15,16,17};
        int k1 = 10 , k2 =20;
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == k1 || arr[i] + arr[j] == k2 ){
                    System.out.println(arr[i] + "," + arr[j] + " = " + k1 + " and " + k2) ;
                }
            }
        }
    }
}
