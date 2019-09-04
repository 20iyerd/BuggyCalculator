package app;

import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int operation;

        double firstNum,secondNum;

        while(true){
            System.out.println("Welcome. Would you like to: "
            +"\n1) add"
            +"\n2) subtract"
            +"\n3) multiply"
            +"\n4) divide?");

            operation = input.nextInt();

            if(operation == 1) {
                //assign values for firstNum and secondNum
                //add them together and print out the answer
            }
            else if(operation == 2){
                //same as above
            }
        //implement the other operations
        }
    }
}