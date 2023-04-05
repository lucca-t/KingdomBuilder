import java.util.ArrayList;

public class Player{
    private int points;
    private String settlementColor;
    private int settlements;
    private ArrayList<Action> availableActions;
    private ArrayList<HexTile> occupiedTiles;
    private String currTerrain;

    public Player(String col){
        points = 0;
        settlements = 40;
        settlementColor = col;
        availableActions = null;
        currTerrain = null;
        occupiedTiles = new ArrayList<HexTile>();
    }
    public void setScore(int pnt){
        points = pnt;
    }
    public int getScore(){
        return points;
    }
    public void addActions(Action x){
        availableActions.add(x);
    }
    public Action getAction(int i){
        return availableActions.get(i);
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
    public ArrayList<HexTile> getOccupiedTiles() {
        return occupiedTiles;
    }
}
