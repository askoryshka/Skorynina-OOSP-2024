package org.example.task1;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован треугольник со сторонами: " + sideA + ", " + sideB + ", " + sideC);
    }
}