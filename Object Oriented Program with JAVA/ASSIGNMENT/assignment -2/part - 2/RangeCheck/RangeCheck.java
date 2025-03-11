/*Implement a Java program that checks if a number is within a specific range (20 to
50) without using if-else .
Hint : Use logical AND ( && ) in a print statement .*/

import java.util.Scanner;

class RangeCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        System.out.println("Is the number in the range 20 to 50? " + (num >= 20 && num <= 50));

        sc.close(); 
    }
}
/* Output = Enter a number: 25
			Is the number in the range 20 to 50? true
			Enter a number: 15
			Is the number in the range 20 to 50? false*/