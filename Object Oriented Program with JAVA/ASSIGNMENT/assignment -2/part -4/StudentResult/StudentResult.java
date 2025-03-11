/*Given a student’s percentage, print “Pass” if the percentage is 40 or above;
otherwise, print “Fail” , using only the ternary operator.*/

import java.util.Scanner;

class StudentResult {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter student's percentage: ");
        double percentage = sc.nextDouble();

        
        String result = (percentage >= 40) ? "Pass" : "Fail";

        
        System.out.println("Result: " + result);

        sc.close(); 
    }
}
/* o/p = Enter student's percentage: 85
Result: Pass
Enter student's percentage: 37
Result: Fail