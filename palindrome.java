public class palindrome {
    public static void main(String[] args) {
        String name = "abccba";
        System.out.println(isSame(name));
    }
    static boolean isSame(String str){
        str = str.toLowerCase();
        str.contains(str);
        if(str.length() == 0){
            return true;
        }
        for(int i=0;i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
