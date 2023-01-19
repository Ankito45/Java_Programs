package Core_Java;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number :");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd Number :");
        int b = sc.nextInt();
        System.out.println("Numbers before swapping are " + a + " and " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping the Numbers are " + a + " and " + b);
    }
}
