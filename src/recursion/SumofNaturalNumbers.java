package recursion;

public class SumofNaturalNumbers {
    public static int sum(int n) {
        if(n != 0){
            n += sum(n-1);
        }
        else{
            return 0;
        }
        return n;
        
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
