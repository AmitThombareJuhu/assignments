/*Implement a program that calculates the sum of digits of an integer using modulus
( % ) and division ( / ) operators .*/

 class SumOfDigits {

    public static void main(String args[]) {
        int number = 12345; 
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10; 
            sum = sum + digit; 
            temp = temp / 10; 
        }

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}

/* o/p = Sum of digits of 12345 is: 15 
*/