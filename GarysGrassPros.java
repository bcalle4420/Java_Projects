import java.util.Scanner;

public class GarysGrassPros {

    //defines scanner for entire project
    private final static Scanner keyboard = new Scanner(System.in);

    //defines constants for acre and mulching prices
    private static final int GRASS_1 = 50, GRASS_2 = 75, GRASS_3 = 110, GRASS_4 = 120;
    private static final int LAWN_1 = 30, LAWN_2 = 50, LAWN_3 = 75, LAWN_4 = 90;
    private static final int HEMLOCK = 45, BARK = 40, PINE = 30;

    public static void main(String[] args) {
        String service;
        //prints user interface
        header();

        //switch-case statement based on user choice
        switch (userChoice()) {
            case 'g', 'G':
                //adds string to variable to state the service and price
                service = "grass growing";
                System.out.printf("The price of your %s plan is: $%.2f", service, grassGrowing());
                break;
            case 'c', 'C':
                //adds string to variable state the service and price
                service = "lawn cutting";
                System.out.printf("The price of your %s plan is: $%.2f", service, lawnCutting());
                break;
            case 'm', 'M':
                //adds string to variable state the service and price
                service = "mulching";
                System.out.printf("The price of your %s plan is: $%.2f", service, mulching());
                break;
            //if user enters invalid data, terminates program
            default:
                System.out.println("Invalid choice...program ended.");
        }
        keyboard.close();
    }

//method for user interface
    public static void header() {
        System.out.println("Welcome to GarysGrassPros... we will get your yard looking beautiful this spring!!");
        System.out.println("We have the best grass growing, lawn cutting, and mulching plans for you");
    }

//returns and confirms user input choice
    public static char userChoice() {
        boolean valid = false;
        boolean doubt = true;
        char choice2;
        char choice = 0;
        //prompts user for lawn choice
        while (valid == false) {
            System.out.print("What are you interested in getting pricing for? Enter 'g' for grass growing, 'c' for lawn cutting, or 'm' for mulching");
            String char2 = keyboard.nextLine();
            choice = char2.charAt(0);
            switch (choice) {
                case 'g', 'c', 'm', 'G', 'C', 'M':
                    while (doubt == true) {
                        System.out.printf("The choice you selected is %s, is this what you meant? (Y/N) ", choice);
                        String Char = keyboard.nextLine();
                        choice2 = Char.charAt(0);
                        switch (choice2) {
                            case 'y', 'Y':
                                doubt = false;
                                break;
                            case 'n', 'N':
                                System.out.print("What are you interested in getting pricing for? Enter 'g' for grass growing, 'c' for lawn cutting, or 'm' for mulching");
                                char2 = keyboard.nextLine();
                                choice = char2.charAt(0);
                                break;
                            default:
                                choice = 'o';
                                doubt = false;
                        }
                        valid = true;
                    }
            }
        }
        return choice;
    }

//calculates grand total for grass growing
    public static double calculation1(int acreInput) {
        double total = 0;
        switch (acreInput) {
            case 1:
                total += GRASS_1;
                break;
            case 2:
                total += GRASS_2;
                break;
            case 3:
                total += GRASS_3;
                break;
            case 4:
                total += GRASS_4;
                break;
        }
        return total;
    }

//calculates grand total for lawn cutting
    public static double calculation2(int acreInput) {
        double total = 0;
        switch (acreInput) {
            case 1:
                total += LAWN_1;
                break;
            case 2:
                total += LAWN_2;
                break;
            case 3:
                total += LAWN_3;
                break;
            case 4:
                total += LAWN_4;
                break;
        }
        return total;
    }

// calculates grant total for mulching
    public static double calculation3(double sqFootage, char mulch) {
        double total = 0;
        sqFootage /= 150;
        sqFootage = Math.round(sqFootage);
        switch (mulch) {
            case 'h', 'H':
                total = sqFootage * HEMLOCK;
                break;
            case 'b', 'B':
                total = sqFootage * BARK;
                break;
            case 'p', 'P':
                total = sqFootage * PINE;
                break;
        }
        return total;
    }

//method for grass growing option
    public static double grassGrowing() {
        int acreInput;
        boolean valid = false;
        //prompts user to enter size of lawn in acres
        System.out.print("Enter the size of your lawn (1=quarterAcre, 2=halfAcre, 3=threeQuarterAcre, 4=fullAcre):");
        acreInput = keyboard.nextInt();

        //while loop to get proper user input
        while (valid == false) {
            switch (acreInput) {
                case 1:
                    valid = true;
                    break;
                case 2:
                    valid = true;
                    break;
                case 3:
                    valid = true;
                    break;
                case 4:
                    valid = true;
                    break;
                default:
                    System.out.print("Enter the size of your lawn (1=quarterAcre, 2=halfAcre, 3=threeQuarterAcre, 4=fullAcre):");
                    acreInput = keyboard.nextInt();
            }
        }
        return calculation1(acreInput);
    }

//method for lawn cutting option
    public static double lawnCutting() {
        //variable for acre amount
        int acreInput;
        //boolean for while loop
        boolean valid = false;

        System.out.print("Enter the size of your lawn (1=quarterAcre, 2=halfAcre, 3=threeQuarterAcre, 4=fullAcre):");
        acreInput = keyboard.nextInt();

        //while loop so if user enters invalid data, prompts again
        while (valid == false) {
            switch (acreInput) {
                case 1:
                    valid = true;
                    break;
                case 2:
                    valid = true;
                    break;
                case 3:
                    valid = true;
                    break;
                case 4:
                    valid = true;
                    break;
                default:
                    System.out.print("Enter the size of your lawn (1=quarterAcre, 2=halfAcre, 3=threeQuarterAcre, 4=fullAcre):");
                    acreInput = keyboard.nextInt();
            }
        }
        return calculation2(acreInput);
    }

//method for mulching option
    public static double mulching() {
        //variables to hold user inputted data
        double sqFootage;
        char mulch;

        //boolean for while look
        boolean valid = false;

        //prompt user for square footage amount
        System.out.print("Enter the square footage of your lawn (between 400-1800 sq ft)");
        sqFootage = keyboard.nextInt();
        keyboard.nextLine();

        //while and if-else statement to see if data is valid and if not, prompts user again
        while (valid == false) {
            if (sqFootage >= 400 && sqFootage <= 1800) {
                valid = true;
            } else {
                System.out.print("Enter the square footage of your lawn (between 400-1800 sqft)");
                sqFootage = keyboard.nextInt();
                keyboard.nextLine();
            }
        }
        //prompts user for mulch choice
        System.out.print("What type of mulch do you want (h=hemlock, b=bark, p=pine):");
        String mchoice = keyboard.nextLine();
        mulch = mchoice.charAt(0);
        return calculation3(sqFootage, mulch);
    }
}
