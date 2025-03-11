//Q2: Write a program to check whether a given number is even or odd using only bitwise
//operators .
//Hint : Use n & 1 to check.
import java.util.Scanner;


class EvenOdd{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = a&1;
	if(b == 0){
		System.out.println("Given no "+a+" is even");
		}
		else{
		System.out.println("Given no "+a+" is odd");
		}
		}
}

/* o/p = 10
Given no 10 is even
55
Given no 55 is odd
*/