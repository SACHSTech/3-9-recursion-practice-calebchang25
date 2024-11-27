package recursion;

public class SubsetsOfASet {
    public static void generateSubsets(String s){
        if(s.equals("") == false){
            System.out.print(s + ", ");
            generateSubsets(s.substring(0, s.length()-1));
            generateSubsets(s.substring(1, s.length()));
            // fix by somehow removing the middle one
        }

    }
    public static void main(String[] args) {
        generateSubsets("abcde");
    }
}