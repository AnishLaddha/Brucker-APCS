import java.util.*;
public class recursion1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("enter:");
        int number = console.nextInt();
        System.out.println();



        System.out.println("infinite recursion");
        infiniteRecursion(1);
    }
    public static void infiniteRecursion(int num){
        System.out.println(num);
        infiniteRecursion(num+1);
    }
}
