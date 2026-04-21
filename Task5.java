import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNum = scanner.nextInt();
        numList.add(firstNum);

        System.out.println("Enter the second number:");
        int secondNum = scanner.nextInt();
        numList.add(secondNum);

        System.out.println("Enter the third number:");
        int thirdNum = scanner.nextInt();
        numList.add(thirdNum);

        int max = numList.get(0);

        for (int i = 1; i < numList.size(); i++){
            max = Math.max(max, numList.get(i));
        }
        System.out.println("The largest number is:");
        System.out.println(max);
    }
}
