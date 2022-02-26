package ru.course.tarasova.shape_main;

import ru.course.tarasova.shape.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Object getFigureWithMaxArea(Shape[] shapes) {
        if (shapes.length == 0){
            return "фигур в массиве нет!";
        }

        Arrays.sort(shapes, new AreaComparator());
        return shapes[0];
    }

    private static Object getFigureWithSecondMaxPerimeter(Shape[] shapes) {
        if (shapes.length == 0){
            return "фигур в массиве нет!";
        }
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

        System.out.println("Фигура с максимальной площадью - " + getFigureWithMaxArea(shapes));
        System.out.println("Фигура со вторым по величине периметром - " + getFigureWithSecondMaxPerimeter(shapes));

        System.out.println("___________________Сравним фигуры___________________");

        System.out.println("Сравним два квадрата.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину стороны первого квадрата:");
        double sideLength1 = scanner.nextDouble();

        System.out.println("Введите длину стороны второго квадрата:");
        double sideLength2 = scanner.nextDouble();

        if (new Square(sideLength1).equals(new Square(sideLength2))) {
            System.out.println("Фигуры одинаковые!");
        } else {
            System.out.println("Фигуры разные!");
        }

        System.out.println("Сравним два треугольника с координатами (-2; 0), (1; 4), (4; -2) и (-2; -2), (1; 4), (4; -2):");
        if (new Triangle(-2, 0, 1, 4, 4, -2).equals(new Triangle(-2, -2, 1, 4, 4, -2))) {
            System.out.println("Фигуры одинаковые!");
        } else {
            System.out.println("Фигуры разные!");
        }

        System.out.println("Сравним два круга:");

        System.out.println("Введите радиус первого круга:");
        double radius1 = scanner.nextDouble();

        System.out.println("Введите радиус второго круга:");
        double radius2 = scanner.nextDouble();

        if (new Circle(radius1).equals(new Circle(radius2))) {
            System.out.println("Фигуры одинаковые!");
        } else {
            System.out.println("Фигуры разные!");
        }

        System.out.println("Сравним два прямоугольника:");

        System.out.println("Введите ширину первого прямоугольника:");
        double width1 = scanner.nextDouble();

        System.out.println("Введите высоту первого прямоугольника:");
        double height1 = scanner.nextDouble();

        System.out.println("Введите ширину второго прямоугольника:");
        double width2 = scanner.nextDouble();

        System.out.println("Введите высоту второго прямоугольника:");
        double height2 = scanner.nextDouble();

        if (new Rectangle(width1, height1).equals(new Rectangle(width2, height2))) {
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