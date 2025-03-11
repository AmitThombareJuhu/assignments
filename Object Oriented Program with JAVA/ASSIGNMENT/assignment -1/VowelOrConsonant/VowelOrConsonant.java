/* Develop a program that takes user input for a character and prints whether it is a vowel or consonant.*/


import java.util.Scanner;

class VowelOrConsonant {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        
        ch = Character.toLowerCase(ch);

       
        if (Character.isLetter(ch)) {
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter a letter.");
        }

        scanner.close();
    }
}
