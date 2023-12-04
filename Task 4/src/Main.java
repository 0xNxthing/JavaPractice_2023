// Реализуйте систему для интеграции с разными видами оборудования для печати (принтеры, сканеры) с использованием адаптеров.

public class Main {
    public static void main(String[] args) {
        Printer printerOne = new PrinterOne();
        Scanner scannerOne = new ScannerOne();

        Print printerAdapter = new PrinterAdapter(printerOne);
        Scan scannerAdapter = new ScannerAdapter(scannerOne);

        System system = new System(printerAdapter, scannerAdapter);

        system.printDocument();
        system.scanDocument();
    }
}