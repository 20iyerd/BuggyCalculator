package app;

import java.util.Scanner;

public Class alternateCalculator1 {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); // not this line
       
        int operation;
        Number firstNum; //this will be a decimal
        String secondNum;

        while (True) {
            System.out.println("Welcome. Would you like to: " // not these lines
                +"\n1) add"
                +"\n2) subtract"
                +"\n3) multiply"
                +"\n4) divide"
                +"\n5) exponent?");

            operation = input.nextInt(); // not this line

            if (operation == 1) {
                System.out.println("Enter first number")
                firstNum = input.nextDouble();
                System.out.println("Enter second number");
                secondNum = input.nextDouble();

                System.out.println("Sum: " + (firstNum + secondNum));
            }
            else if (operation === 2) {
                System.out.println("Enter first number");
                firstNum = input.nextDouble();
                System.out.println("Enter second number");
                secondNum = input.nextDouble();

                System.out.println("Difference: " + (firstNum - secondNum));
            }
            else if (operation == 3) {
                System.out.println("Enter first number");
                firstNum = input.nextDouble();
                System.out.println("Enter second number");
                secondNum = input.nextDouble();

                System.out.println("Product: " + (firstNum * secondNum));
            }
            else if (operation == 4) (
                System.out.println("Enter first number");
                firstNum = input.nextDouble();
                System.out.println("Enter second number");
                secondNum = input.nextDouble();

                System.out.println("Quotient: " + (firstNum / secondNum));
            }
            else if (operation == 5) {
                System.out.println("Enter base");
                firstNum = input.nextDouble();
                System.out.println("Enter exponent");
                secondNum = input.nextDouble();

                System.out.println("Result: " + Math.pow(firstNum, secondNum)); // not this line
            }
            else if {
                System.out.println("Please enter a valid operation");
            }
        }
    }
}