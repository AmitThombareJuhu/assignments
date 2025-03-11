/* Create a Java program to check whether a given number is even or odd using command-line arguments.*/


class EvenOddChecker {
    public static void main(String args[]) {
        
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }
        
        try {
            
            int number = Integer.parseInt(args[0]);
            
            
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
