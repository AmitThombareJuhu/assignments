/*Write a program that determines whether a given number is positive, negative, or
zero using only the ternary operator .*/

import java.util.Scanner;

class NumberCheckTernary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

       
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        
        System.out.println("The number is: " + result);

        sc.close(); 
    }
}
/*o/p = Enter a number: 25
The number is: Positive
Enter a number: -7
The number is: Negative
Enter a number: 0
The number is: Zero