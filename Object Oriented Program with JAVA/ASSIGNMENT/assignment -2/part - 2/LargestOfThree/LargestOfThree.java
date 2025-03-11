/*Write a program to find the largest of three numbers using only the ternary operator
( ? : ) .*/


class LargestOfThree {

    public static void main(String args[]) {
        int a = 10;
        int b = 25;
        int c = 15;

        int largest;

        if (a > b && a > c) {
            largest = a;
        } else if (b > a && b > c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}