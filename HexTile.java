public class HexTile {
    private String type;

    private boolean edge;
    private boolean checked;
    private Player occupant;

    public HexTile(String t) {
        type = t;
        edge = false;
        occupant = null;
        checked = false;
    }

    public void setOccupancy(Player p) {occupant = p;}

    public Player getOccupancy() {return occupant;}

    public String getType() {return type;}

    public void setEdge() {edge = true;}
    public void setCheck(boolean c) {
        checked = c;
    }
    public boolean getChecked() {
    return checked;
    }
}
