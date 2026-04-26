import java.util.Scanner;

public class Task8 {

    public static int computeSums(int... numbers) {
        int totalSum = 0;

        for (int n : numbers) {
            int cumulative = 0;

            for (int i = 1; i <= n; i++) {
                cumulative += i;
            }

            System.out.println(n + " = " + cumulative);
            totalSum += cumulative;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input how many numbers to enter: ");
        int count = Integer.parseInt(scanner.nextLine());

        int [] inputs = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            inputs[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("\nResults:");
        int result = computeSums(inputs); 

        System.out.println("Total Sum: " + result);

        scanner.close();
    }
}

