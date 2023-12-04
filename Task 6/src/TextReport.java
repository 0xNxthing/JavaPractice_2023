public class TextReport extends Report{
    @Override
    protected void generateHeader() {
        System.out.println("Текстовый отчет - Заголовок");
    }

    @Override
    protected void generateBody() {
        System.out.println("Текстовый отчет - Текст отчета");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Текстовый отчет - Нижний колонтитул");
    }
}
