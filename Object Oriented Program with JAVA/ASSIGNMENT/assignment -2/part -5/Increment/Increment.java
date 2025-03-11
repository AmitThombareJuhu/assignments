/* Write a program that increments a number without using + or ++ operators.
Hint : Use bitwise - (~x) .*/

import java.util.Scanner;

class Increment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        r
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

       
        int incremented = -~x;  

        
        System.out.println("Incremented value: " + incremented);

        sc.close();
    }
}
/* o/p = Enter a number: 5
Incremented value: 6