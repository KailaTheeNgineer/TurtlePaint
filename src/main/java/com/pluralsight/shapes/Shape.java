package com.pluralsight.shapes;

import com.pluralsight.Turtle;


import java.awt.*;
import java.util.Locale;

public abstract class Shape {
    protected Turtle userTurtle;
    protected Point location;
    protected Color color;
    protected int border;

    public Shape(Point location, Color color, int border, Turtle userTurtle) {
        this.location = location;
        this.color = color;
        this.border = border;
        this.userTurtle = userTurtle;
    }

    public Turtle getUserTurtle() {
        return userTurtle;
    }

    public void setUserTurtle(Turtle userTurtle) {
        this.userTurtle = userTurtle;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    // abstract method for paint
    public abstract void paint(Graphics g);



}