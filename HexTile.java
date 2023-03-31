public class HexTile {
    private String type;

    private boolean edge;
    private Player occupant;

    public HexTile(String t) {
        type = t;
        edge = false;

        occupant = null;
    }

    public void setOccupancy(Player p) {occupant = p;}

    public Player getOccupancy() {return occupant;}

    public String getType() {return type;}

    public void setEdge() {edge = true;}
}
