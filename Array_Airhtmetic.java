package corejava;

import java.util.Arrays;

public class Array_Airhtmetic {

	public static void main(String[] args) {
		int[] arr1 = {2,7,8,9};
		int[] arr2 = {11,77,6,44};
//		int[] arr3 = new int[4];
		int[] arr3 = new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i] = arr2[i] + arr1[i]; //Adding
		}
		for(int j=0;j<=arr3.length-1;j++) {
			System.out.println("Arrays Elements are :"+arr3[j]);
		}
	}
}
