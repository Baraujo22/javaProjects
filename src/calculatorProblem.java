package javaProjects.m1a1.src;
import java.util.*;
public class calculatorProblem {
    public static void main(String[] args) {


        String calculatorJob;int total = 10;
        do{
        System.out.print("""
                Please select operation:
                 A - Addition\s
                 S - Subtraction
                 M - Multiplication
                 D - Division
                """);
        Scanner operation = new Scanner(System.in);
        calculatorJob = operation.nextLine();
                switch(calculatorJob){
            case "A":
            case "a":
                System.out.println("Enter number you would like it to add to");
                int number = operation.nextInt();
                System.out.println("The addition of " + number +" with 10 is");
                total += number;
                System.out.println(total);
                break;
            case "S":
            case "s":
                System.out.println("Enter number you would like it to subtract to");
                number = operation.nextInt();
                System.out.println("The subtraction of 10 with " + number + " is");
                total -= number;
                System.out.println(total);
                break;
            case "M":
            case "m":
                System.out.println("Enter number you would like it to multiply by");
                number = operation.nextInt();
                System.out.println("The multiplication of 10 with " + number + " is");
                total *= number;
                System.out.println(total);
            break;
            case "D":
            case "d":
                System.out.println("Enter number you would like it to divide by");
                number = operation.nextInt();
                System.out.println("The division of 10 with " + number + " is");
                total /= number;
                System.out.println(total);
                break;
        }
        } while(!calculatorJob .equalsIgnoreCase("q"));
        System.out.println("thanks for playing with us!");
    }
}
