/* Write a Java program that checks whether a character is uppercase, lowercase, or
not a letter using only the ternary operator*/


import java.util.Scanner;

class CharacterCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        
        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : 
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" : 
                        "Not a letter";
        
        
        System.out.println("The character is: " + result);
        
        sc.close(); 
    }
}
/* o/p = Enter a character: AMIT
The character is: Uppercase
Enter a character: amit
The character is: Lowercase
Enter a character: 20
The character is: Not a letter