package com.example.demo;

public class Coord {
    private double x;
    private double y;

    public Coord(int r, int c){
        x = c;
        y = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean equals(Coord c) {
        if (this.x == c.getX() && this.y == c.getY()) {
            return true;
        }
        return false;
    }
}
