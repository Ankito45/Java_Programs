public class Recursion {
    public static void main(String[] args) {
        // write a function to print hello world 5 times
        msg();
    }
    static void msg(){
        System.out.println("Hello World");
        msg1();
    }

    static void msg1(){
        System.out.println("Hello World");
        msg2();
    }

    static void msg2(){
        System.out.println("Hello World");
        msg3();
    }

    static void msg3(){
        System.out.println("Hello World");
        msg4();
    }

    static void msg4(){
        System.out.println("Hello World");
    }
}
