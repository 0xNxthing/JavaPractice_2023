// Создайте класс "Менеджер подключений к базе данных", который обеспечивает единственное соединение с базой данных.

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DBConnector connectionManager = DBConnector.getInstance();

        Connection connection = connectionManager.getConnection();

        connectionManager.closeConnection();
    }
}