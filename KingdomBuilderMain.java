import java.util.ArrayList;
import java.util.Collections;

public class KingdomBuilderMain {
    private ArrayList<Player> players;
    private ArrayList<String> pointCards, discardedBiomes, pointCardsall;
    private ArrayList<Card> terrains;
    private int turn, num1, num2, num3, num4;
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

        //choosing boards
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

        //
        players.add(new Player("red"));
        players.add(new Player("purple"));
        players.add(new Player("green"));
        players.add(new Player("orange"));
        for(int i = 0; i < 3; i++){
            int x = (int)(Math.random() * pointCardsall.size());
            pointCards.add(pointCardsall.get(x));
            pointCardsall.remove(x);
        }
        turn = 0;
        resetTerrainDeck();
//        terrains.add("s");
//        terrains.add("g");
//        terrains.add("d");
//        terrains.add("c");
//        terrains.add("m");
//        terrains.add("w");
//        terrains.add("f");
        discardedBiomes = new ArrayList<String>();
        end = false;
        runGame();
        //choose 4 random numbers out of 8, create a board object passing in the 4 numbers to the constructor in the order they are chosen
    }

    public void resetTerrainDeck() {
        terrains.clear();
        for (int i = 0; i < 5; i++) {
            terrains.add(0, new Card("s"));
            terrains.get(0).setVisibility(false);
        }
        for (int i = 0; i < 5; i++) {
            terrains.add(0, new Card("g"));
            terrains.get(0).setVisibility(false);
        }
        for (int i = 0; i < 5; i++) {
            terrains.add(0, new Card("d"));
            terrains.get(0).setVisibility(false);
        }
        for (int i = 0; i < 5; i++) {
            terrains.add(0, new Card("c"));
            terrains.get(0).setVisibility(false);
        }
        for (int i = 0; i < 5; i++) {
            terrains.add(0, new Card("f"));
            terrains.get(0).setVisibility(false);
        }
        Collections.shuffle(terrains);
    }

    public void runGame() {
        while (!end) {
            playTurn();
            if (turn == 3) {
                for (int i = 0; i < players.size(); i++) {
                    if (players.get(i).getNumSettlements() == 0) {
                        //might have issues?
                        endGame();
                        break;
                    }
                }
            }
            nextTurn();
        }
    }

    public void playTurn() {

    }

    public void nextTurn(){
        ArrayList<Action> temp = players.get(turn).getActions();
        for (int i = 0; i < temp.size(); i++) {
            temp.get(i).setUsed(false);
        }
        players.get(turn).setTerrain(null);
        turn++;
        int choiceTerrain = (int)(Math.random()*25);
        players.get(turn).setTerrain(terrains.get(choiceTerrain));
        terrains.remove(choiceTerrain);
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
