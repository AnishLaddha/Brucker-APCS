import java.util.*;
public class gcdrecursion{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int first = console.nextInt();
        System.out.print("Enter an integer: ");
        int second = console.nextInt();
        System.out.println(gcd(first,second));
    }
    public static int gcd(int num1, int num2){
        if (num2 == 0 ){
            return num1;
        }
        else{
            int hold = num1 % num2;
            if(hold > num2){
                return gcd(hold, num2);
            }
            else{
                return gcd(num2, hold);
            }
        }
    }
}