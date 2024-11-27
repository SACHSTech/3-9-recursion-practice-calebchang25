package recursion;

public class Reverse {
    public static String ReverseString(String s){
        if(s.equals("")){
            return s;
        }
        return ReverseString(s.substring(1,s.length())) + s.substring(0,1);
    }
    public static void main(String[] args) {
        System.out.println(ReverseString("Hello"));
    }
}
