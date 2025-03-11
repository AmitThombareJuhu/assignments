/*Create a Java program that converts a given integer to a double and vice versa using wrapper classes.*/


class IntegerDoubleConversion {
    public static void main(String args[]) {
        
        Integer intValue = 42;
        Double doubleValue = intValue.doubleValue();
        
        System.out.println("Integer to Double Conversion:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted Double value: " + doubleValue);
        
       
        Double originalDouble = 99.99;
        Integer convertedInt = originalDouble.intValue();
        
        System.out.println("\nDouble to Integer Conversion:");
        System.out.println("Original Double value: " + originalDouble);
        System.out.println("Converted Integer value: " + convertedInt);
    }
}
