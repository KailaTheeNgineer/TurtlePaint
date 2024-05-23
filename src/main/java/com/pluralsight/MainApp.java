package com.pluralsight;



import com.pluralsight.shapes.Square;

import java.awt.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class MainApp {
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {


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
            System.out.println("Enter shape width: ");
            int border = myScanner.nextInt();
            myScanner.nextLine();
            System.out.println("Enter shape color: ");
            String color2 = myScanner.nextLine();
            Color color = convertedColor(color2);
            myScanner.nextLine();
            System.out.println("Enter location (x): ");
            int x = myScanner.nextInt();
            System.out.println("Enter location (y): ");
            int y = myScanner.nextInt();
            // System.out.print(x + "," + y);
            Point location = new Point(x, y);


            // Creating shape based on user input

            Shape shape = null;
            if (shapeInput == 1) {
                System.out.println("Enter side length of Square: ");
                int squareSide = myScanner.nextInt();
                // shape = new Square();


            }


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
