import java.util.ArrayList;

public class Player{
    private int points;
    private String settlementColor;
    private int settlements;
    private ArrayList<Action> actions;
    private ArrayList<double[]> occupiedTiles;
    private String currTerrain;

    public Player(String col){
        points = 0;
        settlements = 40;
        settlementColor = col;
        actions = new ArrayList<Action>();
        currTerrain = "";
        occupiedTiles = new ArrayList<double[]>();
    }
    public void setScore(int pnt){
        points = pnt;
    }
    public int getScore(){
        return points;
    }
    public void addActions(Action x){
        actions.add(x);
    }
    public Action getAction(int i){
        return actions.get(i);
    }
    public ArrayList<Action> getActions() {
        return actions;
    }
    public void setColor(String col){
        settlementColor = col;
    }
    public String getColor(){
        return settlementColor;
    }
    public void setTerrain(String ter){
        currTerrain = ter;
    }
    public String getTerrain(){
        return currTerrain;
    }
    public void decSettlements(int amount){
        settlements -= amount;
    }
    public void addSettlementTile(HexTile h) {
        occupiedTiles.add(h);
    }
    public ArrayList<double[]> getOccupiedTiles() {
        return occupiedTiles;
    }
}
