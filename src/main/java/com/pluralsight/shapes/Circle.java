package com.pluralsight.shapes;

import com.pluralsight.Turtle;

import java.awt.*;

public class Circle extends Shape {
    int radius ;

    public Circle(Point location, Color color, int border, Turtle userTurtle) {
        super(location, color, border, userTurtle);
        this.radius = radius;
    }

    @Override
    public void paint(Graphics g) {


    }
}
