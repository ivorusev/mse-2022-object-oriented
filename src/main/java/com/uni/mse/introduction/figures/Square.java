package com.uni.mse.introduction.figures;

public class Square extends Figure {


    public Square(Point point, int side) {
        super(point);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    private int side;
}
