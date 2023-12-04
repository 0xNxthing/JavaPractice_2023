public class GraphReport extends Report{
    @Override
    protected void generateHeader() {
        System.out.println("Графический отчёт: Заголовок графика");
    }

    @Override
    protected void generateBody() {
        System.out.println("Графический отчёт: График данных");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Графический отчёт: Прочие данные");
    }
}
