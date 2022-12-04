package BeginOOP.StartOOP.GuessGame;

public class GuessGame {
    Player player1;
    Player player2;
    Player player3;

    public  void startGame(){
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int guessPlayer1;
        int guessPlayer2;
        int guessPlayer3;

        boolean isPlayer1_Right = false;
        boolean isPlayer2_Right = false;
        boolean isPlayer3_Right = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("The target number is from 0 to 9... ");

        while (true){
            System.out.println("the target number is " + targetNumber);

            player1.guess();
            player2.guess();
            player3.guess();

            guessPlayer1 = player1.number;
            System.out.println("Player 1: " + guessPlayer1);
            guessPlayer2 = player2.number;
            System.out.println("Player 2: " + guessPlayer2);
            guessPlayer3 = player3.number;
            System.out.println("Player 1: " + guessPlayer3);

            if(guessPlayer1 == targetNumber){
                isPlayer1_Right = true;
            }
            if(guessPlayer2 == targetNumber){
                isPlayer2_Right = true;
            }
            if(guessPlayer3 == targetNumber){
                isPlayer3_Right = true;
            }
            if (isPlayer1_Right || isPlayer2_Right || isPlayer3_Right){
                System.out.println("We have the winner!!!");
                System.out.println("Is the First Player the winner? " + isPlayer1_Right);
                System.out.println("Is the Second Player the winner? " + isPlayer2_Right);
                System.out.println("Is the Third Player the winner? " + isPlayer3_Right);

                System.out.println("The END! have a nice Day!");
                break;

            } else {
                System.out.println("We do not have the winner :( " +
                        "Please Start the game again!");
            }
        }

    }
}
