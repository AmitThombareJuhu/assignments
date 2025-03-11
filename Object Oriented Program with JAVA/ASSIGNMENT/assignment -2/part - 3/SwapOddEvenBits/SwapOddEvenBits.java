/*Implement a program to swap odd and even bits of a number using bitwise
operators.
Hint : Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 .*/



import java.util.Scanner;

class SwapOddEvenBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

       
        int evenBits = num & 0xAAAAAAAA; 
        int oddBits = num & 0x55555555;   

       
        evenBits >>= 1; 
        oddBits <<= 1;  

        
        int swappedNum = evenBits | oddBits;

        
        System.out.println("Number after swapping odd and even bits: " + swappedNum);

        sc.close(); 
}
/* o/p = Enter a number: 10
Number after swapping odd and even bits: 5
Enter a number: 20
Number after swapping odd and even bits: 40