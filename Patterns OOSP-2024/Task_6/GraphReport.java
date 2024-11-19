package org.example.task6;

public class GraphReport extends Report {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для графика...");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных в формат, подходящий для графиков...");
    }

    @Override
    protected void printReport() {
        System.out.println("Отображение отчета в виде графика.");
    }
}
