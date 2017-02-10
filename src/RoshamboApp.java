import java.util.Scanner;

/*
 * Lab 12 by Jeff Choi 2/10/2017
*/

public class RoshamboApp{
    public static char getUserOption(Scanner sc, Validator validate) {
        char holder = validate.getString(sc).toLowerCase().charAt(0);

        while (holder != 'j' && holder != 's') {
            System.out.println("Please enter J or S!");
            holder = validate.getString(sc).toLowerCase().charAt(0);
        }
        return holder;
    }

    public static char getHandChoice(Scanner sc, Validator validate) {
        char holder = validate.getString(sc).toLowerCase().charAt(0);

        while (holder != 'r' && holder != 'p' && holder != 's') {
            System.out.println("Please enter R or P or S!");
            holder = validate.getString(sc).toLowerCase().charAt(0);
        }
        return holder;
    }

    public static char getContinue(Scanner sc, Validator validate) {
        char holder = validate.getString(sc).toLowerCase().charAt(0);

        while (holder != 'y' && holder != 'n') {
            System.out.println("Please enter Y or N!");
            holder = validate.getString(sc).toLowerCase().charAt(0);
        }
        return holder;

    }

    public static String playGame(MainPlayer player, Player opponent) {
        System.out.println(player.getName() + ": " + player.printValue());
        System.out.println(opponent.getName() + ": " + opponent.printValue());

        if (player.getValue() == 'r' || player.getValue() == 'R') {
            if (opponent.getValue() == 'r' || opponent.getValue() == 'R') {
                return "Draw!";
            }
            else if (opponent.getValue() == 'p' || opponent.getValue() == 'P') {
                return opponent.getName() + " wins!";
            }
            else {
                return player.getName() + " wins!";
            } 
        }
        else if (player.getValue() == 'p' || player.getValue() == 'P') {
            if (opponent.getValue() == 'r' || opponent.getValue() == 'R') {
                return player.getName() + " wins!";
            }
            else if (opponent.getValue() == 'p' || opponent.getValue() == 'P') {
                return "Draw!";
            }
            else {
                return opponent.getName() + " wins!";
            } 

        }
        else {
            if (opponent.getValue() == 'r' || opponent.getValue() == 'R') {
                return opponent.getName() + " wins!";
            }
            else if (opponent.getValue() == 'p' || opponent.getValue() == 'P') {
                return player.getName() + " wins!";
            }
            else {
                return "Draw!";
            } 

        }
    }    


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validate = new Validator();

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("");
        
        System.out.print("Enter your name: ");
        String userName = validate.getString(sc);

        System.out.print("Would you like to play against the Jets(j) or Sharks(s): ");
        char userOption = getUserOption(sc, validate);

        while (true) {
            System.out.print("Rock, paper, or scissors (r/p/s)? ");
            char handChoice = getHandChoice(sc, validate);
            MainPlayer player = new MainPlayer(userName, handChoice);
            String result = "";

            // change below to methods
            if (userOption == 'j') {
                // throw in rock method here
                RockPlayer rockOpponent = new RockPlayer("Jets");
                result = playGame(player, rockOpponent); 
            }
            else {
                RandomPlayer randomOpponent = new RandomPlayer("Sharks");
                result = playGame(player, randomOpponent);
            }
            System.out.println(result);
            System.out.println("");

            System.out.print("Would you like to play again?(y/n) ");
            char toContinue = getContinue(sc, validate);

            if (toContinue == 'n') {
                System.out.println("Thanks for playing!");
                break;
            }

        }



    }

}
