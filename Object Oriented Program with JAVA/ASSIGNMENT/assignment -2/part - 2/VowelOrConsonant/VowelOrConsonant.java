/*Write a program to determine if a character is a vowel or a consonant using the
ternary operator.*/

import java.util.Scanner;

class VowelOrConsonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0); 

        
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 
                        "Vowel" : "Consonant";

      
        System.out.println("The character '" + ch + "' is a: " + result);

        sc.close(); 
    }
}
/* output = Enter a character: a
The character 'a' is a: Vowel
Enter a character: f
The character 'f' is a: Consonant*/