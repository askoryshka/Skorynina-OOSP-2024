package org.example.task6;

public class TextReport extends Report {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для текстового отчета...");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных в текстовый формат...");
    }

    @Override
    protected void printReport() {
        System.out.println("Вывод текстового отчета.");
    }
}
