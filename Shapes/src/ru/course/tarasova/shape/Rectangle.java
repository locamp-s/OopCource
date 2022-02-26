package ru.course.tarasova.shape;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double shorterSideLength, double longerSideLength) {
        this.width = shorterSideLength;
        this.height = longerSideLength;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "прямоугольник с со сторонами: " + width + "; " + height;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.hashCode(width);
        result = prime * result + Double.hashCode(height);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        Rectangle rectangle = (Rectangle) obj;
        return (width == rectangle.width) && (height == rectangle.height);
    }
}