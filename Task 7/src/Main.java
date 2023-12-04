// Реализуйте паттерн "Строитель" для создания объектов "Задача" (Task) с описанием, приоритетом и датой завершения.

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Task task = new Task.TaskBuilder()
                .setDescription("Курсовая работа")
                .setPriority(1)
                .setEndDate(new Date(23, 12, 15))
                .build();

        System.out.println("Описание задачи - " + task.getDescription());
        System.out.println("Приоритет - " + task.getPriority());
        System.out.println("Дата завершения - " + task.getEndDate());
    }
}