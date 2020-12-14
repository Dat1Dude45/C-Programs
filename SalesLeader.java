import java.text.DecimalFormat;
import java.util.Scanner;

/** * * * * * * * * * * * * * * * * * * * * **
 *   Author: Jared Paubel                    *
 *   Organization: Butler Community College  *
 *   Date: 2020-11-16                        *
 * * * * * * * * * * * * * * * * * * * * * * */

public class SalesLeader {
    public static class SalesPerson {
        // Initialize method values
        double salesAmount;
        enum salesArea { WEST, MID, EAST }
        String personName;
        salesArea defaultArea;// This is used for enum switch statement

        //Default values for inputs
        public void showDefault() {
            System.out.println(personName = "None");
            System.out.println(salesAmount = 0.00);
            System.out.println(defaultArea = salesArea.MID);
        }

        // Set and get personName
        public void setFirstName(String firstNameToSet) { personName = firstNameToSet; }
        public String getFirstName() { return personName; }

        // Set and get salesAmount
        public void setSalesAmount(double amountToSet) { salesAmount = amountToSet; }
        public double getSalesAmount() { return salesAmount; }

        // Set and get salesArea
        public void setSalesArea(salesArea areaToSet) {
            switch (areaToSet) {
                case WEST -> System.out.println("The West Coast");
                case MID -> System.out.println("The Midwest");
                case EAST -> System.out.println("The East Coast");
            }
        }

        // Method that checks if SalesAmount is greater than 100k
        public double if100k(double userAmount) {
            if (userAmount >= 100000) {
                userAmount = (userAmount * 0.10) + userAmount;
            }
             return userAmount;
        }

        // Method that checks if all three SalesAmount are equal;
        public static void SalesLeaderTie(double amount1, double amount2, double amount3) {
            if (amount1 == amount2 && amount2 == amount3) {
                System.out.println("There is a tie!!!");
            }
         }


        // Method that checks which of the three sales persons is the sales leader
        //      and adds %15
        public static void topSalesLeader(String name1, String name2, String name3,
                                          double amount1, double amount2, double amount3) {

            DecimalFormat df = new DecimalFormat(".00");

            System.out.println("The sales person that gets the highest amount of sales will get" +
                    " a commission of %15.\n");
            if (amount1 > amount2 && amount1 > amount3) {
                // If amount exceeds 100,000, get 0.15 commission and add to sales
                if (amount1 >= 100000) {
                    amount1 = (amount1 * 0.15) + amount1;
                }
                System.out.println(name1 + " is the sales leader with $" + df.format(amount1));


            } else if (amount2 > amount1 && amount2 > amount3) {
                // If amount exceeds 100,000, get 0.15 commission and add to sales
                if (amount2 >= 100000) {
                    amount2 = (amount2 * 0.15) + amount2;
                }
                System.out.println(name2 + " is the sales leader with $" + df.format(amount2));


            } else if (amount3 >= amount1 && amount3 > amount2) {
                // If amount exceeds 100,000, get 0.15 commission and add to sales
                if (amount3 > 100000) {

                    amount3 = (amount3 * 0.15) + amount3;
                }
                System.out.println(name3 + " is the sales leader with $" + df.format(amount3));

            }
        }


