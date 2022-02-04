package ru.course.tarasova.shape;

public class Rectangle implements Shape {
    private double shorterSideLength;
    private double longerSideLength;

    public Rectangle(double shorterSideLength, double longerSideLength) {
        this.shorterSideLength = shorterSideLength;
        this.longerSideLength = longerSideLength;
    }

    public double getShorterSideLength() {
        return shorterSideLength;
    }

    public void setShorterSideLength(double shorterSideLength) {
        this.shorterSideLength = shorterSideLength;
    }

    public double getLongerSideLength() {
        return longerSideLength;
    }

    public void setLongerSideLength(double longerSideLength) {
        this.longerSideLength = longerSideLength;
    }

    @Override
    public double getWidth() {
        return longerSideLength;
    }

    @Override
    public double getHeight() {
        return shorterSideLength;
    }

    @Override
    public double getArea() {
        return shorterSideLength * longerSideLength;
    }

    @Override
    public double getPerimeter() {
        return 2 * (shorterSideLength + longerSideLength);
    }

    @Override
    public String toString() {
        return "прямоугольник с со сторонами: " + shorterSideLength + "; " + longerSideLength;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.hashCode(shorterSideLength);
        result = prime * result + Double.hashCode(longerSideLength);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Rectangle other = (Rectangle) obj;
        if (shorterSideLength != other.shorterSideLength)
            return false;

        return longerSideLength == other.longerSideLength;
    }
}