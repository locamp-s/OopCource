package ru.course.tarasova.shape_main;

import ru.course.tarasova.shape.Shape;

import java.util.Comparator;

public class SortByArea implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        double parameter1 = o1.getArea();
        double parameter2 = o2.getArea();

        return Double.compare(parameter2, parameter1);
    }
}
