package org.example.task11;

public class PrototypeDemo {
    public static void main(String[] args) {
        // Создаем оригинальные фигуры
        Circle originalCircle = new Circle();
        originalCircle.setX(10);
        originalCircle.setY(20);
        originalCircle.setColor("Red");
        originalCircle.setRadius(15);

        Rectangle originalRectangle = new Rectangle();
        originalRectangle.setX(30);
        originalRectangle.setY(40);
        originalRectangle.setColor("Blue");
        originalRectangle.setWidth(50);
        originalRectangle.setHeight(60);

        // Клонируем фигуры
        Circle clonedCircle = (Circle) originalCircle.clone();
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();

        // Выводим информацию о клонированных фигурах
        System.out.println("Оригинальный круг: " + originalCircle);
        System.out.println("Клонированный круг: " + clonedCircle);

        System.out.println("Оригинальный прямоугольник: " + originalRectangle);
        System.out.println("Клонированный прямоугольник: " + clonedRectangle);

        // Изменяем свойства клонированных фигур
        clonedCircle.setColor("Green");
        clonedRectangle.setWidth(100);

        // Выводим информацию после изменения
        System.out.println("\nПосле изменения клонированных фигур:");
        System.out.println("Оригинальный круг: " + originalCircle);
        System.out.println("Клонированный круг: " + clonedCircle);

        System.out.println("Оригинальный прямоугольник: " + originalRectangle);
        System.out.println("Клонированный прямоугольник: " + clonedRectangle);
    }
}
