import java.util.Scanner;
public class LAB9B {
    public static void main(String[] args) {
        System.out.print("Insert password \n must have one digit one capital letter and special character: ");
            Scanner pass = new Scanner(System.in);
                String password = pass.nextLine();

        boolean atLeastEightChars = false;
        boolean oneUpperCase = false;
        boolean oneDigit = false;


        for(int i = 0; i < password.length(); i++){
            char upper = password.charAt(i);
            if(upper >= 65 && upper <= 100){
                oneUpperCase = true;
            } else if (upper >= 48 && upper <= 57){
                oneDigit = true;
            } else if (password.length() >= 8){
                atLeastEightChars = true;
            }
            System.out.println(upper);
        }
        System.out.println("one upper case: "+oneUpperCase);
        System.out.println("eight characters: "+atLeastEightChars);
        System.out.println("one digit: "+oneDigit);
        if(atLeastEightChars && oneDigit && oneUpperCase){
            System.out.println("Valid Password! Your input was " + password);
        } else{
            System.out.println("Invalid password");
        }




    }
}
