package com.company;

/*
Trang Hoang
CS111B - Assignment 5A
 */

public class Main {

    public static void main(String[] args) {
	    // use default constructor
        Circle cir1 = new Circle();
        System.out.println("Circle 1:\n" + cir1);

        // use constructor with 2 arguments
        Point ptr = new Point(1.0, 1.0);
        Circle cir2 = new Circle(ptr, 2.0);
        System.out.println("Circle 2:\n" + cir2);

        // use constructor with 3 arguments
        Circle cir3 = new Circle(2.0, 2.0,1.0);
        System.out.println("Circle 3:\n" + cir3);

        // use copy constructor
        Circle cir4 = new Circle(cir1);
        System.out.println("Circle 4:\n" + cir4);

        // tests overlap and toString methods
        System.out.println("Do the following circles overlap?");
        System.out.println(cir2.toString());
        System.out.println(cir3.toString());

        if (cir2.doesOverlap(cir3)) {
            System.out.println("Yes, they overlap!");
        } else {
            System.out.println("No, they do not overlap!");
        }
    }
}

/*
Circle 1:
(0.0, 0.0)
radius: 1.0

Circle 2:
(1.0, 1.0)
radius: 2.0

Circle 3:
(2.0, 2.0)
radius: 1.0

Circle 4:
(0.0, 0.0)
radius: 1.0

Do the following circles overlap?
(1.0, 1.0)
radius: 2.0

(2.0, 2.0)
radius: 1.0

Yes, they overlap!

Process finished with exit code 0
 */
