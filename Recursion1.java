public class Recursion1 {
    public static void main(String[] args) {
//        write a function that takes a number and print it
//        print  1  2  3  4  5
        print(1);
    }
    static void print(int n){
        System.out.println(n);
        print1(2);
    }
    static void print1(int n){
        System.out.println(n);
        print2(3);
    }
    static void print2(int n){
        System.out.println(n);
        print3(4);
    }
    static void print3(int n){
        System.out.println(n);
        print4(5);
    }
    static void print4(int n){
        System.out.println(n);
    }
}
