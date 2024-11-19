package org.example.task6;

public class TableReport extends Report {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для табличного отчета...");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных в табличный формат...");
    }

    @Override
    protected void printReport() {
        System.out.println("Вывод отчета в виде таблицы.");
    }
}
