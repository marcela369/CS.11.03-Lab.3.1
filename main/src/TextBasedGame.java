import java.util.Scanner;
public class TextBasedGame {

    public static void main(String[] args) {
        String instructionsResult = instructions();
        if (instructionsResult.equals("ok")) {
            int divideResult = divide();
            String holesResult = holes();
            String portalResult = portal();
            double fractionResult = fraction();
            String bridgeResult = bridge();
            System.out.println((bridgeResult));
            int timeResult = time();
            String WoodsChoppingResult = woods();
            System.out.println(WoodsChoppingResult);
            String chestResult = chest();
            System.out.println(chestResult);
            water();
        }
    }

    public static String instructions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Adventure! Enter \"ok\" to continue");
        String userInput = scan.nextLine();
        while (true) {
            if (userInput.equals("ok")) {
                return userInput;
            }
            System.out.println("Please try again");
            userInput = scan.nextLine();
        }
    }

    public static int divide() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Once upon a time, you find yourself stuck in a dungeon." +
                "\nYou try escaping but found yourself stuck with some math obstacles..." +
                "\nThe first question you encounter is: What is 60 divided by 5?");
        int divideInput = scan.nextInt();
        while (true) {
            if (divideInput == 12) {
                return divideInput;
            } else {
                System.out.println("Please try again");
                divideInput = scan.nextInt();
            }
        }
    }

    public static String holes() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Congrats, You made it to the next obstacle!" +
                "\nNow you see 3 holes with different colors" +
                "\nThe color of the holes include: orange, blue, black. Pick a color.");
        String holesInput = scan.nextLine();
        while (true) {
            if (holesInput.equals("black")) {
                return holesInput;
            } else {
                System.out.println("Wrong hole! Try choosing another color");
                holesInput = scan.nextLine();
            }
        }
    }

    public static String portal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Woah.. Where is this place?" + "\nYou see 2 portals." +
                " A purple and a red portal?");
        String portalInput = scan.nextLine();
        while (true) {
            if (portalInput.equals("purple") || portalInput.equals("red")) {
                return portalInput;
            } else {
                System.out.println("Please try again");
                portalInput = scan.nextLine();
            }
        }
    }

    public static double fraction() {
        Scanner scan = new Scanner(System.in);
        System.out.println("teleporting..." +
                "\nYou are in a room with a long and thin ladder." +
                "\nEnter your weight in kg (round to nearest tenth) to see if you can climb up without the ladder snapping.");
        double fractionInput = scan.nextDouble();
        while (true) {
            if (fractionInput <= 1000) {
                System.out.println("You made it up the ladder!");
                return fractionInput;
            } else {
                System.out.println("the ladder snapped!");
            }
        }
    }

    public static String bridge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You see a long and narrow bridge in front of you." +
                "\nThere are 5 hungry crocodiles under the bridge. " +
                "\nWhat are you going to do? run, yolo, or walk?");
        String bridgeInput = scan.nextLine();
        if (bridgeInput.equals("run")) {
            return "You made it across the bridge";
        } else if (bridgeInput.equals("yolo") || bridgeInput.equals("walk")) {
            return "you almost got eaten by the crocodiles!";
        } else {
            return "Invalid input.";
        }
    }

    public static int time() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess how many minutes it'll take you to escape the dungeon");
        int timeResult = scan.nextInt();
        int time = 0;

        while (true) {
            if (timeResult >= 1) {
                int time1 = (time % timeResult);
                int time2 = (time1 + 3);
                int time3 = (time2 * 5);
                int time4 = (time3 - 1);
                System.out.println("It'll take you " + time4 + " minutes to escape.");
                break;
            } else {
                System.out.println("Invalid answer. Try Again");
            }
            timeResult = scan.nextInt();
        }

        return timeResult;
    }

    public static String woods() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You're in a forest and in need of wood. " +
                "Enter your age to see how many trees you'll need to chop down.");

        int age = scan.nextInt();

        int treesChopped = age / 2;
        return "You just chopped down " + treesChopped + " trees and collected the wood";
    }

    public static String chest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are carrying the woods you chopped and see 3 treasure chests under a tree. ");
        System.out.println("Which chest would you like to open? (pick a number from 1 to 3)");
        int chestResult = scan.nextInt();
        while (true) {
            if (chestResult >= 1 && chestResult <= 3) {
                return "A genie popped out and fulfilled one of your wishes: Escape the dungeon asap." +
                        "\n He teleported you to an room with some a path that leads to a door.";
            }
            System.out.println("Please choose again");
            chestResult = scan.nextInt();
        }
    }

    public static void water() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You're SEVEN steps away from the end..." +
                "\nChoose a number wisely between 1 to 1000.");

        int a = scan.nextInt();

        int water = a % 10;

        if (water == 7) {
            System.out.println("CONGRATULATIONS! You escaped the dungeon");
        } else {
            System.out.println("You failed to escape..." +
                    "\nGAME OVER");
        }
    }
}