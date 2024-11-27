package recursion;

public class Palindrome {
    public static Boolean isPalindrome(String s){
        s = s.toLowerCase();
        if(s.length() == 1 || s.length() == 0){
            return true;
        }
        else if(s.charAt(0) == s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1, s.length()-1));
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Mom"));
    }
}
