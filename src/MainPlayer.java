public class MainPlayer extends Player {
    private int numWins;
    private int numLosses;
    private int numDraws;

    public MainPlayer() {
        this.name = "";
        this.numWins = 0;
        this.numLosses = 0;
        this.numDraws = 0;
    }

    public MainPlayer(String name, char value) {
        this.name = name;
        this.value = value;
        this.numWins = 0;
        this.numLosses = 0;
        this.numDraws = 0;
    }

    public String getName() {
        return this.name;
    }
    
    public char getValue() {
        return this.value;
    }

    public void addWins() {
        this.numWins += 1;
    }

    public void addLosses() {
        this.numLosses += 1;
    }

    public void addDraws() {
        this.numDraws += 1;
    }

    public int getWins() {
        return this.numWins;
    }

    public int getLosses() {
        return this.numLosses;
    }

    public int getDraws() {
        return this.numDraws;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public char generateRoshambo() {
        return this.value;
    }

    /*
    specs wanted a generateRoshambo that took in an input and put that out
    im doing things a little differently so doing things differnetly???

    public char generateRoshambo(String input) {
        return input.toLowerCase().charAt(0);
    }


    */
}
