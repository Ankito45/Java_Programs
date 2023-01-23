package Core_Java;

public class Missing_Element {
    public static void main(String[] args) {
        char[] ch = {'A', 'B', 'C', 'D', 'E', 'G', 'H', 'J', 'H', 'Z'};
        for (char c = 'A'; c <= 'Z'; c++) {
            boolean found = false;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(" "+ c + " ");
            }
        }
    }
}
