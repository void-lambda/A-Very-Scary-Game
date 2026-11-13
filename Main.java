import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static final int TEXT_SPEED = 30;

    // Clear console
    public static void Clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Text typewriter
    public static void displayText(String text, int delayMs) {
        for (int i=0; i<text.length(); i++) {
            System.out.print(text.charAt(i));
            System.out.flush();
            try {
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println();
    }

    public static void Random() {

    }

    // TEXTS
    static final String[] GREETINGS_LINES = {
        "This game is dedicated to Friday the 13th",
        "Have fun!"
    };

    static final String[] ARRIVAL_LINES = {
        "You just arrived at school camp.",
        "Yeah, it looks pretty mediocre.",
        "Your mom sent you here.",
        "In any case, you should try to get to know some of the other kids here."
    };

    static final String[] HOUSE_ACT_1 = {
        "\"Hai, mai name iz Bob\"",
        "\"Me liking soda, sandwitches end videogames\"",
        "\"Sssdfg.\"",
        "\"me yaes\""
    };

    static final String[] CAMPFIRE_ACT_1 = {
        "\"Hi! My name is Emilia.\"",
        "\"Even at camp, I want to keep learning.\"",
        "\"I am very worried about my grades at school.\"",
        "\"It was nice to meet you!\""
    };

    static final String[] RICK_ACT_1 = {
        "\"Hey, you're distracting me!\"",
        "From what?",
        "\"I am testing out my new piece of equipment, which I built myself.\"",
        "Can you at least say your name to me?",
        "\"Alright... my name is Rick...\""
    };

    static final String[] MOREMI_ACT_1 = {
        "\"What do you want from me, silly?\"",
        "Uhhm... nothing...",
        "\"Come on, you're not here for no reason.\"",
        "But I really...",
        "\"Get out of here and don't talk to me anymore.\""
    };

    static final String[] AWAKENING_LINES = {
        "You woke up to screams outside.",
        "Uhhm... what's happening...?",
        "You go to check the situation outside",
        "That's so cryptic.. where is everyone?",
        "There is no one around"
    };


    String justArrived_3 = "In any case, you should try to get to know some of the other kids here.";

    public static void main(String[] args) {
        Clear();
        
        // Greetings
        for (String line : GREETINGS_LINES) {
            displayText(line, TEXT_SPEED);
            scanner.nextLine();
            Clear();
        }

        // ACT 1
        // Just Arrived Section
        for (String line :  ARRIVAL_LINES) {
            displayText(line, TEXT_SPEED);
            scanner.nextLine();
            Clear();
        }

        // Flags
        boolean flag_1 = false;
        boolean flag_2 = false;
        boolean flag_3 = false;
        boolean flag_4 = false;
        
        // Moving around the camp
        while (true) {
            System.out.println("Where shoud i go now?");
            System.out.println("1) House");
            System.out.println("2) Campfire");
            System.out.println("3) Garden");
            System.out.println("4) Garage");
            System.out.println("5) Go to the bed");
            System.out.print(">>> ");
            String goTo = scanner.nextLine().toLowerCase().trim();

            // Exit Option
            if (goTo.equals("exit")) {
                break;
            }

            // House
            if (goTo.equals("house")) {
                Clear();
                if (flag_1) {
                    displayText("I've already been here", TEXT_SPEED);
                    System.out.print(">>> ");
                    scanner.nextLine();
                    continue;
                }
                for (String line : HOUSE_ACT_1) {
                    displayText(line, TEXT_SPEED);
                    scanner.nextLine();
                    Clear();
                }
                displayText("What a stupid guy...", TEXT_SPEED);
                scanner.nextLine();
                flag_1 = true;
                Clear();
            }

            // Campfire
            if (goTo.equals("campfire")) {
                Clear();
                if (flag_2) {
                    displayText("I've already been here", TEXT_SPEED);
                    System.out.print(">>> ");
                    scanner.nextLine();
                    continue;
                }
                for (String line : CAMPFIRE_ACT_1) {
                    displayText(line, TEXT_SPEED);
                    scanner.nextLine();
                    Clear();
                }
                displayText("She is a cute girl...", TEXT_SPEED);
                scanner.nextLine();
                displayText("but still a nerd.", TEXT_SPEED);
                scanner.nextLine();
                flag_2 = true;
                Clear();
            }

            // Garden
            if (goTo.equals("garden")) {
                Clear();
                if (flag_3) {
                    displayText("I've already been here", TEXT_SPEED);
                    System.out.print(">>> ");
                    scanner.nextLine();
                    continue;
                }
                for (String line : RICK_ACT_1) {
                    displayText(line, TEXT_SPEED);
                    scanner.nextLine();
                    Clear();
                }
                displayText("This guy is truly mysterious...", TEXT_SPEED);
                scanner.nextLine();
                flag_3 = true;
                Clear();
            }

            // Garage
            if (goTo.equals("garage")) {
                Clear();
                if (flag_4) {
                    displayText("I've already been here", TEXT_SPEED);
                    System.out.print(">>> ");
                    scanner.nextLine();
                    continue;
                }
                for (String line : MOREMI_ACT_1) {
                    displayText(line, TEXT_SPEED);
                    scanner.nextLine();
                    Clear();
                }
                displayText("That was so agressive for no reason...", TEXT_SPEED);
                scanner.nextLine();
                flag_4 = true;
                Clear();
            }

            Clear();
        }

        // ACT 2
        // Awakening
        for (String line :  AWAKENING_LINES) {
            displayText(line, TEXT_SPEED);
            scanner.nextLine();
            Clear();
        }

        // Flags
        flag_1 = false;
        flag_2 = false;
        flag_3 = false;
        flag_4 = false;
        
        // Moving around the camp
        while (true) {
            System.out.println("Where shoud i go now?");
            System.out.println("1) House");
            System.out.println("2) Campfire");
            System.out.println("3) Garden");
            System.out.println("4) Garage");
            System.out.println("5) Forest");
            System.out.print(">>> ");
            String goTo = scanner.nextLine().toLowerCase().trim();

            // Exit Option
            if (goTo.equals("exit")) {
                break;
            }

            // House
            if (goTo.equals("house")) {
                Clear();
                if (flag_1) {
                    displayText("I've already been here", TEXT_SPEED);
                    System.out.print(">>> ");
                    scanner.nextLine();
                    continue;
                }
                for (String line : HOUSE_ACT_1) {
                    displayText(line, TEXT_SPEED);
                    scanner.nextLine();
                    Clear();
                }
                displayText("What a stupid guy...", TEXT_SPEED);
                scanner.nextLine();
                flag_1 = true;
                Clear();
            }

            // Campfire
            if (goTo.equals("campfire")) {
                Clear();
                if (flag_2) {
                    displayText("I've already been here", TEXT_SPEED);
                    System.out.print(">>> ");
                    scanner.nextLine();
                    continue;
                }
                for (String line : CAMPFIRE_ACT_1) {
                    displayText(line, TEXT_SPEED);
                    scanner.nextLine();
                    Clear();
                }
                displayText("She is a cute girl...", TEXT_SPEED);
                scanner.nextLine();
                displayText("but still a nerd.", TEXT_SPEED);
                scanner.nextLine();
                flag_2 = true;
                Clear();
            }

            // Garden
            if (goTo.equals("garden")) {
                Clear();
                if (flag_3) {
                    displayText("I've already been here", TEXT_SPEED);
                    System.out.print(">>> ");
                    scanner.nextLine();
                    continue;
                }
                for (String line : RICK_ACT_1) {
                    displayText(line, TEXT_SPEED);
                    scanner.nextLine();
                    Clear();
                }
                displayText("This guy is truly mysterious...", TEXT_SPEED);
                scanner.nextLine();
                flag_3 = true;
                Clear();
            }

            // Garage
            if (goTo.equals("garage")) {
                Clear();
                if (flag_4) {
                    displayText("I've already been here", TEXT_SPEED);
                    System.out.print(">>> ");
                    scanner.nextLine();
                    continue;
                }
                for (String line : MOREMI_ACT_1) {
                    displayText(line, TEXT_SPEED);
                    scanner.nextLine();
                    Clear();
                }
                displayText("That was so agressive for no reason...", TEXT_SPEED);
                scanner.nextLine();
                flag_4 = true;
                Clear();
            }

            Clear();
        }

        Clear();
    }
}