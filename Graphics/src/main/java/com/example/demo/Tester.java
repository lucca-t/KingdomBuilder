package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
public class Tester {
//    private KingdomBuilderMain game;
//    private Board b;
//    private HashMap<double[], HexTile> tiles;

    public static void main(String[] args) {
        //pulling HexTiles
        Board b = new Board(1, 2, 3, 4);
        String board = "";
        HashMap tiles = b.getBoard();
        //String tileString = b.getBoardTemp();
        double[] coord = new double[2];
        coord[0] = 0;
        coord[1] = 1;
//        System.out.println(tiles.get(coord));

        //printing the HashMap of tiles
        System.out.println(b);
        //placing settlements
//        KingdomBuilderMain game = new KingdomBuilderMain();
//        ArrayList<double[]> sC = new ArrayList<double[]>();
//        double[] one = {2, 3.5};
//        sC.add(one);
//        double[] two = {3, 3};
//        sC.add(two);
//        double[] three = {2, 4.5};
//        sC.add(three);
//        game.setSettlementCord(sC);
//
//        String occupancies = "";
//        for (int i = 0; i < sC.size(); i++) {
//             occupancies += game.getBoard().getTiles().get(sC.get(i)).getOccupancy().getColor() + " ";
//        }
////        System.out.println(occupancies);
    }
}