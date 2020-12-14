import java.util.Scanner;

/** * * * * * * * * * * * * * * * * * * * * *
*   Author: Jared Paubel                    *
*   Organization: Butler Community College  *
*   Date: 2020-11-16                        *
* * * * * * * * * * * * * * * * * * * * * * */

public class HousePainting {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the length and height of the 4 interior walls" +
                " as well as the length and height of the 2 windows and the door.");

        //Get W X L of walls (4 walls)
        System.out.print("Wall length >> ");
        double lengthWall = userInput.nextInt();
        System.out.print("Wall height >> ");
        double heightWall = userInput.nextInt();
        System.out.println(); // New Line

        //Get W X L of Door
        System.out.print("Door length >> ");
        double lengthDoor = userInput.nextInt();
        System.out.print("Door height >> ");
        double heightDoor = userInput.nextInt();
        System.out.println(); // New Line

        //Get W X L of windows (2 windows)
        System.out.print("Window length >> ");
        double lengthWindow = userInput.nextInt();
        System.out.print("Window height >> ");
        double heightWindow = userInput.nextInt();
        System.out.println(); // New Line


        //Area of walls, times 4 (room)
        double areaOfWall = 4 * (lengthWall * heightWall);

        //Areas of door and windows, added together
        double areaOfDoor = lengthDoor * heightDoor;
        double areaOfWindows = 2 * (lengthWindow * heightWindow);
        double areaOfUnpainted = areaOfDoor + areaOfWindows;

        //Subtract the wall area minus area of the unpainted
        double areaOfPainted = areaOfWall - areaOfUnpainted;
        System.out.println("Area to be painted, excluding door and 2 windows, is: " + areaOfPainted);


        // Room will need 2 coats of paint
        //Exclude door and windows
        // 1 gallon = $20.00; 1 gallon covers 200 sqft; you charge $5 per sqft

        double gallonPerSQFT = 2 * (areaOfPainted / 200); // 2 coats of paint
        System.out.println("Total paint used with 2 coats is " + gallonPerSQFT);

        double initialCost = gallonPerSQFT * 20; //Total cost of application
        double chargingAmount = areaOfPainted * 5; //Total charge $5 per sqft
        double totalProfit = chargingAmount - initialCost;
        System.out.println("Total expected profit is $" + totalProfit);

    }
}//END-OF-FILE







































