public class RockPlayer extends Player {
    public RockPlayer() {
        this.name = "";
        this.value = 'r';
    }

    public RockPlayer(String name) {
        this.name = name;
        this.value = 'r';    
    }

    public char getValue() {
        return this.value;
    }

    public String printValue() {
        return "Rock"; 
    }

    public String getName() {
        return this.name;
    }
    
    @Override
    public char generateRoshambo() {
        return this.value;
    }


}
