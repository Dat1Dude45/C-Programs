import java.util.Scanner;

/** * * * * * * * * * * * * * * * * * * * * **
 *   Author: Jared Paubel                    *
 *   Organization: Butler Community College  *
 *   Date: 2020-11-16                        *
 * * * * * * * * * * * * * * * * * * * * * * */


public class CheckEmail {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Declare variable types
        String inputEmail;

        System.out.print("Enter your email below:\n>> ");
        inputEmail = userInput.nextLine();

        if (inputEmail.contains("@acme.com")){
            System.out.println("Your email is in the correct format.");
        } else {
            System.out.println("Your email is not in the correct format." +
                    " The correct format is JohnDoe@acme.com");
        }

    }
}//END-OF-FILE
