public class System {
    private Print printer;
    private Scan scanner;

    public System(Print printer, Scan scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    public void printDocument() {
        printer.print();
    }

    public void scanDocument() {
        scanner.scan();
    }
}
