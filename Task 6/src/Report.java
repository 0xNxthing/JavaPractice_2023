abstract class Report {
    public final void generateReport() {
        generateHeader();
        generateBody();
        generateFooter();
        formatReport();
    }

    protected abstract void generateHeader();
    protected abstract void generateBody();
    protected abstract void generateFooter();

    private void formatReport() {
        System.out.println("Отчет отформатирован.");
    }
}
