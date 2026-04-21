import java.util.Scanner;

public class Task4 {
 public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String theWord = scanner.nextLine();
    
    String reversedWord = new StringBuilder(theWord).reverse().toString();

    if (theWord.equals(reversedWord)) {
        System.out.println("The input string is a palindrome");
        System.out.println(theWord + " : " + reversedWord);
    } else {
        System.out.println("The input string is not a palindrome");
        System.out.println(theWord + " : " + reversedWord);  
    }
 }   
}




