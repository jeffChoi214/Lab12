public abstract class Player {
    public String name;
    public char value; // may change to int

    public abstract String getName();
    public abstract char getValue();
    public abstract String printValue();
    public abstract char generateRoshambo();
}
