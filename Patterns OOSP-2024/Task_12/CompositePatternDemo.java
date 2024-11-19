package org.example.task12;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Square square1 = new Square();
        Triangle triangle1 = new Triangle();

        CompositeGraphic composite1 = new CompositeGraphic(2);
        composite1.add(circle1);
        composite1.add(square1);

        CompositeGraphic composite2 = new CompositeGraphic(2);
        composite2.add(circle2);
        composite2.add(triangle1);

        CompositeGraphic mainComposite = new CompositeGraphic(2);
        mainComposite.add(composite1);
        mainComposite.add(composite2);

        System.out.println("Рисуем составной объект mainComposite:");
        mainComposite.draw();
    }
}