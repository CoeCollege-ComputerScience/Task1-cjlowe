import java.util.Scanner;

public class PigGame {
    private int wageredPoints;

    Scanner scan = new Scanner(System.in);

    public void StartGame(){
        System.out.println("The Pig Game is played like this,\nEach player rolls a dice and adds to their collective points\nThen that player has the choice to roll again and add to those collective points\nOr not roll again and bank those points.\nYou might choose not to roll again because if you roll a 1,\nYou lose all points that you don't have banked.\n(Enter to continue)");
        scan.nextLine();
        Player p1 = new Player();
        Player p2 = new Player();
        while (checkScore(p1,p2) == null){
            System.out.println("\nPlayer 1's Turn:");
            System.out.println("Banked points: " + p1.getScore());
            playerTurn(p1);
            wageredPoints = 0;
            if (checkScore(p1,p2) != null){
                break;
            }
            System.out.println("\nPlayer 2's Turn:");
            System.out.println("Banked points: " + p2.getScore());
            playerTurn(p2);
            wageredPoints = 0;
        }
        if (p1.getScore() >= 100){
            System.out.println("Congratulations Player 1! You win!");
        }
        else {
            System.out.println("Congratulations Player 2! You win!");
        }
    }

    private Player checkScore(Player one, Player two){
        if (one.getScore() >= 100){
            return one;
        }
        else if (two.getScore() >= 100){
            return two;
        }
        return null;
    }

    private void playerTurn(Player turn){
        int currentNum = turn.roll();
        if (currentNum != 1){
            wageredPoints += currentNum;
            System.out.println("Wagered Points: " + wageredPoints);
            System.out.println("You rolled a " + currentNum + "\nKeep rolling? (Y or N)");
            String response = scan.nextLine();
            while (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N")){
                System.out.println("Invalid Input\nKeep rolling? (Y or N)");
                response = scan.nextLine();
            }
            if (response.equalsIgnoreCase("Y")) {
                playerTurn(turn);
            } else {
                turn.addScore(wageredPoints);
            }
        }
        else {
            System.out.println("You rolled a 1, Sorry!");
            System.out.println("(Enter to continue)");
            scan.nextLine(); //buffer
            wageredPoints = 0;
        }
    }




    private static class Player {
        private int score;
        Dice d6 = new Dice(6);
        public Player() {
        }
        public int getScore() {
            return score;
        }
        private void addScore(int amount) {
            score += amount;
        }
        private int roll(){
            d6.roll();
            return d6.getFaceValue();
        }



    }

}
