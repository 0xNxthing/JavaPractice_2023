// Реализуйте приложение для отслеживания изменений в ценах на недвижимость, где пользователи могут подписаться на уведомления о новых предложениях.

public class Main {
    public static void main(String[] args) {
        Notification user = new Notification();

        Estate estate1 = new Estate("Улица Путилина, д. 1", 3500000.0);
        Estate estate2 = new Estate("Ленинский проспект, д. 74", 4500000.0);

        user.addEstate(estate1);
        user.addEstate(estate2);

        Subscriber user1 = new User("Михаил");
        Subscriber user2 = new User("Любовь");

        user.subscribe(user1);
        user.subscribe(user2);

        Estate estate3 = new Estate("Улица Ростовская, д. 57а", 3200000.0);
        user.addEstate(estate3);
    }
}