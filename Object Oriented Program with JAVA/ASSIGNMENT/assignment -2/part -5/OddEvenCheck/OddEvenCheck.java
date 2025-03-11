/*Given a number, find whether it is odd or even using the & bitwise operator and print
the result without using if-else .*/

import java.util.Scanner;

class OddEvenCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        
        String result = ((num & 1) == 0) ? "Even" : "Odd";
        
        
        System.out.println("The number is: " + result);
        
        sc.close();
    }
}
/* o/p = Enter a number: 56
The number is: Even
Enter a number: 99
The number is: Odd*/