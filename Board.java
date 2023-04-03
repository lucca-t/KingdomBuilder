import java.util.ArrayList;
import java.util.HashMap;
public class Board {

    private int location;
    private HashMap<int[], HexTile> tiles;


    Object[] board1 = {"d", "d", "c", "w", "w", "s", "s", "s", "g", "g", "d", "castle", "c", "w", "s", "s", "s", new Action(1, "Barn", false), "g", "g", "c", "c", "c", "f", "f", "f", "s", "c", "f", "f", "c", "c", "f", "f", "w", "d", "d", "c", "c", "f", "c", "g", "g", "w", "f", "f", "d", "d", "c", "c", "g", "g", new Action(1, "Barn", false), "f", "w", "f", "w", "d", "d", "c", "g", "g", "g", "s", "f", "f", "w", "w", "d", "d", "g", "g", "s", "s", "m", "w", "w", "w", "d", "w", "g", "m", "s", "s", "w", "w", "w", "w", "w", "w", "s", "s", "s", "w", "w", "w", "w", "w", "w", "w"};
//    Object[] boards = {board1, board2, board3, board4, board5, board6, board7, board8};
    public Board(int b1, int b2, int b3, int b4) {
        int i;
        int r = 0;
        int c = 0;
        for (i = 0; i < 100; i++) {
            int[] coord = {r, c};
            tiles.put(boards[b1][i], coord);
            r++;
            c++;
        }
        int r = 0;
        int c = 11;
        for (i = 0; i < 100; i++) {
            int[] coord = {r, c};
            tiles.put(boards[b2][i], coord);
            r++;
            c++;
        }
        int r = 11;
        int c = 0;
        for (i = 0; i < 100; i++) {
            int[] coord = {r, c};
            tiles.put(boards[b3][i], coord);
            r++;
            c++;
        }
        int r = 11;
        int c = 11;
        for (i = 0; i < 100; i++) {
            int[] coord = {r, c};
            tiles.put(boards[b4][i], coord);
            r++;
            c++;
        }
    }

    public void score(Player p) {
        scoreFishermen(p);
        scoreMiners(p);
        scoreMerchants(p);
        scoreWorkers(p);
        scoreDiscoverers(p);
        scoreKnights(p);
        scoreHermits(p);
        scoreLords(p);
        scoreCitizens(p);
        scoreFarmers(p);
    }
    public int scoreFishermen() {}
    public int scoreMiners() {}
    public int scoreMerchants() {}
    public int scoreWorkers() {}
    public int scoreDiscoverers() {}
    public int scoreKnights() {}
    public int scoreHermits() {}
    public int scoreLords() {}
    public int scoreCitizens() {}
    public int scoreFarmers() {}
    public ArrayList<HexTile> findValidPlacements() {}

}
