import java.util.HashMap;
public class Tester {
    private KingdomBuilderMain game;
//    private Board b;
//    private HashMap<double[], HexTile> tiles;

    public static void main(String[] args) {
        Board b = new Board(1, 2, 3, 4);
        String board = "";
        HashMap tiles = b.getBoard();
        double[] coord = new double[2];
//        for (int r = 0; r < 20; r++) {
//            if (r % 2 == 0) {
//                for (double c = 0.5; c < 20.5; c++) {
//                    coord[0] = r;
//                    coord[1] = c;
////                    double[] coord = {r, c};
//                    board += tiles.get(coord) + " ";
//                }
//
//            } else {
//                for (double c = 0.0; c < 20.0; c++) {
//                    coord[0] = r;
//                    coord[1] = c;
//                    board += tiles.get(coord) + " ";
//
//                }
//            }
//
//        }
        coord[0] = 0;
        coord[1] = 1;
        System.out.println(tiles.get(coord));
//    }
//        String board = "";
//        HashMap tiles = b.getBoard();
//        for (int r = 0; r < 20; r++) {
//            if(r%2 == 0){
//                for (double c = 0.5; c < 20.5; c++) {
//                    double[] coord = {r, c};
//                    board += tiles.get(coord);
//                }
//
//            }
//            else{
//                for (double c = 0.0; c < 20.0; c++) {
//                    double[] coord = {r, c};
//                    board += tiles.get(coord);
//
//                }
//            }
//
//        }
//        System.out.println(board);
//    }
//    public Tester() {
//        game = new KingdomBuilderMain();
//        b = new Board(1, 2, 3, 4);
//        tiles = b.getTiles();
//    }

//    public String toString() {
//        String board = "";
//        HashMap tiles = b.getBoard();
//        for (int r = 0; r < 20; r++) {
//            if(r%2 == 0){
//                for (double c = 0.5; c < 20.5; c++) {
//                    double[] coord = {r, c};
//                    board += tiles.get(coord);
//                }
//
//            }
//            else{
//                for (double c = 0.0; c < 20.0; c++) {
//                    double[] coord = {r, c};
//                    board += tiles.get(coord);
//
//                }
//            }
//
//        }
//        return board;
//    }

    }
    }