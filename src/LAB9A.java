import java.util.Scanner;
public class LAB9A {
    public static void main(String[] args) {

        String yesBaby;
        do{

    System.out.print("0 - Hello World! \n1 - Goodbye Moon! \n2 - Walking on Sunshine...\n\nWhat would you like to do? ");
        Scanner testOne = new Scanner(System.in);
            int toDo = testOne.nextInt();
            switch (toDo) {
                case 0 -> System.out.println("Hello!");
                case 1 -> System.out.println("Goodbye!");
                case 2 -> System.out.println("Sunshine, yeah!");
                default -> System.out.println("Invalid input.");
            }
        System.out.print("Type 'yes' to rerun: ");
            Scanner yes = new Scanner(System.in);
                yesBaby = yes.nextLine();

        } while (yesBaby .equalsIgnoreCase("yes"));
        System.out.println("See you later!");
    }
}
