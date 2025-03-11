/*Implement a Java program that finds the minimum of four numbers using nested
ternary operators.*/


import java.util.Scanner;

class MinOfFourTernary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        
        int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
                          : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));

        
        System.out.println("The minimum number is: " + min);

        sc.close(); 
    }
}
/* o/p = Enter first number: 3
Enter second number: 8
Enter third number: 15
Enter fourth number: 34
The minimum number is: 3

Enter first number: 54
Enter second number: 12
Enter third number: 84
Enter fourth number: 68
The minimum number is: 12*/