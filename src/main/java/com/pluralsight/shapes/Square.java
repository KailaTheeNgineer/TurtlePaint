package com.pluralsight.shapes;

import com.pluralsight.Turtle;
import com.pluralsight.World;

import java.awt.*;

public class Square extends Shape {

    int side; // all sides are equal

    public Square(Point location, Color color, int border, Turtle userTurtle, int side) {
        super(location, color, border, userTurtle);
        this.side = side;
    }



    @Override
    public void paint(Graphics g) {

        userTurtle.setPenWidth(border);
        userTurtle.setColor(color);

        userTurtle.turnRight(0);
        userTurtle.penDown();
        userTurtle.forward(side);
        userTurtle.turnRight(90);
        userTurtle.forward(side);
        userTurtle.turnRight(90);
        userTurtle.forward(side);
        userTurtle.turnRight(90);
        userTurtle.forward(side);
        userTurtle.penUp();


    }

}