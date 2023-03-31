import java.util.ArrayList;
import java.util.HashMap;
public class Board {

    private int location;
    private int boardType;
    private HashMap<int[], HexTile> tiles;
    String[] board1 = {"d", "d", "c", "w", "w", "f", "f", "f", "g", "g", "c", "castle"};
    public Board(int loc, int bT) {
        location = loc;
        boardType = bT;
    }

    public void score() {

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
