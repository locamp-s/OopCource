package ru.course.tarasova.shape_main;

import ru.course.tarasova.shape.*;

import java.util.Arrays;

public class Main {
    public void getMaxArea(double[] shapes) {


        Arrays.sort(shapes);

    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(3);

        Rectangle rectangle1 = new Rectangle(5, 20);
        Rectangle rectangle2 = new Rectangle(5, 3.5);

        Square square1 = new Square(8);

        Triangle triangle1 = new Triangle(0, 0, 1.5, 3, 6.2, 1);

        //Shape [] shapes = new Shape[6];
        double[] shapes = new double[6];

        shapes[0] = circle1.getArea();
        shapes[1] = circle2.getArea();
        shapes[2] = triangle1.getArea();
        shapes[3] = rectangle1.getArea();
        shapes[4] = rectangle2.getArea();
        shapes[5] = square1.getArea();

        //System.out.println(getMaxArea(shapes));
    }
}


