import java.util.HashMap;
public class Tester {
    private KingdomBuilderMain game;
    private Board b;

    public Tester() {
        game = new KingdomBuilderMain();
        b = new Board(1, 2, 3, 4);
    }

    public String toString() {
        String board = "";
        HashMap tiles = b.getBoard();
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 20; c++) {

            }
        }
        return board;
    }
//
//    int i;
//    int r = 0;
//    int c = 0;
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
//        for (i = 0; i < 100; i++) {
//        double[] coord = {r, c};
//        Object[] temp = boards[b1];
//        tiles.put(coord, new HexTile((String)(boards[b1][i])));
//        if (c == 9) {r++; c =
//        c++;
//    }
//    r = 0;
//    c = 11;
//        for (i = 0; i < 100; i++) {
//        double[] coord = {r, c};
//        tiles.put(coord, new HexTile((String)(boards[b2][i])));
//        r++;
//        c++;
//    }
//    r = 11;
//    c = 0;
//        for (i = 0; i < 100; i++) {
//        double[] coord = {r, c};
//        tiles.put(coord, new HexTile((String)(boards[b3][i])));
//        r++;
//        c++;
//    }
//    r = 11;
//    c = 11;
//        for (i = 0; i < 100; i++) {
//        double[] coord = {r, c};
//        tiles.put(coord, new HexTile((String)(boards[b4][i])));
//        r++;
//        c++;
//    }
}
