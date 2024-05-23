package com.pluralsight;

import javax.swing.border.Border;
import java.awt.*;

public abstract class Shape {
    protected Turtle userTurtle;
    protected Point location;
    protected Color color;
    protected int border;

    public Shape(Turtle userTurtle, Point location, Color color, int border) {
        this.userTurtle = userTurtle;
        this.location = location;
        this.color = color;
        this.border = border;
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

    public abstract void paint();
}
