public class MainPlayer extends Player {
    public MainPlayer() {
        this.name = "";
    }

    public MainPlayer(String name, char value) {
        this.name = name;
        this.value = value;
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
}
