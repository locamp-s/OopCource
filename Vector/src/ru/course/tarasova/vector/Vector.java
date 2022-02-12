package ru.course.tarasova.vector;

import java.util.Arrays;
import java.util.List;

public class Vector {
    private double[] components;


    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Размерность пространства меньше или равна нулю!");
        }
        components = new double[n];
    }

    public Vector(Vector vector) {
        components = Arrays.copyOf(vector.components, vector.components.length);
    }

    public Vector(double[] arrays) {
        if (arrays.length == 0) {
            throw new IllegalArgumentException("Размерность пространства меньше или равна нулю!");
        }
        components = Arrays.copyOf(arrays, arrays.length);
    }

    public Vector(int n, double[] arrays) {
        if (n == 0) {
            throw new IllegalArgumentException("Размерность пространства меньше или равна нулю!");
        }
        components = Arrays.copyOf(arrays, n);
    }

    public int getSize() {
        return components.length;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("{");
        for (double component : components) {
            string.append(component).append(", ");
        }
        return string.append(components[components.length - 1]).append("}").toString();
    }

//    public double[] getSumVector(double[] components1, double[] components2) {
//
//    }
}
