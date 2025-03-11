/*Write a program to check if a given number is a power of 2 using bitwise operators.
Hint : n & (n - 1) == 0 for positive numbers.*/

import java.util.Scanner;

class PowerOfTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        
        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);

       
        System.out.println(n + " is a power of 2: " + isPowerOfTwo);

        sc.close(); 
    }
}
/* output = Enter a number: 16
16 is a power of 2: true
Enter a number: 1
1 is a power of 2: true
Enter a number: 1
1 is a power of 2: true