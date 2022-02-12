package ru.course.tarasova.shape_main;

import ru.course.tarasova.shape.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Shape getMaxArea(Shape[] shapes) {
        Arrays.sort(shapes, new AreaComparator());
        return shapes[0];
    }

    private static Shape getSecondMaxPerimeter(Shape[] shapes) {
        Arrays.sort(shapes, new PerimeterComparator());
        return shapes[1];
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(8),
                new Square(2),
                new Circle(10),
                new Circle(5),
                new Rectangle(8, 10),
                new Rectangle(6, 15),
                new Triangle(-2, 0, 1, 4, 4, -2),
                new Triangle(-4, 5, -3, 3, -1, 3),
        };

        System.out.println("Фигура с максимальной площадью - " + getMaxArea(shapes));
        System.out.println("Фигура со вторым по величине периметром - " + getSecondMaxPerimeter(shapes));

        System.out.println("___________________Сравним фигуры___________________");

        System.out.println("Сравним два квадрата:");
        if (new Square(8).equals(new Square(8))) {
            System.out.println("Фигуры одинаковые!");
        } else {
            System.out.println("Фигуры разные!");
        }

        System.out.println("Сравним два треугольника:");
        if (new Triangle(-2, 0, 1, 4, 4, -2).equals(new Triangle(-2, -2, 1, 4, 4, -2))) {
            System.out.println("Фигуры одинаковые!");
        } else {
            System.out.println("Фигуры разные!");
        }

        System.out.println("Сравним два круга:");

        System.out.println("Введите радиус первого и второго круга:");
        Scanner scanner = new Scanner(System.in);

        double radius1 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();

        if (new Circle(radius1).equals(new Circle(radius2))) {
            System.out.println("Фигуры одинаковые!");
        } else {
            System.out.println("Фигуры разные!");
        }

        System.out.println("Сравним два прямоугольника:");

        System.out.println("Введите длины сторон первого прямоугольника(начиная с меньшей):");

        double shorterSideLength1 = scanner.nextDouble();
        double longerSideLength1 = scanner.nextDouble();

        System.out.println("Введите длины сторон второго прямоугольника(начиная с меньшей):");

        double shorterSideLength2 = scanner.nextDouble();
        double longerSideLength2 = scanner.nextDouble();

        if (new Rectangle(shorterSideLength1, longerSideLength1).equals(new Rectangle(shorterSideLength2, longerSideLength2))) {
            System.out.println("Фигуры одинаковые!");
        } else {
            System.out.println("Фигуры разные!");
        }

        System.out.println("___________________Сравним хэш-коды___________________");

        System.out.println("Сравним хэш-коды двух разных фигур:");
        if (new Square(8).hashCode() == new Circle(6).hashCode()) {
            System.out.println("Хэш-коды одинаковые!");
        } else {
            System.out.println("Хэш-коды разные!");
        }

        System.out.println("Сравним хэш-коды двух одинаковых фигур:");
        if (new Rectangle(8, 10).hashCode() == new Rectangle(8, 10).hashCode()) {
            System.out.println("Хэш-коды одинаковые!");
        } else {
            System.out.println("Хэш-коды разные!");
        }
    }
}