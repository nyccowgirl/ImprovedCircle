package com.company;

/*
Trang Hoang
CS111B - Assignment 5A
 */

public class Circle {
    private Point center;
    private double radius;


    /**
     * Constructs a circle with 2 arguments
     * @param o Point object o
     * @param r Length of radius
     */

    public Circle(Point o, double r) {
        center = new Point(o);
        radius = r;
    }


    /**
     * Constructs a circle with 3 arguments
     * @param xValue Location of x coordinate
     * @param yValue Location of y coordinate
     * @param r Length of radius
     */

    public Circle(double xValue, double yValue, double r) {
        center = new Point(xValue, yValue);
        radius = r;
    }


    /**
     * Constructs a circle with default coordinates of (0,0) and radius of 1
     */

    public Circle() {
        center = new Point(0.0, 0.0);
        radius = 1;
    }


    /**
     * Constructs a circle copying data from a circle object
     * @param c Circle object c
     */

    public Circle(Circle c) {
        center = new Point(c.center);
        radius = c.radius;
    }


    /**
     * Gets the center coordinates of the circle
     * @return Point object with x and y coordinates of the center
     */

    public Point getCenter() {
        return new Point(center);
    }


    /**
     * Sets the center coordinates of the circle
     * @param p Point object p
     */

    public void setCenter(Point p) {
        center = p;
    }


    /**
     * Sets the x coordinate of a circle.
     * @param value Location of the x coordinate
     */

    public void setX(double value) {
        center.setX(value);
    }


    /**
     * Gets the x coordinate of a circle.
     * @return Location of the x coordinate
     */

    public double getX() {
        return center.getX();
    }


    /**
     * Sets the y coordinate of a circle.
     * @param value Location of the y coordinate
     */

    public void setY(double value) {
        center.setY(value);
    }


    /**
     * Gets the y coordinate of a circle.
     * @return Location of the y coordinate.
     */

    public double getY() {
        return center.getY();
    }


    /**
     * Sets the radius of a circle.
     * @param value Length of a radius
     */

    public void setRadius(double value) {
        radius = value;
    }


    /**
     * Gets the radius of a circle.
     * @return Length of a radius
     */

    public double getRadius() {
        return radius;
    }


    /**
     * Calculates the area of a circle.
     * @return The area of a circle
     */

    public double getArea() {
        return (Math.PI * Math.pow(radius, 2.0));
    }


    /**
     * Determines whether two circles touch or overlap. Returns true if they do, and false otherwise.
     * @param c Circle object for another circle
     * @return True if the two circles touch or overlap. Otherwise, false
     */

    public boolean doesOverlap(Circle c) {
        return (radius + c.getRadius()) >= center.distanceTo(c.center);
    }


    /**
     * Displays data members of Circle class
     * @return X and Y-coordinates, and radius of circle
     */

    public String toString() {
        return "(" + center.getX() + ", " + center.getY() + ")\n" + "radius: " + radius + "\n";
    }


    /**
     * Determines whether two circles are equal to each other. Returns true if they are, and false otherwise.
     * @param c Circle object c
     * @return True if the two circles are equal. Otherwise, false.
     */

    public boolean equals(Circle c) {
        return center.equals(c.center) && radius == c.radius;
    }
}

