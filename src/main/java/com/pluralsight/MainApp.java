package com.pluralsight;



import com.pluralsight.shapes.Circle;
import com.pluralsight.shapes.Square;
import com.pluralsight.shapes.Triangle;

import java.awt.*;
import java.util.*;


public class MainApp {
    public static Scanner myScanner = new Scanner(System.in);
    public static ArrayList <Shape>  shapes = new ArrayList<>(); // creating the list of shapes


    public static void main(String[] args) {

        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(500, 500); // Create a new World with specified width and height
        Turtle userTurtle = new Turtle(world, -100, -100); // Create a new Turtle at the specified location


        boolean home = true;

        while (home) {
            String homeScreen = """
                    Welcome to Turtle Paint Home
                    1. Add Shape
                    2. Save Image
                    0. Exit 
                    """;
            System.out.println(homeScreen);
            System.out.print("Please choose from the following: ");
            String choice = myScanner.nextLine();

            switch (choice) {
                case "1":
                    addShape();
                    break;
                case "2":
                    saveImage();
                    break;
                case "0":
                    home = false;
                    break;
                default:
                    System.out.println("Not a valid option\n\n\n");

            }


        }
    }

    private static void saveImage() {


    }

    private static void addShape() {
        boolean shapeScreen = true;

        while (shapeScreen) {

            // User input for shape details
            System.out.println("Select a Shape: \n1. Square\n2. Circle\n3.Triangle");
            int shapeInput = myScanner.nextInt();
            myScanner.nextLine();
            System.out.println("Enter border width: ");
            int border = myScanner.nextInt();
            myScanner.nextLine();
            System.out.println("Enter shape color: ");
            String color2 = myScanner.nextLine();
            Color color = convertedColor(color2);
            System.out.println("Enter location (x): ");
            int x = myScanner.nextInt();
            System.out.println("Enter location (y): ");
            int y = myScanner.nextInt();
            // System.out.print(x + "," + y);
            Point location = new Point(x, y);

            // The world is your canvas
            World world = new World(500, 500); // Create a new World with specified width and height
            Turtle userTurtle = new Turtle(world, -100, -100); // Create a new Turtle at the specified location


            // Creating shape based on user input
            Shape shape = null;
            if (shapeInput == 1) {
                System.out.println("Enter side length of Square: ");
                int squareSide = myScanner.nextInt(); // getting input for length
                System.out.println("Generating image...");
                Square userSquare = new Square(location, color, border, userTurtle, squareSide);
                    userSquare.paint(world.getGraphics());





            } else if (shapeInput == 2) {
                System.out.println("Enter radius of circle : ");
                int circleRadius = myScanner.nextInt(); // getting radius input

                System.out.println("Generating image...");
                Circle userCircle = new Circle(location, color, border, userTurtle, circleRadius);
                userCircle.paint(world.getGraphics());

            } else if (shapeInput == 3) {
                System.out.println("Enter base of Triangle: ");
                int base = myScanner.nextInt();
                System.out.println("Enter height of triangle: ");
                int height = myScanner.nextInt();

                System.out.println("Generating image...");
                Triangle userTriangle = new Triangle(location, color, border, userTurtle, base, height);
                userTriangle.paint(world.getGraphics());
            }

            // Adding shapes to array list
            shapes.add(shape);


            // asking user if they would like to make another shape
            myScanner.nextLine();
            System.out.println("Would you like to make another shape? (Y/N)");
            String anotherShape = myScanner.nextLine();
            if (anotherShape.equalsIgnoreCase("N")) {
                shapeScreen = false;
            } else if (anotherShape.equalsIgnoreCase("Y")) {
                shapeScreen = true;
            } else {
                System.out.println("\nEnter a Valid Option");

            }

        }
    }

    private static Color convertedColor(String color) {
        final Map<String, Color> colorMap = new HashMap<>();

        colorMap.put("black", Color.BLACK);
        colorMap.put("blue", Color.BLUE);
        colorMap.put("cyan", Color.CYAN);
        colorMap.put("gray", Color.GRAY);
        colorMap.put("green", Color.GREEN);
        colorMap.put("magenta", Color.MAGENTA);
        colorMap.put("orange", Color.ORANGE);
        colorMap.put("pink", Color.PINK);
        colorMap.put("red", Color.RED);
        colorMap.put("white", Color.WHITE);
        colorMap.put("yellow", Color.YELLOW);


        color.trim().toLowerCase();

        Color color1 = colorMap.get(color);
        return color1;

    }



}