package Java_Text_Game;
import java.util.Scanner;

public class escape_room {
    int stage_num;
    boolean key = false;
    String location;
    String static_options;
    static boolean bed(boolean cuffs, String[] inventory) {
        escape_room choosing = new escape_room();
        escape_room cuff_key = new escape_room();

        Scanner myObj = new Scanner(System.in);
        choosing.static_options = "";
        cuff_key.key = false;
        System.out.println("You decide to check out the bed.");
        if (cuffs == true) {
            while (cuff_key.key == false) {
                System.out.println("Would you like to look at the top of the bed or bottom?");
                System.out.println("=========================");
                System.out.println("Type one of these to look at: top, bottom, or back to return to previous screen");
                choosing.static_options = myObj.nextLine();
                if (choosing.static_options.toLowerCase().equals("top")) {
                    System.out.println("While searching the top of the bed you found a key in " +
                            "your pillow case that fits the hand cuffs allowing you to unlock them" +
                            " and be free from the bed.");
                    cuff_key.key = true;
                } else if (choosing.static_options.toLowerCase().equals("bottom")) {
                    System.out.println("It looks like there is something under the bed, " +
                            "but because you are hand cuffed you can\'t reach it." +
                            " You should look are for something to get the hand cuffs off.");
                }else if (choosing.static_options.toLowerCase().equals("back")) {
                    return true;
                }
            }
        } else {
            while (cuff_key.key == false) {
                if (inventory[1].equals("bedsheets") && inventory[0].equals("crowbar")) {
                    System.out.println("However you don't find anything more of use.");
                    cuff_key.key = true;
                }else {
                    System.out.println("Would you like to look at the top of the bed or bottom?");
                    System.out.println("=========================");
                    System.out.println("Type one of these to look at: top, bottom");
                    choosing.static_options = myObj.nextLine();
                    if (choosing.static_options.toLowerCase().equals("top")) {
                        if (inventory[1].equals("bedsheets")) {
                            System.out.println("You look here again and find nothing more of use.");
                        } else {
                            System.out.println("You decide to take the bed sheets with you. " +
                                    "(BEDSHEETS ADDED TO YOUR INVENTORY)");
                            cuff_key.key = true;
                        }
                    } else if (choosing.static_options.toLowerCase().equals("bottom")) {
                        if (inventory[0].equals("crowbar")) {
                            System.out.println("You look here again and find nothing more of use.");
                        } else {
                            System.out.println("It looks like there is something under the bed. " +
                                    "On a closer inspection you find a small crowbar." +
                                    " (CROWBAR HAS BEEN ADD TO YOUR INVENTORY)");
                            cuff_key.key = true;
                            return true;
                        }
                    }else{
                        System.out.println("That is not a option, please pick something from the options.");
                    }
                }
            }
        }
        return false;
    }

    static int window(String[] inventory) {
        System.out.println("You decide to check the window for a possible means of escape.");
        System.out.println("On closer inspection of the window, you find some metal bars blocking your" +
                " way of going out the window.");
        System.out.println("It also looks like the window is two stories off the ground.");
        if (inventory[2].equals("pipe cutters")){
            System.out.println("You realise that you can use the pipe cutters to remove the bars from the window.");
            if (inventory[1].equals("bedsheets")){
                System.out.println("Also, by using the bedsheets to create a rope, you are able to scale" +
                        " down the building to freedom.");
                return 1;
            }else{
                System.out.println("You then realize that even if you did get the bars off there is no" +
                        " way to get safely down.");
                System.out.println("You need to find some way of getting down safely or find other way out.");
            }
        }else{
            System.out.println("You realize that there is no way you are going to be able to get through those bars.");
            System.out.println("You need to find a way to cut those bars or find another way out.");
        }
        return 0;
    }

    static int door(String[] inventory){
        escape_room choosing = new escape_room();
        Scanner myObj = new Scanner(System.in);
        choosing.static_options = "";
        System.out.println("You decide to check the door for a possible means of escape.");
        System.out.println("On closer inspection of the door, you find it to be a very strong and sturdy door " +
                "that is also locked.");
        System.out.println("The only way to open it is by typing a 4 digit code into a keypad.");
        while (inventory[4].equals("ID badge that has \"Door Code: 4536\" written on it")){
            System.out.println("You remember that you saw the code for the door written on that ID card.");
            System.out.println("What was the code again?");
            System.out.println("=========================");
            System.out.println("Type one of these: The code, inventory to see what items you have, " +
                    "or back to continue searching.");
            choosing.static_options = myObj.nextLine();
            if (choosing.static_options.toLowerCase().equals("4536")){
                System.out.println("You open the door and run down a long hallway, until you find a stairwell.");
                System.out.println("Running to the bottom of the stair well you find " +
                        "an exit door that leads outside, which you burst through.");
                return 2;
            } else if (choosing.static_options.toLowerCase().equals("inventory")) {
                for (String i : inventory) {
                    if (i == ""){
                    }else {
                        System.out.println(i);
                    }
                }
                System.out.println("=========================");
            } else if (choosing.static_options.toLowerCase().equals("back")) {
                System.out.println("You decide to go back and look around some more.");
                return 0;
            }
        }
        System.out.println("You realize that there is no way you are going to be able " +
                "to get through the door without the code.");
        System.out.println("You need to find the code or find another way out.");

        return 0;
    }

