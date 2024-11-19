package org.example.task6;

public abstract class Report {
    // Шаблонный метод
    public final void generateReport() {
        gatherData();
        formatData();
        printReport();
    }

    // Шаги, которые будут реализованы в подклассах
    protected abstract void gatherData();
    protected abstract void formatData();
    protected abstract void printReport();
}
