package com.pluralsight.shapes;

import com.pluralsight.Turtle;

import java.awt.*;

public class Circle extends Shape {
    int radius ;

    public Circle(Point location, Color color, int border, Turtle userTurtle, int radius) {
        super(location, color, border, userTurtle);
        this.radius = radius;
    }

    @Override
    public void paint(Graphics g) {

        userTurtle.setPenWidth(border);
        userTurtle.setColor(color);


        int steps = 100; // specifying the number of small segments of steps to make the circle
        double angle = 360.00 / steps;
        double steplength = 2 * Math.PI * radius / steps;

        userTurtle.turnRight(0);
        userTurtle.penDown();

        for(int i = 0; i < steps; i ++) {
            userTurtle.forward(steplength);
            userTurtle.turnRight(angle);

        }
        userTurtle.penUp();


    }
}
