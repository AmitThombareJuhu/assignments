/* Implement a Java program to find the absolute value of an integer using bitwise
operators.
Hint : mask = num >> 31; abs = (num + mask) ^ mask;*/


import java.util.Scanner;

class AbsoluteValueBitwise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        
        int mask = num >> 31;
       
        int abs = (num + mask) ^ mask;
        
        
        System.out.println("Absolute value: " + abs);
        
        sc.close();
    }
}
