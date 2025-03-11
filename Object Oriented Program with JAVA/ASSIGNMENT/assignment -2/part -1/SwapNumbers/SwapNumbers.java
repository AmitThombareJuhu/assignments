/*Write a Java program to swap two numbers using the += and -= operators only.*/

class SwapNumbers {
    public static void main(String args[]) {
        int a = 10, b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using += and -=
        a += b; // a = a + b
        b = a - b; // b = (a + b) - b = a
        a -= b; // a = (a + b) - a = b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}


/*  Before swapping: a = 10, b = 20
After swapping: a = 20, b = 10  
*/