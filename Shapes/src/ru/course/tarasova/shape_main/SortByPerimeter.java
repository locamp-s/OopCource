package ru.course.tarasova.shape_main;

import ru.course.tarasova.shape.Shape;

import java.util.Comparator;

public class SortByPerimeter implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        double parameter1 = o1.getPerimeter();
        double parameter2 = o2.getPerimeter();

        return Double.compare(parameter2, parameter1);
    }
}