public class HexTile {
    private String type;
    private HexTile TL;
    private HexTile TR;
    private HexTile BL;
    private HexTile BR;
    private HexTile top;
    private HexTile bottom;
    private boolean edge;
    private Player occupant;
    private int hash;

    public HexTile(String t) {
        type = t;
        edge = false;
        occupant = null;
    }

    public void setHashValue(int h) {hash = h;}

    public int getHashValue() {return hash;}

    public void setOccupancy(Player p) {occupant = p;}

    public Player getOccupancy() {return occupant;}

    public String getType() {return type;}

    public HexTile getTL() {return TL;}

    public HexTile getTR() {return TR;}

    public HexTile getBL() {return BL;}

    public HexTile getBR() {return BR;}

    public HexTile getTop() {return top;}

    public HexTile getBottom() {return bottom;}

    public void setEdge() {edge = true;}
}
