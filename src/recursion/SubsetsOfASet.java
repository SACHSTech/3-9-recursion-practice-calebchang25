package recursion;

public class SubsetsOfASet {
    public static void generateSubsets(String s){
        if(s.equals("") == false){
            System.out.print(s + ", ");
            generateSubsets(s.substring(0, s.length()-1), "");
            generateSubsets(s.substring(1)); // Pass the bottom path back in 
        }
    }

    public static void generateSubsets(String s, String a){
        if(s.equals("") == false){
            System.out.print(s + ", ");
            generateSubsets(s.substring(0, s.length()-1), "");
        }
    }
    public static void main(String[] args) {
        generateSubsets("abcd");
    }
}