/*Write a Java program to swap two numbers using a temporary variable and without using a temporary variable.*/


import java.util.Scanner;

class SwapNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("\nAfter swapping (using temp variable):");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("\nAfter swapping (without using temp variable):");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        scanner.close();
    }
}
