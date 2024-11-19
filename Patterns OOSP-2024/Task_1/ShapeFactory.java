package org.example.task1;

public class ShapeFactory {
    // Метод для создания фигур
    public static Shape createShape(String shapeType, double... parameters) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                if (parameters.length == 1) {
                    return new Circle(parameters[0]);
                } else {
                    throw new IllegalArgumentException("Для круга требуется один параметр: радиус.");
                }
            case "triangle":
                if (parameters.length == 3) {
                    return new Triangle(parameters[0], parameters[1], parameters[2]);
                } else {
                    throw new IllegalArgumentException("Для треугольника требуются три параметра: три стороны.");
                }
            case "rectangle":
                if (parameters.length == 2) {
                    return new Rectangle(parameters[0], parameters[1]);
                } else {
                    throw new IllegalArgumentException("Для прямоугольника требуются два параметра: ширина и высота.");
                }
            default:
                throw new IllegalArgumentException("Неизвестный тип фигуры: " + shapeType);
        }
    }
}
