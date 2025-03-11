/* Write a program that takes three boolean inputs and prints true if at least two of
them are true .
Hint : Use logical operators ( && , || ).*/ 

import java.util.Scanner;

class AtLeastTwoTrue {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter first boolean value (true/false): ");
        boolean a = scanner.nextBoolean();
        
        System.out.println("Enter second boolean value (true/false): ");
        boolean b = scanner.nextBoolean();
        
        System.out.println("Enter third boolean value (true/false): ");
        boolean c = scanner.nextBoolean();
        
        
        boolean result = (a && b) || (b && c) || (a && c);
        
        
        System.out.println("At least two are true: " + result);
        
        scanner.close();
    }
}
