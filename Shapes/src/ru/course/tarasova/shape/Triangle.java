package ru.course.tarasova.shape;

public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double xMax;
    private double yMax;
    private double xMin;
    private double yMin;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getMaxX() {
        xMax = Math.max(x1, x2);
        return Math.max(xMax, x3);
    }

    public double getMinX() {
        xMin = Math.min(x1, x2);
        return Math.min(xMin, x3);
    }

    public double getMaxY() {
        yMax = Math.max(y1, y2);
        return Math.max(yMax, y3);
    }

    public double getMinY() {
        yMin = Math.min(y1, y2);
        return Math.min(yMin, y3);
    }

    @Override
    public double getWidth() {
        return getMaxX() - getMinX();
    }

    @Override
    public double getHeight() {
        return getMaxY() - getMinY();
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
    }

    @Override
    public double getPerimeter() {
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        return a + b + c;
    }

    @Override
    public String toString() {
        return "треугольник с координатами: " + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2
                + ", x3=" + x3 + ", y3=" + y3;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + Double.hashCode(x1);
        result = prime * result + Double.hashCode(x2);
        result = prime * result + Double.hashCode(x3);
        result = prime * result + Double.hashCode(y1);
        result = prime * result + Double.hashCode(y2);
        result = prime * result + Double.hashCode(y3);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Triangle p = (Triangle) o;
        return x1 == p.x1 && x2 == p.x2 && x3 == p.x3 && y1 == p.y1 && y2 == p.y2 && y3 == p.y3;
    }
}