    static String wardrobe(String[] inventory){
        escape_room choosing = new escape_room();
        Scanner myObj = new Scanner(System.in);
        choosing.static_options = "";
        System.out.println("You decide to check out the wardrobe.");
        while (inventory[0].equals("crowbar")){
            System.out.println("Using the crowbar, you were easily able to open the wardrobe.");
            if (inventory[2].equals("pipe cutters") && inventory[3].equals("metal coat hanger")){
                System.out.println("You look through the wardrobe, but find nothing more of use.");
                return "";
            } else if (inventory[2].equals("pipe cutters")) {
                System.out.println("Inside you find a old coat hung up.");
                System.out.println("what would you like to check?");
                System.out.println("=========================");
                System.out.println("Type one of these: old coat or back to look else where");
                choosing.static_options = myObj.nextLine();
                if (choosing.static_options.toLowerCase().equals("old coat")){
                    System.out.println("You decide to pick up the old coat");
                    System.out.println("As soon as you grab the coat, it falls apart, but searching through " +
                            "the remains you find a metal coat hanger.");
                    System.out.println("(METAL COAT HANGER ADDED TO YOUR INVENTORY)");
                    System.out.println("=========================");
                    return "metal coat hanger";
                } else if (choosing.static_options.toLowerCase().equals("back")) {
                    return "";
                }else{
                    System.out.println("That is not a option, please pick something from the options.");
                }
            } else if (inventory[3].equals("metal coat hanger")) {
                System.out.println("Inside you find a toolbox.");
                System.out.println("what would you like to check?");
                System.out.println("=========================");
                System.out.println("Type one of these: toolbox or back to look else where");
                choosing.static_options = myObj.nextLine();
                if (choosing.static_options.toLowerCase().equals("toolbox")) {
                    System.out.println("You decide to look into the toolbox and find pipe cutters.");
                    System.out.println("(PIPE CUTTERS ADDED TO YOUR INVENTORY)");
                    System.out.println("=========================");
                    return "pipe cutters";
                }else{
                    System.out.println("That is not a option, please pick something from the options.");
                }
            } else{
                System.out.println("Inside you find a old coat hung up and a toolbox.");
                System.out.println("what would you like to check?");
                System.out.println("=========================");
                System.out.println("Type one of these: old coat, toolbox, or back to look else where");
                choosing.static_options = myObj.nextLine();
                if (choosing.static_options.toLowerCase().equals("old coat")){
                    System.out.println("You decide to pick up the old coat");
                    System.out.println("As soon as you grab the coat, it falls apart, but searching through " +
                            "the remains you find a metal coat hanger.");
                    System.out.println("(METAL COAT HANGER ADDED TO YOUR INVENTORY)");
                    System.out.println("=========================");
                    return "metal coat hanger";
                } else if (choosing.static_options.toLowerCase().equals("toolbox")) {
                    System.out.println("You decide to look into the toolbox and find pipe cutters.");
                    System.out.println("PIPE CUTTERS ADDED TO INVENTORY.");
                    System.out.println("=========================");
                    return "pipe cutters";
                } else if (choosing.static_options.toLowerCase().equals("back")) {
                    return "";
                }else{
                    System.out.println("That is not a option, please pick something from the options.");
                }
            }

        }
        System.out.println("Upon closer inspection you find the door to the wardrobe stuck shut.");
        System.out.println("Maybe you can find something to pry it open with.");

        return "";
    }
    static boolean grate(String[] inventory){
        System.out.println("You decide to check out the floor grate.");
        System.out.println("Looking down into the grate you see some sort ID badge that " +
                "some one would clip to their shirt.");
        if (inventory[3].equals("metal coat hanger")){
            System.out.println("You realize you can reshape the metal coat hanger into " +
                    "something that can reach the badge.");
            System.out.println("Lower the coat hanger down you pull the ID badge out of the grate.");
            System.out.println("The ID badge has something written on it, \"Door Code: 4536\"" );
            System.out.println("(ID BADGE ADDED TO YOUR INVENTORY)");
            return true;
        }else{
            System.out.println("You unable reach the ID badge.");
            System.out.println("There has got to be some way of reaching it.");
        }
        return false;
    }

