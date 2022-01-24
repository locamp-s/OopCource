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
}
