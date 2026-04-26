import java.lang.Math.*;
import java.util.Scanner;

public class Task9 {
    public static int addExact(int a, int b) {
    return a+b;
    }
    public static int subtractExact(int a, int b) {
    return a-b;
    }
    public static int multiplyExact(int a, int b) {
    return a*b;
    }
    public static float divideExact(int a, int b) {
    return a/b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int x = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter Second Number:");
        int y = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The Sum is: " + Math.addExact(x, y));
        System.out.println("The Difference is: " + Math.subtractExact(x, y));
        System.out.println("The Product is: " + Math.multiplyExact(x, y));
        System.out.println("The Quotient is: " + Math.divideExact(x, y));
    }
}
