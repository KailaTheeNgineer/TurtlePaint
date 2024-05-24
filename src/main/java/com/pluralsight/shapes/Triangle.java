package com.pluralsight.shapes;

import com.pluralsight.Turtle;

import java.awt.*;

public class Triangle extends Shape {
    int base; // getting base length of triangle
    int height; // getting height of triangle

    public Triangle (Point location, Color color, int border, Turtle userTurtle, int base , int height) {
        super(location, color, border, userTurtle);
        this.base = base;
        this.height = height;
    }

    @Override
    public void paint(Graphics g) {

        userTurtle.setPenWidth(border);
        userTurtle.setColor(color);


        // Pythagorean Theorem
        double triangleLength = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2));

        userTurtle.turnRight(0);
        userTurtle.penDown();
        userTurtle.forward(base);
        userTurtle.turnRight(120);
        userTurtle.forward(triangleLength);
        userTurtle.turnRight(120);
        userTurtle.forward(triangleLength);
        userTurtle.penUp();


    }
}