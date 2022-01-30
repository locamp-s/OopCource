package ru.course.tarasova.range_main;

import ru.course.tarasova.range.Range;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало первого диапазона: ");
        double from = scanner.nextDouble();

        System.out.println("Введите конец первого диапазона: ");
        double to = scanner.nextDouble();

        System.out.println("Введите начало второго диапазона: ");
        double from2 = scanner.nextDouble();

        System.out.println("Введите конец второго диапазона: ");
        double to2 = scanner.nextDouble();

        System.out.println("Введите число для проверки: ");
        double number = scanner.nextDouble();

        Range firstInterval = new Range(from, to);
        Range secondInterval = new Range(from2, to2);

        System.out.println("Длина первого диапазона: " + firstInterval.getLength());
        System.out.println("Длина первого диапазона: " + secondInterval.getLength());
        System.out.println("Принадлежит ли число первому диапазону: " + firstInterval.isInside(number));
        System.out.println("Принадлежит ли число второму диапазону: " + secondInterval.isInside(number));

        System.out.println("Интервал-пересечения двух диапазонов: " + firstInterval.getIntersectionInterval(secondInterval));
        System.out.println("Объединение двух диапазонов: " + Arrays.toString(firstInterval.getUnion(secondInterval)));
        System.out.println("Разность двух диапазонов: " + Arrays.toString(firstInterval.getDifference(secondInterval)));

    }
}