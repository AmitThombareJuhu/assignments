/* Implement a program that reverses an integer number without using string
conversion ( StringBuilder or toCharArray ).
Hint : Use while(n!=0) { rev = rev * 10 + n % 10; n /= 10; }*/


import java.util.Scanner;

class ReverseInteger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int rev = 0;

        
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        
        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}
/* o/p = Enter an integer: 1234
Reversed number: 4321*/