    public static void main(String[] args) {
        String[] inventory = {"", "", "", "", ""};
        // Will contain crowbar, bedsheets, pipe cutters, metal coat hanger,
        // and an ID badge that has "Door Code: 4536" written on it
        boolean hand_cuffed = true;
        String wardrobe_item;
        escape_room stage = new escape_room();
        escape_room choosing = new escape_room();
        Scanner myObj = new Scanner(System.in);
        stage.stage_num = 0;
        choosing.location = "";
        System.out.println("You wake up in a dimly lit room hand " +
                "cuffed to a metal bed frame that has been bolted" +
                "to the floor.");
        System.out.println("You don't know how you got here, " +
                "but you do know that you can't stay here.");
        System.out.println("=========================");
        while (stage.stage_num < 1){
            if (hand_cuffed == true){
                System.out.println("Better find a way to get these hand cuffs off.");
                System.out.println("From where you are, you can see a window, " +
                        "a door, a wardrobe, a desk, a grate on the ground, and a the bed.");
                System.out.println("=========================");
                System.out.println("Type one of these to look at: window, door, wardrobe, grate, bed, " +
                        "or inventory to see what items you have");
                choosing.location = myObj.nextLine();
                if (choosing.location.toLowerCase().equals("bed")) {
                    if (bed(hand_cuffed, inventory) == false) {
                        hand_cuffed = false;
                    }
                } else if (choosing.location.toLowerCase().equals("inventory")) {
                    for (String i : inventory) {
                        if (i == ""){
                        }else {
                            System.out.println(i);
                        }
                    }
                    System.out.println("=========================");
                } else if (choosing.location.toLowerCase().equals("window")||
                        choosing.location.toLowerCase().equals("door")||
                        choosing.location.toLowerCase().equals("wardrobe")||
                        choosing.location.toLowerCase().equals("grate")){
                    System.out.println("You are hand cuffed to the bed and can't look at that right now");
                }else{
                    System.out.println("This is not one of the options. Please choose from the chosen locations.");
                }
//                stage_num = Integer.parseInt(myObj.nextLine());
            }else {
                System.out.println("From where you are, you can see a window, " +
                        "a door, a wardrobe, a desk, a grate on the ground, and a the bed.");
                System.out.println("=========================");
                System.out.println("Type one of these to look at: window, door, wardrobe, desk, grate, bed, " +
                        "or inventory to see what items you have");
                choosing.location = myObj.nextLine();
                if (choosing.location.toLowerCase().equals("bed")) {
                    if (bed(hand_cuffed, inventory) == true) {
                        inventory[0] = "crowbar";
                    }else{
                        inventory[1] = "bedsheets";
                    }
                }else if (choosing.location.toLowerCase().equals("inventory")) {
                    for (String i : inventory) {
                        if (i == ""){
                        }else {
                            System.out.println(i);
                        }
                    }
                    System.out.println("=========================");
                }else if (choosing.location.toLowerCase().equals("window")){
                    stage.stage_num = window(inventory);
                }else if (choosing.location.toLowerCase().equals("wardrobe")){
                    wardrobe_item = wardrobe(inventory);
                    if (wardrobe_item == "pipe cutters"){
                        inventory[2] = "pipe cutters";
                    } else if (wardrobe_item == "metal coat hanger") {
                        inventory[3] = "metal coat hanger";
                    }
                }else if (choosing.location.toLowerCase().equals("door")){
                    stage.stage_num = door(inventory);
                }else if (choosing.location.toLowerCase().equals("grate")){
                    if (grate(inventory) == true){
                        inventory[4] = "ID badge that has \"Door Code: 4536\" written on it";
                    }
                }else{
                    System.out.println("That is not one of the options, pick something from the options.");
                }
            }
        }
        if (stage.stage_num == 1) {
            System.out.println("You look back as you run away from the building " +
                    "and you see someone looking at you from the window you climbed down from.");
            System.out.println("You feel a chill run down your spine as you make a promise to yourself to never " +
                    "come back there again.");
            System.out.println("Climbing escape achieved - ending 1 of 2");

        }else if (stage.stage_num == 2){
            System.out.println("You look back as you run away from the building " +
                    "and you see someone watching you from the doorway of the building exit you just came from.");
            System.out.println("You feel a chill run down your spine as you make a promise to yourself to never " +
                    "come back there again.");
            System.out.println("Walking out escape achieved - ending 2 of 2");
        }else{

        }
    }
}
