import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
public class Board {

    //desert: d, canyon: c, water: w, forest: s, flowers: f, grass: g, mountains: m, castle: castle
    private int location;
    private HashMap<double[], HexTile> tiles;


    Object[] board1 = {"d", "d", "c", "w", "w", "s", "s", "s", "g", "g", "d", "castle", "c", "w", "s", "s", "s", new Action(1, "Barn", false), "g", "g", "c", "c", "c", "f", "f", "f", "s", "c", "f", "f", "c", "c", "f", "f", "w", "d", "d", "c", "c", "f", "c", "g", "g", "w", "f", "f", "d", "d", "c", "c", "g", "g", new Action(1, "Barn", false), "f", "w", "f", "w", "d", "d", "c", "g", "g", "g", "s", "f", "f", "w", "w", "d", "d", "g", "g", "s", "s", "m", "w", "w", "w", "d", "w", "g", "m", "s", "s", "w", "w", "w", "w", "w", "w", "s", "s", "s", "w", "w", "w", "w", "w", "w", "w"};
    Object[] board2 = {"d", "d", "c", "w", "w", "s", "s", "g", "g", "g", "d", "c", "w", "f", "f", "s", "s", "s", "g", "g", "d", "d", "w", "f", "f", "s", "s", new Action(2, "Oasis", false), "f", "g", "w", "w", "w", "f", "g", "s", "f", "f", "f", "f", "w", "w", "w", "w", "g", "g", "g", "g", "f", "f", "w", "s", "s", "w", "g", "g", "c", "c", "d", "c", "w", "s", "c", "s", "w", "g", "c", "c", "d", "c", "w", "castle", "c", "f", "w", new Action(2, "Oasis", false), "d", "d", "c", "w", "w", "w", "c", "f", "w", "w", "w", "d", "d", "w", "w", "w", "w", "w", "w", "w", "w", "w", "w", "w"};
    Object[] board3 = {"g", "g", "s", "s", "s", "w", "g", "s", "s", "f", "g", "f", "s", "s", "w", "g", "s", "s", "f", "f", "g", "f", "f", "s", "w", "g", "g", "f", "f", "f", "f", "f", "s", "s", "w", "g", "m", "f", "d", "c", "c", "f", "castle", "s", "w", "g", "d", "d", "d", "d", "c", "c", "s", "w", "g", "g", "m", "m", "d", "d", "c", "c", "w", "w", "w", "g", "d", "d", "d", "c", "w", "w", "g", "g", "w", "w", new Action(2, "Harbor", false), "c", "m", "c", "w", "d", "castle", "g", "w", "m", "w", "c", "c", "c", "w", "d", "d", "w", "w", "w", "w", "c", "c", "c"};
    Object[] board4 = {"g", "g", "g", "s", "s", "w", "g", "s", "s", "g", "g", "g", "castle", "s", "w", "g", "s", "s", "s", "g", "f", "f", "g", "s", "s", "w", "g", "g", "s", "f", "f", "c", "g", "s", "w", "f", new Action(2, "Oracle", false), "s", "s", "f", "f", "f", "c", "c", "w", "f", "f", "w", "w", "m", "m", "c", "g", "g", "w", "w", "w", "d", "d", "c", "c", "c", "m", "g", "f", "f", "f", "d", "d", "c", "c", "castle", "d", "m", "d", "f", "f", "c", "c", "w", "w", "w", "d", "d", "d", "d", "m", "c", "c", "w", "w", "w", "w", "d", "d", "d", "d", "d", "c"};
    Object[][] boards = {board1, board2, board3, board4};
    public Board(int b1, int b2, int b3, int b4) {
        int i;
        int r = 0;
        int c = 0;
        for (i = 0; i < 100; i++) {
            double[] coord = {r, c};
            Object[] temp = boards[b1];
            tiles.put(coord, new HexTile((String)(boards[b1][i])));
            r++;
            c++;
        }
        r = 0;
        c = 11;
        for (i = 0; i < 100; i++) {
            double[] coord = {r, c};
            tiles.put(coord, new HexTile((String)(boards[b2][i])));
            r++;
            c++;
        }
        r = 11;
        c = 0;
        for (i = 0; i < 100; i++) {
            double[] coord = {r, c};
            tiles.put(coord, new HexTile((String)(boards[b3][i])));
            r++;
            c++;
        }
        r = 11;
        c = 11;
        for (i = 0; i < 100; i++) {
            double[] coord = {r, c};
            tiles.put(coord, new HexTile((String)(boards[b4][i])));
            r++;
            c++;
        }
    }

    public ArrayList<double[]> findAdjacencies(double[] coord){
        ArrayList<double[]> adjacent = new ArrayList<double[]>();
        double[] left = {coord[0] - 1, coord[1]};
        double[] right = {coord[0] + 1, coord[1]};
        double[] tL = {coord[0] - 0.5, coord[1] + 1};
        double[] tR = {coord[0] + 0.5, coord[1] + 1};
        double[] bL = {coord[0] - 0.5, coord[1] - 1};
        double[] bR = {coord[0] + 0.5, coord[1] - 1};
        adjacent.add(left);
        adjacent.add(right);
        adjacent.add(tL);
        adjacent.add(tR);
        adjacent.add(bL);
        adjacent.add(bR);
        return adjacent;
    }

