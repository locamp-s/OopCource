package ru.course.tarasova.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return number >= from && number <= to;
    }

    public Range getIntersectionInterval(Range secondInterval) {
        if ((secondInterval.from > to) || (from > secondInterval.to)) {
            return null;
        }
        return new Range(Math.max(from, secondInterval.from), Math.min(to, secondInterval.to));
    }

    public Range[] getUnion(Range secondInterval) {
        if (to < secondInterval.from) {
            return new Range[]{new Range(secondInterval.from, to)};
        } else if (from > secondInterval.to) {
            return new Range[]{new Range(secondInterval.from, secondInterval.to), new Range(from, to)};
        } else {
            return new Range[]{new Range(Math.min(from, secondInterval.from), Math.max(to, secondInterval.to))};
        }
    }

    public Range[] getDifference(Range secondInterval) {
        if ((to < secondInterval.from) || (secondInterval.to < from)) {
            return new Range[]{new Range(from, to)};
        } else if (from < secondInterval.from) {
            if (to > secondInterval.to) {
                return new Range[]{new Range(from, secondInterval.from), new Range(secondInterval.to, to)};
            } else {
                return new Range[]{new Range(from, secondInterval.from)};
            }
        } else {
            if (to > secondInterval.to) {
                return new Range[]{new Range(secondInterval.to, to)};
            } else {
                return new Range[]{};
            }
        }
    }
}