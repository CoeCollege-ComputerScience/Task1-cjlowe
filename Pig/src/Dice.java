import java.util.Random;

public class Dice {
    private int numSides;
    private int faceValue;
    private Random rand;

    public Dice() {
        this(6);
    }

    public Dice(int numSides) {
        if (numSides < 3){
            throw new IllegalArgumentException("Bad");
        }
        rand = new Random();
        this.numSides = numSides;
        roll();
    }


    public void roll(){
        faceValue = rand.nextInt(numSides)+1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    @Override
    public String toString() {
        return "" +faceValue;
    }
}

