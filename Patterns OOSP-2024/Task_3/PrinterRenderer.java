package org.example.task3;

public class PrinterRenderer implements Renderer {
    @Override
    public void render(String shapeName) {
        System.out.println("Печать " + shapeName + " на принтере.");
    }
}