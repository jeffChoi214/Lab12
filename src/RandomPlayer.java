import java.util.Random;

public class RandomPlayer extends Player {
    public RandomPlayer() {
        Random rn = new Random();
        int choice = rn.nextInt(3) + 1;

        if (choice == 1) {
            this.value = 'r';
        }
        else if (choice == 2) {
            this.value = 'p'; 
        }
        else {
            this.value = 's'; 
        }

        this.name = "";
    }
    
    public RandomPlayer(String name) {
        Random rn = new Random();
        int choice = rn.nextInt(3) + 1;

        if (choice == 1) {
            this.value = 'r';
        }
        else if (choice == 2) {
            this.value = 'p'; 
        }
        else {
            this.value = 's'; 
        }

        this.name = name; 
    }

    public String getName() {
        return this.name;
    }

    public char getValue() {
        return this.value;
    }

    public String printValue() {
        if (this.value == 'r') {
            return "Rock";
        }
        else if (this.value == 'p') {
            return "Paper";
        }
        else {
            return "Scissors";
        }
    }

    @Override
    public char generateRoshambo() {
        return this.value;
    }
}
