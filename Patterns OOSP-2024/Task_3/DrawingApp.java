package org.example.task3;

public class DrawingApp {
    public static void main(String[] args) {
        // Создаем устройства вывода
        Renderer monitorRenderer = new MonitorRenderer();
        Renderer printerRenderer = new PrinterRenderer();
        Renderer plotterRenderer = new PlotterRenderer();

        // Создаем фигуры с указанием устройства вывода
        Shape circleOnMonitor = new Circle(monitorRenderer);
        Shape squareOnPrinter = new Square(printerRenderer);
        Shape triangleOnPlotter = new Triangle(plotterRenderer);

        // Отображаем фигуры на различных устройствах
        circleOnMonitor.draw();      // Отображение Круг на мониторе.
        squareOnPrinter.draw();      // Печать Квадрат на принтере.
        triangleOnPlotter.draw();    // Отрисовка Треугольник на плоттере.
    }
}
