/*Implement a Java program to demonstrate implicit and explicit type casting.*/


class TypeCastingDemo {
    public static void main(String args[]) {
        
        int intValue = 100;
        double doubleValue = intValue; 
        
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted double value: " + doubleValue);
        
        
        double originalDouble = 99.99;
        int narrowedInt = (int) originalDouble;
        
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Original double value: " + originalDouble);
        System.out.println("Converted integer value: " + narrowedInt);
        
        
        char charValue = 'A';
        int charToInt = (int) charValue; 
        
        System.out.println("\nExplicit Type Casting of char to int:");
        System.out.println("Character value: " + charValue);
        System.out.println("Converted integer value: " + charToInt);
    }
}
