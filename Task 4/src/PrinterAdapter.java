public class PrinterAdapter implements Print{
    private Printer printer;

    public PrinterAdapter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        printer.print();
    }
}
