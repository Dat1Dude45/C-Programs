import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** * * * * * * * * * * * * * * * * * * * * **
 *   Author: Jared Paubel                    *
 *   Organization: Butler Community College  *
 *   Date: 2020-11-16                        *
 * * * * * * * * * * * * * * * * * * * * * * */


public class LoopEmail {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);


        // Declare variable types
        String workEmail;
        String gMail;
        String homeEmail;

        // initialize isValidEmail; begin while loop
        boolean isValidEmail;


        // Work email: @acme.com
        do {
            System.out.print("\nEnter your work email below:\n>> ");
            workEmail = userInput.nextLine();


            if (workEmail.contains("@acme.com")) {
                System.out.println("\nYour email is in the correct format.");
                isValidEmail = true;

            } else {
                System.out.println("\nYour email is not in the correct format." +
                        " The correct format is JohnDoe@acme.com");
                isValidEmail = false;
            }

        } while (!isValidEmail);


        // Google email: @gmail.com
        do {
            System.out.print("\nEnter your gmail below:\n>> ");
            gMail = userInput.nextLine();


            if (gMail.contains("@gmail.com")) {
                System.out.println("\nYour email is in the correct format.");
                isValidEmail = true;

            } else {
                System.out.println("\nYour email is not in the correct format." +
                        " The correct format is JohnDoe@gmail.com");
                isValidEmail = false;
            }
        } while (!isValidEmail);


        // Home email: @___.com
        do {
            System.out.print("\nEnter your home email below:\n>> ");
            homeEmail = userInput.nextLine();

            // Used regular expression in order to check random input for email domain
            String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(homeEmail);

            if (matcher.matches()) {
                System.out.println("\nYour email is in the correct format.");
                isValidEmail = true;

            } else {
                System.out.println("\nYour email is not in the correct format." +
                        " The correct format is JohnDoe@___.___");
                isValidEmail = false;
            }
        } while (!isValidEmail);

    }
}//END-OF-FILE
