import java.util.Scanner;

public class Task7 {

    double addNumbers(double firstNum, double secondNum){
        return firstNum+secondNum;
    }
    double subtractNumbers(double firstNum, double secondNum){
        return firstNum-secondNum;
    }
    double multiplyNumbers(double firstNum, double secondNum){
        return firstNum*secondNum;
    }
    double divideNumbers(double firstNum, double secondNum){
        return firstNum/secondNum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strChoice;
        do { 
            System.out.println("Enter two numbers");
            System.out.println("-------------------");
            System.out.print("First Number: ");
            double firstNum = Double.parseDouble(scanner.nextLine());
            System.out.print("Second Number: ");
            double secondNum = Double.parseDouble(scanner.nextLine());
            
            System.out.println();
            System.out.println("-------------------");
            System.out.println("Select Operation");
            System.out.println("-------------------");
            System.out.println("A. Add");
            System.out.println("B. Subtract");
            System.out.println("C. Multiply");
            System.out.println("D. Divide");
            System.out.println();
            System.out.print("Selected: ");
            String strOp = scanner.nextLine();
            
            System.out.println();
            System.out.println("-------------------");
            System.out.print("The Result is: ");

            Task7 retVal = new Task7();

            switch (strOp.toUpperCase()) {
                case "A": System.out.print(retVal.addNumbers(firstNum,secondNum)); break;
                case "B": System.out.print(retVal.subtractNumbers(firstNum,secondNum)); break;   
                case "C": System.out.print(retVal.multiplyNumbers(firstNum,secondNum)); break;  
                case "D": System.out.print(retVal.divideNumbers(firstNum,secondNum)); break;            
            }
            System.out.println();
            System.out.println("-------------------");
            System.out.println("Do another operation?");
            System.out.print("Y/N: ");
            strChoice = scanner.nextLine();
            System.out.println();
            System.out.println("-------------------");

        } while(strChoice.equalsIgnoreCase("Y"));
        
    }
    
}


