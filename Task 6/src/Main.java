// Создайте систему генерации отчетов, где каждый тип отчета (графики, текстовый, таблица) использует шаблонный метод для определения структуры и формата отчета.

public class Main {
    public static void main(String[] args) {
        Report textReport = new TextReport();
        textReport.generateReport();

        System.out.println("\n");

        Report tableReport = new TableReport();
        tableReport.generateReport();

        System.out.println("\n");

        Report graphReport = new GraphReport();
        graphReport.generateReport();
    }
}