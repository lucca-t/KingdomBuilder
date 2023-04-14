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
        int y = 0;
        int x = 0;
        for (y = 0; y < 10; y++) {
            for (x = 10; x < 20; x++) {
                double[] coord = new double[2];
                if (y%2 == 0) {
                    coord[0] = y;
                    coord[1] = x;
                }
                else {
                    coord[0] = y;
                    coord[1] = x + 0.5;
                }
                tiles.put(coord, new HexTile((String)(boards[b1][i])));
                i++;
            }
        }
        for (y = 0; y < 10; y++) {
            for (x = 0; x < 10; x++) {
                double[] coord = new double[2];
                if (y%2 == 0) {
                    coord[0] = y;
                    coord[1] = x;
                }
                else {
                    coord[0] = y;
                    coord[1] = x + 0.5;
                }
                tiles.put(coord, new HexTile((String)(boards[b2][i])));
                i++;
            }
        }
        for (y = 10; y < 20; y++) {
            for (x = 0; x < 10; x++) {
                double[] coord = new double[2];
                if (y%2 == 0) {
                    coord[0] = y;
                    coord[1] = x;
                }
                else {
                    coord[0] = y;
                    coord[1] = x + 0.5;
                }
                tiles.put(coord, new HexTile((String)(boards[b3][i])));
                i++;
            }
        }
        for (y = 10; y < 20; y++) {
            for (x = 10; x < 20; x++) {
                double[] coord = new double[2];
                if (y%2 == 0) {
                    coord[0] = y;
                    coord[1] = x;
                }
                else {
                    coord[0] = y;
                    coord[1] = x + 0.5;
                }
                tiles.put(coord, new HexTile((String)(boards[b1][i])));
                i++;
            }
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
    public void scoreFishermen(ArrayList<Player> players) {
        for(int p = 0; p < players.size(); p++) {
            int cnt = 0;
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                ArrayList<double[]> temp = findAdjacencies(players.get(p).getOccupiedTiles().get(i));
                for(int k = 0; k < temp.size(); k++){
                    cnt+=scoreFishermen(temp.get(k));
                }
            }
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                ArrayList<double[]> temp = findAdjacencies(players.get(p).getOccupiedTiles().get(i));
                for(int k = 0; k < temp.size(); k++){
                    setCheckedFalse(temp.get(k));
                }
            }
            players.get(p).addPoints(cnt);
        }

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
    public void scoreMiners(ArrayList<Player> players) {
        for(int p = 0; p < players.size(); p++) {
            int cnt = 0;
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                ArrayList<double[]> temp = findAdjacencies(players.get(p).getOccupiedTiles().get(i));
                for(int k = 0; k < temp.size(); k++){
                    cnt+=scoreMiners(temp.get(k));
                }
            }
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                ArrayList<double[]> temp = findAdjacencies(players.get(p).getOccupiedTiles().get(i));
                for(int k = 0; k < temp.size(); k++){
                    setCheckedFalse(temp.get(k));
                }
            }
            players.get(p).addPoints(cnt);
        }

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
    public void scoreWorkers(ArrayList<Player> players) {
        for(int p = 0; p < players.size(); p++) {
            int cnt = 0;
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                ArrayList<double[]> temp = findAdjacencies(players.get(p).getOccupiedTiles().get(i));
                for(int k = 0; k < temp.size(); k++){
                    cnt+=scoreWorkers(temp.get(k));
                }
            }
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                ArrayList<double[]> temp = findAdjacencies(players.get(p).getOccupiedTiles().get(i));
                for(int k = 0; k < temp.size(); k++){
                    setCheckedFalse(temp.get(k));
                }
            }
            players.get(p).addPoints(cnt);
        }

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
    public int scoreMerchants(ArrayList<Player> players) {}
    public void scoreDiscoverers(ArrayList<Player> players) {
        for (int p = 0; p < players.size(); p++) {
            ArrayList<Double> temp = new ArrayList<Double>();
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                //get arraylist of all y coordinates of all settlements then get the number of settlements on each y coordinate then return the largest value
                if(!contains(temp, players.get(p).getOccupiedTiles().get(i)[1])) {
                    temp.add(players.get(p).getOccupiedTiles().get(i)[1]);
                }
            }
            players.get(p).addPoints(temp.size());
        }
    }
    public void scoreKnights(ArrayList<Player> players) {
        for (int p = 0; p < players.size(); p++) {
            ArrayList<Double> temp = new ArrayList<Double>();
            ArrayList<Integer> cnts = new ArrayList<Integer>();
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                //get arraylist of all y coordinates of all settlements then get the number of settlements on each y coordinate then return the largest value
                if(!contains(temp, players.get(p).getOccupiedTiles().get(i)[1])) {
                    temp.add(players.get(p).getOccupiedTiles().get(i)[1]);
                }
            }
            for(int i = 0; i < temp.size(); i++){
                double x = temp.get(i);
                int y = 0;
                for(int k = 0; k < players.get(p).getOccupiedTiles().size(); k++){
                    if(players.get(p).getOccupiedTiles().get(k)[1] == x){
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
            players.get(p).addPoints(bigger*2);
        }

    }
    public void scoreHermits(ArrayList<Player> players) {
        for(int p = 0; p < players.size(); p++) {
            ArrayList<Integer> clustersize = new ArrayList<>();
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++) {
                ArrayList<double[]> eminem = getCluster(players.get(p).getOccupiedTiles().get(i), players.get(p));
                clustersize.add(eminem.size());
            }
            players.get(p).addPoints(clustersize.size());
        }
    }
    public int scoreLords(ArrayList<Player> players) {}
    public void scoreCitizens(ArrayList<Player> players) {
        for(int p = 0; p < players.size(); p++) {
            ArrayList<Integer> clustersize = new ArrayList<>();
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                ArrayList<double[]> eminem = getCluster(players.get(p).getOccupiedTiles().get(i), players.get(p));
                clustersize.add(eminem.size());
            }
            int big = 0;
            for(int i = 0; i < clustersize.size(); i++){
                if(clustersize.get(i) > big){
                    big = clustersize.get(i);
                }
            }
            if(big%2== 1){
                big -= 1;
            }
            players.get(p).addPoints(big/2);
        }
    }
    public boolean hasAdjacent(double[] x, ArrayList<double[]> y) {
        for (int i = 0; i < y.size(); i++) {
            if (y.get(i)[0] + 1 == x[0] || y.get(i)[0] + 0.5 == x[0] || y.get(i)[0] - 1 == x[0] || y.get(i)[0] - 0.5 == x[0]) {
                if (y.get(i)[1] + 1 == x[1] || y.get(i)[1] + 0.5 == x[1] || y.get(i)[1] - 1 == x[1] || y.get(i)[1] - 0.5 == x[1]) {
                    return true;
                }
            }
        }
        return false;
    }
    public ArrayList<double[]> getCluster(double[] x, Player p){
        ArrayList<double[]> cluster = new ArrayList<>();
        if(!hasAdjacent(x,p.getOccupiedTiles())){
            cluster.add(x);
            return cluster;
        }
        for(int i = 0; i <  findPlayerAdjacencies(x, p).size(); i++){
            cluster.add(findPlayerAdjacencies(x, p).get(i));
        }
        boolean hasstuff = true;
        while(hasstuff){
            ArrayList<double[]> temp = cluster;
            for(int i = 0; i < temp.size(); i++){
                ArrayList<double[]> spongebob = findPlayerAdjacencies(temp.get(i), p);
                if(spongebob.isEmpty()){
                    hasstuff = false;
                }
                for(int k = 0; k < spongebob.size(); i++){
                    temp.add(spongebob.get(k));
                }
            }
            cluster = temp;
        }
        removeRepeats(cluster);
        return cluster;

    }
    public ArrayList<double[]> findPlayerAdjacencies(double[] coord, Player p){
        ArrayList<double[]> adjacent = findAdjacencies(coord);
        ArrayList<double[]> playeradj = new ArrayList<>();
        for(int i = 0; i < p.getOccupiedTiles().size(); i++){
            for(int k = 0; k < adjacent.size(); k++){
                if(p.getOccupiedTiles().get(i).equals(adjacent.get(k)) && tiles.get(p.getOccupiedTiles().get(i)).getCounted() == false){
                    playeradj.add(p.getOccupiedTiles().get(i));
                    tiles.get(p.getOccupiedTiles().get(i)).setCounted(true);
                }
            }
        }
        return playeradj;
    }
    public void removeRepeats(ArrayList<double[]> x){
        for(int i = 0; i < x.size(); i++){
            for(int k = 0; k < x.size(); i++){
                if(x.get(i).equals(x.get(k))){
                    x.remove(i);
                }
            }
        }
    }

    public void scoreFarmers(ArrayList<Player> players) {
        for (int p = 0; p < players.size(); p++) {
            //2nd - [0-9] both
            //1st - [10-19]x [0-9]y
            //3rd - [0-9]x [10-19]y
            //4th - [10-19] both
            boolean one = false;
            boolean two = false;
            boolean three = false;
            boolean four = false;
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                if(players.get(p).getOccupiedTiles().get(i)[0] >= 10 && players.get(p).getOccupiedTiles().get(i)[0] <= 19 ) {
                    if(players.get(p).getOccupiedTiles().get(i)[1] <= 9) {
                        one = true;
                    }
                }
                if(players.get(p).getOccupiedTiles().get(i)[0] <= 9 && players.get(p).getOccupiedTiles().get(i)[1] <= 9 ) {
                    two = true;
                }
                if(players.get(p).getOccupiedTiles().get(i)[1] >= 10 && players.get(p).getOccupiedTiles().get(i)[1] <= 19 ) {
                    if(players.get(p).getOccupiedTiles().get(i)[0] <= 9) {
                        three = true;
                    }
                }
                if(players.get(p).getOccupiedTiles().get(i)[0] >= 10 && players.get(p).getOccupiedTiles().get(i)[0] <= 19 ) {
                    if(players.get(p).getOccupiedTiles().get(i)[1] >= 10 && players.get(p).getOccupiedTiles().get(i)[1] <= 19 ) {
                        four = true;
                    }
                }
            }
            if(!one){
                break;
            }
            if(!two){
                break;
            }
            if(!three){
                break;
            }
            if(!four){
                break;
            }
            ArrayList<Integer> counts = new ArrayList<Integer>();
            int fr = 0;
            int sc = 0;
            int th = 0;
            int fo = 0;
            for(int i = 0; i < players.get(p).getOccupiedTiles().size(); i++){
                if(players.get(p).getOccupiedTiles().get(i)[0] >= 10 && players.get(p).getOccupiedTiles().get(i)[0] <= 19 ) {
                    if(players.get(p).getOccupiedTiles().get(i)[1] <= 9) {
                        fr++;
                    }
                }
                if(players.get(p).getOccupiedTiles().get(i)[0] <= 9 && players.get(p).getOccupiedTiles().get(i)[1] <= 9 ) {
                    sc++;
                }
                if(players.get(p).getOccupiedTiles().get(i)[1] >= 10 && players.get(p).getOccupiedTiles().get(i)[1] <= 19 ) {
                    if(players.get(p).getOccupiedTiles().get(i)[0] <= 9) {
                        th++;
                    }
                }
                if(players.get(p).getOccupiedTiles().get(i)[0] >= 10 && players.get(p).getOccupiedTiles().get(i)[0] <= 19 ) {
                    if(players.get(p).getOccupiedTiles().get(i)[1] >= 10 && players.get(p).getOccupiedTiles().get(i)[1] <= 19 ) {
                        fo++;
                    }
                }
            }
            counts.add(fo);
            counts.add(th);
            counts.add(sc);
            counts.add(fr);
            int smaller = 10000;
            for(int i = 0; i < counts.size(); i++){
                if(counts.get(i) < smaller){
                    smaller = counts.get(i);
                }
            }
            players.get(p).addPoints(smaller*3);
        }

    }
    public ArrayList<HexTile> findValidPlacements() {}
    public HashMap<double[], HexTile> getBoard(){
        return tiles;
    }
    public HashMap<double[], HexTile> getTiles(){
        return tiles;
    }

}
