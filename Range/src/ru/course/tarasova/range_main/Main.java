package ru.course.tarasova.range_main;

import ru.course.tarasova.range.Range;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало первого диапазона:");
        double from1 = scanner.nextDouble();

        System.out.println("Введите конец первого диапазона:");
        double to1 = scanner.nextDouble();

        System.out.println("Введите начало второго диапазона:");
        double from2 = scanner.nextDouble();

        System.out.println("Введите конец второго диапазона:");
        double to2 = scanner.nextDouble();

        System.out.println("Введите число для проверки:");
        double number = scanner.nextDouble();

        Range range1 = new Range(from1, to1);
        Range range2 = new Range(from2, to2);

        System.out.println("Длина первого диапазона: " + range1.getLength());
        System.out.println("Длина первого диапазона: " + range2.getLength());
        System.out.println("Принадлежит ли число первому диапазону: " + range1.isInside(number));
        System.out.println("Принадлежит ли число второму диапазону: " + range2.isInside(number));
        System.out.println("Интервал-пересечения двух диапазонов: " + range1.getIntersection(range2));
        System.out.println("Объединение двух диапазонов: " + Arrays.toString(range1.getUnion(range2)));
        System.out.println("Разность двух диапазонов: " + Arrays.toString(range1.getDifference(range2)));
    }
}