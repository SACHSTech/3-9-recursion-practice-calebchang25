package recursion;

public class SubsetsOfASet {
    public static void generateSubsets(String s){
        if(s.equals("") == false){
            System.out.print(s + ", ");
            for(int x = 1; x < s.length(); x++){
                System.out.print(s.substring(0, s.length()-x) + ", ");
            }
            generateSubsets(s.substring(1));
        }
    }
    public static void main(String[] args) {
        generateSubsets("abcd");
    }
}