        public static void main(String[] args) {

            DecimalFormat df = new DecimalFormat(".00");
            Scanner userInput = new Scanner(System.in);

            String name1, name2, name3;
            double sales1, sales2, sales3;
            salesArea s; // Defined by enum-switch statement

            SalesPerson salesperson1 = new SalesPerson();
            SalesPerson salesperson2 = new SalesPerson();
            SalesPerson salesperson3 = new SalesPerson();

            System.out.println("\nThese are the default values: ");
            salesperson1.showDefault();


            // Sales-Person 1 ------------------------------------------------------------------------------------------
            System.out.print("\nEnter the sales person's name:\n>> ");
            salesperson1.setFirstName(userInput.next());

            // name1 is for the method that checks for sales leader
            name1 = salesperson1.getFirstName();

            System.out.print("\nEnter the sales amount:" +
                    "\n(If amount is over 100k, %10 commission will be added)\n>> ");
            salesperson1.setSalesAmount(userInput.nextDouble());

            // sales1 is for the method that checks for sales leader
            sales1 = salesperson1.getSalesAmount();

            System.out.print("\nEnter the area that the sales" +
                    " will take place:\n>> ");
            // Takes user input, convert to upper and check if enum
            do {
                try {
                    s = salesArea.valueOf(userInput.next().toUpperCase());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.print("You must enter west, mid or east.\n>> ");
                }
            } while (true);

            System.out.println("\nThese are the results: ");

            // Print first name
            System.out.println(salesperson1.getFirstName());

            // Check if salesperson1 has sales on or over 100,000
            System.out.println(df.format(salesperson1.if100k(salesperson1.getSalesAmount())));

            // Get the sales area
            salesperson1.setSalesArea(s);
            // Sales-Person 1 ------------------------------------------------------------------------------------------


            //Sales-Person 2 -------------------------------------------------------------------------------------------
            System.out.print("\n\nEnter the sales person's name:\n>> ");
            salesperson2.setFirstName(userInput.next());

            // name2 is for the method that checks for sales leader
            name2 = salesperson2.getFirstName();

            System.out.print("\nEnter the sales amount:" +
                    "\n(If amount is over 100k, %10 commission will be added)\n>> ");
            salesperson2.setSalesAmount(userInput.nextDouble());

            // sales2 is for the method that checks for sales leader
            sales2 = salesperson2.getSalesAmount();

            System.out.print("\nEnter the area that the sales" +
                    " will take place:\n>> ");
            // Takes user input, convert to upper and check if enum
            do {
                try {
                    s = salesArea.valueOf(userInput.next().toUpperCase());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.print("You must enter west, mid or east.\n>> ");
                }
            } while (true);

            System.out.println("\nThese are the results: ");

            // Print first name
            System.out.println(salesperson2.getFirstName());

            // Check if salesperson2 has sales on or over 100,000
            System.out.println(df.format(salesperson2.if100k(salesperson2.getSalesAmount())));

            // Get the sales area
            salesperson2.setSalesArea(s);
            //Sales-Person 2 -------------------------------------------------------------------------------------------


            //Sales-Person 3 -------------------------------------------------------------------------------------------
            System.out.print("\n\nEnter the sales person's name:\n>> ");
            salesperson3.setFirstName(userInput.next());

            // name2 is for the method that checks for sales leader
            name3 = salesperson3.getFirstName();

            System.out.print("\nEnter the sales amount:" +
                    "\n(If amount is over 100k, %10 commission will be added)\n>> ");
            salesperson3.setSalesAmount(userInput.nextDouble());

            // sales3 is for the method that checks for sales leader
            sales3 = salesperson3.getSalesAmount();

            System.out.print("\nEnter the area that the sales" +
                    " will take place:\n>> ");
            // Takes user input, convert to upper and check if enum
            do {
                try {
                    s = salesArea.valueOf(userInput.next().toUpperCase());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.print("You must enter west, mid or east.\n>> ");
                }
            } while (true);

            System.out.println("\nThese are the results: ");

            // Print first name
            System.out.println(salesperson3.getFirstName());

            // Check if salesperson3 has sales on or over 100,000
            System.out.println(df.format(salesperson3.if100k(salesperson3.getSalesAmount())));

            // Get the sales area
            salesperson3.setSalesArea(s);
            //Sales-Person 3 -------------------------------------------------------------------------------------------

            
            System.out.println();
            // Tests which of the three sales persons is the top sales leader
            topSalesLeader(name1, name2, name3, sales1, sales2, sales3);

            System.out.println();
            // Tests if the three SalesAmounts are equal; if so output tie
            SalesLeaderTie(sales1, sales2, sales3);
        }
    }
}// END-OF-FILE