    public void score(Player p) {
        int temp = p.getScore();
        temp += scoreFishermen(p);
        temp += scoreMiners(p);
        temp += scoreMerchants(p);
        temp += scoreWorkers(p);
        temp += scoreDiscoverers(p);
        temp += scoreKnights(p);
        temp += scoreHermits(p);
        temp += scoreLords(p);
        temp += scoreCitizens(p);
        temp += scoreFarmers(p);
        p.setScore(temp);
    }
    public boolean contains(ArrayList<Double> x, double y){
        for(int i = 0; i < x.size(); i++){
            if(x.get(i) == y){
                return true;
            }
        }
        return false;
    }
    public void setCheckedFalse(double[] crd){
        tiles.get(crd).setCheck(false);
    }
    public int horizontaladj(Player p){
        String col = p.getColor();
        ArrayList<Double> temp = new ArrayList<Double>();
        ArrayList<Integer> cnts = new ArrayList<Integer>();
        for(int i = 0; i < p.getOccupiedTiles().size(); i++){
            //get arraylist of all y coordinates of all settlements then get the number of settlements on each y coordinate then return the largest value
            if(!contains(temp, p.getOccupiedTiles().get(i)[1])) {
                temp.add(p.getOccupiedTiles().get(i)[1]);
            }
        }
        for(int i = 0; i < temp.size(); i++){
            double x = temp.get(i);
            int y = 0;
            for(int k = 0; k < p.getOccupiedTiles().size(); k++){
                if(p.getOccupiedTiles().get(k)[1] == x){
                    y++;
                }
            }
            cnts.add(y);
        }
        int bigger = 0;
        for(int i = 0; i < cnts.size(); i++){
            if(bigger < cnts.get(i)){
                bigger = cnts.get(i);
            }
        }
        return bigger;
    }
    public int scoreFishermen(Player p) {
        int cnt = 0;
        for(int i = 0; i < p.getOccupiedTiles().size(); i++){
            ArrayList<double[]> temp = findAdjacencies(p.getOccupiedTiles().get(i));
            for(int k = 0; k < temp.size(); k++){
                cnt+=scoreFishermen(temp.get(k));
            }
        }
        for(int i = 0; i < p.getOccupiedTiles().size(); i++){
            ArrayList<double[]> temp = findAdjacencies(p.getOccupiedTiles().get(i));
            for(int k = 0; k < temp.size(); k++){
                setCheckedFalse(temp.get(k));
            }
        }
        return cnt;
    }
    public int scoreFishermen(double[] crd){
        if(tiles.get(crd).getType().equals("w") && tiles.get(crd).getChecked() == false){
            tiles.get(crd).setCheck(true);
            return 1;
        }
        else{
            return 0;
        }
    }
    public int scoreMiners(Player p) {
        int cnt = 0;
        for(int i = 0; i < p.getOccupiedTiles().size(); i++){
            ArrayList<double[]> temp = findAdjacencies(p.getOccupiedTiles().get(i));
            for(int k = 0; k < temp.size(); k++){
                cnt+=scoreMiners(temp.get(k));
            }
        }
        for(int i = 0; i < p.getOccupiedTiles().size(); i++){
            ArrayList<double[]> temp = findAdjacencies(p.getOccupiedTiles().get(i));
            for(int k = 0; k < temp.size(); k++){
                setCheckedFalse(temp.get(k));
            }
        }
        return cnt;
    }
    public int scoreMiners(double[] crd){
        if(tiles.get(crd).getType().equals("m") && tiles.get(crd).getChecked() == false){
            tiles.get(crd).setCheck(true);
            return 1;
        }
        else{
            return 0;
        }
    }
    public int scoreWorkers(Player p) {
        int cnt = 0;
        for(int i = 0; i < p.getOccupiedTiles().size(); i++){
            ArrayList<double[]> temp = findAdjacencies(p.getOccupiedTiles().get(i));
            for(int k = 0; k < temp.size(); k++){
                cnt+=scoreWorkers(temp.get(k));
            }
        }
        for(int i = 0; i < p.getOccupiedTiles().size(); i++){
            ArrayList<double[]> temp = findAdjacencies(p.getOccupiedTiles().get(i));
            for(int k = 0; k < temp.size(); k++){
                setCheckedFalse(temp.get(k));
            }
        }
        return cnt;
    }
    public int scoreWorkers(double[] crd){
        if(tiles.get(crd).getType().equals("castle") && tiles.get(crd).getChecked() == false){
            tiles.get(crd).setCheck(true);
            return 1;
        }
        else if(tiles.get(crd).getType().equals("action") && tiles.get(crd).getChecked() == false){
            tiles.get(crd).setCheck(true);
            return 1;
        }
        else{
            return 0;
        }
    }
    public int scoreMerchants() {}
    public int scoreDiscoverers() {}
    public int scoreKnights() {}
    public int scoreHermits() {}
    public int scoreLords() {}
    public int scoreCitizens() {}
    public int scoreFarmers() {}
    public ArrayList<HexTile> findValidPlacements() {}
    public HashMap<double[], HexTile> getBoard(){
        return tiles;
    }

}
