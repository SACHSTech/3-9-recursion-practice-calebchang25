package recursion;

public class FindMaximumInAnArray {
    public static int findMax(int[] arr, int n){
        if(n == 0){
            return 0;
        }
         return(Math.max(findMax(arr, n-1), arr[n-1]));
    }
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1,5,7,2,5,3}, 4));
    }
}
