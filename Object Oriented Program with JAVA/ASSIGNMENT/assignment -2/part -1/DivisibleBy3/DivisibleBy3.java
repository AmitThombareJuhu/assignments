/* Write a program to find whether a given number is divisible by 3 without using the
modulus ( % ) or division ( / ) operators.
Hint : Use subtraction and bitwise shifts*/


import java.util.Scanner;

class DivisibleBy3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        
        if(n < 0) {
            n = -n;
        }
        
        
        while(n >= 3) {
            int shift = 0;
            
            while((3 << (shift + 1)) <= n) {
                shift++;
            }
            n -= (3 << shift);
        }
        
        
        String result = (n == 0) ? "divisible by 3" : "not divisible by 3";
        System.out.println("The number is " + result + ".");
        
        sc.close();
    }
}
