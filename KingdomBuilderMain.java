import java.util.ArrayList;

public class KingdomBuilderMain {
    private ArrayList<Player> players;
    private ArrayList<String> pointCards, terrains, discardedBiomes, pointCardsall;
    private int turn, num1, num2, num3, num4;
    private Player currPlayer;
    private Board board;
    public boolean end;

    public KingdomBuilderMain () {
        pointCardsall.add("Citizen");
        pointCardsall.add("Discoverers");
        pointCardsall.add("Farmers");
        pointCardsall.add("Fishermen");
        pointCardsall.add("Hermits");
        pointCardsall.add("Knights");
        pointCardsall.add("Lords");
        pointCardsall.add("Merchants");
        pointCardsall.add("Miners");
        pointCardsall.add("Workers");

        num1 = (int)(Math.random() * 8) + 1;
        num2 = (int)(Math.random() * 8) + 1;
        while(num1==num2){
            num2 = (int)(Math.random() * 8) + 1;
        }
        num3 = (int)(Math.random() * 8) + 1;
        while(num3==num1 || num3==num2) {
            num3 = (int)(Math.random() * 8) + 1;
        }
        num4 = (int)(Math.random() * 8) + 1;
        while(num4 == num1 || num4 == num2 || num4 == num3){
            num4 = (int)(Math.random() * 8) + 1;
        }
        board = new Board(num1, num2, num3, num4);
        players.add(new Player("red"));
        players.add(new Player("purple"));
        players.add(new Player("green"));
        players.add(new Player("orange"));
        for(int i = 0; i < 3; i++){
            int x = (int)(Math.random() * pointCardsall.size());
            pointCards.add(pointCardsall.get(x));
            pointCardsall.remove(x);
        }
        turn = 1;
        currPlayer = players.get(0);
        terrains.add("s");
        terrains.add("g");
        terrains.add("d");
        terrains.add("c");
        terrains.add("m");
        terrains.add("w");
        terrains.add("f");
        discardedBiomes = null;
        end = false;

        //choose 4 random numbers out of 8, create a board object passing in the 4 numbers to the constructor in the order they are chosen
    }

    public void nextTurn(){
        turn++;
        turn = turn%4;
    }
    public void endGame(){
        end = true;
    }
    public void scorePlayers(){
        //using the board object, pass in each player to score as an argument
        for (int i = 0; i < 4; i++) {
            board.score(players.get(i));
        }
    }
    public ArrayList<Player> getPlayers(){
        return players;
    }
}
