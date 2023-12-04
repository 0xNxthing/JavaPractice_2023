public class TableReport extends Report{
    @Override
    protected void generateHeader() {
        System.out.println("Табличный отчет: Заголовок таблицы");
    }

    @Override
    protected void generateBody() {
        System.out.println("Табличный отчет: Таблица данных");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Табличный отчет: Итоги");
    }
}
