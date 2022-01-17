package ru.cource.task1.range;

public class Range {
    private double from;
    private double to;


    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getTo() {
        return to;
    }

    public double getFrom() {
        return from;
    }

    public double GetLength(double from, double to) {
        return to - from;
    }

    public boolean isInside(double number) {
        return number >= this.from && number <= this.to;
    }
}
