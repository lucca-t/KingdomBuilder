import java.util.HashMap;
public class Tester {
    private KingdomBuilderMain game;
    private Board b;
    private HashMap<double[], HexTile> tiles;

    public static void main(String[] args){
        String board = "";
        HashMap tiles = b.getBoard();
        for (int r = 0; r < 20; r++) {
            if(r%2 == 0){
                for (double c = 0.5; c < 20.5; c++) {
                    double[] coord = {r, c};
                    board += tiles.get(coord);
                }

            }
            else{
                for (double c = 0.0; c < 20.0; c++) {
                    double[] coord = {r, c};
                    board += tiles.get(coord);

                }
            }

        }
        System.out.println(board);
    }
//    public Tester() {
//        game = new KingdomBuilderMain();
//        b = new Board(1, 2, 3, 4);
//        tiles = b.getTiles();
//    }

    /**for (int y = 0; y < 10; y++) {
     * for (int x = 0; x < 10; x++) {
     *
     *     if (r%2 == 0) {
     *         double[] coord = {r, c}
     *     }
     *     else {
     *      *         double[] coord = {r, c + 0.5}
     *      *     }
     * }
     }
     *
     */
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
////
////    int i;
////    int r = 0;
////    int c = 0;
////        for (i = 0; i < 100; i++) {
////        double[] coord = {r, c};
////        Object[] temp = boards[b1];
////        tiles.put(coord, new HexTile((String)(boards[b1][i])));
////        if (c == 9) {r++; c =
////        c++;
////    }
////    r = 0;
////    c = 11;
////        for (i = 0; i < 100; i++) {
////        double[] coord = {r, c};
////        tiles.put(coord, new HexTile((String)(boards[b2][i])));
////        r++;
////        c++;
////    }
////    r = 11;
////    c = 0;
////        for (i = 0; i < 100; i++) {
////        double[] coord = {r, c};
////        tiles.put(coord, new HexTile((String)(boards[b3][i])));
////        r++;
////        c++;
////    }
////    r = 11;
////    c = 11;
////        for (i = 0; i < 100; i++) {
////        double[] coord = {r, c};
////        tiles.put(coord, new HexTile((String)(boards[b4][i])));
////        r++;
////        c++;
////    }
//}
