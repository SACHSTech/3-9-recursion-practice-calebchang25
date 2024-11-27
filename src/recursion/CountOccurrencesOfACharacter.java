package recursion;

public class CountOccurrencesOfACharacter {
    public static int countChar(String s, char c){
        if(s.equals("")){
            return 0;
        }
        return (s.charAt(0) == c?1:0) + countChar(s.substring(1,s.length()), c);
    }
    public static void main(String[] args) {
        System.out.println(countChar("Hello World", 'l'));
    }
}
