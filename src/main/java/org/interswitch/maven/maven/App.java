package org.interswitch.maven.maven;

import com.interswitch.maven.Calculator;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Instructions: ");
        System.out.println("To add, enter 1");
        System.out.println("To subtract, enter 2");
        System.out.println("To divide, enter 3");
        System.out.println("To multiply, enter 4");

        double num1 = 0.0;
        double num2 = 0.0;

        while(true) {

            System.out.print("What operation do you want to perform: ");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Input 2 space separated numbers to add: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(Calculator.add(num1, num2));
                }
                case 2 -> {
                    System.out.print("Input 2 space separated numbers to subtract: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(Calculator.subtract(num1, num2));
                }
                case 3 -> {
                    System.out.print("Input 2 space separated numbers to multiply: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(Calculator.multiply(num1, num2));
                }
                case 4 -> {
                    System.out.print("Input 2 space separated numbers to divide: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(Calculator.divide(num1, num2));
                }
                default -> System.out.println("Invalid Input");
            }

            System.out.print("Perform another operation? (y/n): ");
            String response = scanner.next();
            scanner.nextLine();
            if (response.equalsIgnoreCase("n")) {
                break;
            }else if(!response.equalsIgnoreCase("y")){
                System.out.println("Invalid Option, Exiting...");
                break;
            }
        }
    }
}
