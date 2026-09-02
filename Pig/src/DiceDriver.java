public class DiceDriver {
    public static void main(String[] args) {
        Dice d = new Dice(12);
        for (int i = 0; i < 10; i++ ){
            System.out.println(d.roll());
        }
        System.out.println(d.getFaceValue());
    }
}
