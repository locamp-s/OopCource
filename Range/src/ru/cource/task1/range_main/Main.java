package ru.cource.task1.range_main;

import ru.cource.task1.range.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона: ");
        double from = scanner.nextDouble();

        System.out.println("Введите конец диапазона: ");
        double to = scanner.nextDouble();

        System.out.println("Введите число для проверки: ");
        double number = scanner.nextDouble();

        Range range = new Range(from, to);

        System.out.println("Длина диапазона: " + range.GetLength(from, to));
        System.out.println("Принадлежит ли число диапазону: " + range.isInside(number));

    }
}
