class LargestofThreeNumbers {
    public static void main(String[] args) {

        int firstNumber = 15;

        int secondNumber = 52;

        int thirdNumber = 24;

        int largestNumber = firstNumber;

        if (secondNumber > largestNumber) {
            largestNumber = secondNumber;
        }

        if (thirdNumber > largestNumber) {
            largestNumber = thirdNumber;
        }

        System.out.println("The largest number is " + largestNumber + ".");

    }
}