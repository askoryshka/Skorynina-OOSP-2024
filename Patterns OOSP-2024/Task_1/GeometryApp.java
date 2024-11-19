package org.example.task1;

public class GeometryApp {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle", 5.0);
        Shape triangle = ShapeFactory.createShape("triangle", 3.0, 4.0, 5.0);
        Shape rectangle = ShapeFactory.createShape("rectangle", 4.0, 6.0);

        // Вызываем метод draw для каждой фигуры
        circle.draw();
        triangle.draw();
        rectangle.draw();
    }
}
