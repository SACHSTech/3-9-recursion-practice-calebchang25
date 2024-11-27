package recursion;

public class PowerFunction {
    public static int power(int base, int exponent){
        if(exponent == 1){
            return base;
        }
        return base*power(base, exponent-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
