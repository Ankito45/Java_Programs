package Core_Java;

import java.util.Scanner;

public class SumofElements {
    public static void main(String[] args) {
        int sum1=0;
        for(int i=9;i<=899;i++){
            sum1+=i;
        }
        System.out.println(sum1);
        int sum2 = 0;
        for(int i=1;i<=1000;i+=2){
            sum2+=i;
        }
        System.out.println(sum2);
        int sum3 = 0;
        for(int i=7;i<=1000;i+=7){
            sum3+=i;
        }
        System.out.println(sum3);
        int sum4 = 0;
        for(int i=1;i<=100;i++){
            sum4+=(i*i);
        }
        System.out.println(sum4);
    }
}
