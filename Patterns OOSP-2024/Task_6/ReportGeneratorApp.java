package org.example.task6;

public class ReportGeneratorApp {
    public static void main(String[] args) {
        // Создаем отчеты разных типов
        Report graphReport = new GraphReport();
        Report textReport = new TextReport();
        Report tableReport = new TableReport();

        // Генерация отчетов
        System.out.println("=== Генерация отчета с графиком ===");
        graphReport.generateReport();

        System.out.println("\n=== Генерация текстового отчета ===");
        textReport.generateReport();

        System.out.println("\n=== Генерация табличного отчета ===");
        tableReport.generateReport();
    }
}
