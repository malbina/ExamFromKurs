package com.company;

public class Circle {
    double raduis;

    public Circle() {
    }

    public Circle(double raduis) {

        this.raduis = raduis;
    }

    public double getRaduis() {

        return raduis;
    }

    public void setRaduis(double raduis) {

        this.raduis = raduis;
    }

    public double getArea(double raduis) {
        final double PI = 3.14;
        return PI * raduis * raduis;
    }
}