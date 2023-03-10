import java.util.ArrayList;
import java.util.HashSet;
public class Board {

    private int location;
    private int boardType;
    private ArrayList<HexTile> corners;
    private HashSet<HexTile> tiles;

    public Board(int loc, int bT) {
        location = loc;
        boardType = bT;
    }

}
