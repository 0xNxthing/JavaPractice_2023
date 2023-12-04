public class ScannerAdapter implements Scan{
    private Scanner scanner;

    public ScannerAdapter(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void scan() {
        scanner.scan();
    }
}
