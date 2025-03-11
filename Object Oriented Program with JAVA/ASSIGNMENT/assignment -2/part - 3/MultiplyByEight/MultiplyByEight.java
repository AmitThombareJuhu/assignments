/* Write a Java program to multiply a number by 8 without using * or / operators.
Hint : Use bitwise left shift ( << ).*/

import java.util.Scanner;

class MultiplyByEight {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        
        int result = num << 3;
        
        
        System.out.println(num + " multiplied by 8 is: " + result);
        
        sc.close();
    }
}
/* o/p = Enter a number: 5
5 multiplied by 8 is: 40