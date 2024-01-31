import java.util.Scanner;

//Bitwise Operator
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a&1) == 1){
            System.out.println("The number given "+ a + " is odd");
        }else{
            System.out.println("The number given "+ a + " is even");
        }
    }
}
