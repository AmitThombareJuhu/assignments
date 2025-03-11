/*Write a program to count the number of 1s (set bits) in a binary representation of a
number using bitwise operations.
Hint : Use n & (n - 1) .*/

import java.util.Scanner;

class CountSetBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0; 

        
        while (n > 0) {
            n = n & (n - 1); 
            count++; 
        }

        
        System.out.println("Number of 1s (set bits): " + count);

        sc.close(); 
    }
}
/* o/p = Enter a number: 13
Number of 1s (set bits): 3
Enter a number: 7
Number of 1s (set bits): 3