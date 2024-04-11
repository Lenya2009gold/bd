package bd.bd;

import javafx.scene.control.Alert;

public class Alerts {
    protected static void showErrSQL(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR); // Создаем новый Alert типа ERROR
        alert.setTitle("SQLExp"); // Заголовок окна
        alert.setHeaderText(null); // Не используем текст заголовка
        System.out.println(message);
        alert.setContentText(message); // Основное сообщение ошибки
        alert.showAndWait(); // Показываем Alert и ждем, пока пользователь его закроет
    }
    protected static void showErr(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR); // Создаем новый Alert типа ERROR
        alert.setTitle("Ошибька"); // Заголовок окна
        alert.setHeaderText(null); // Не используем текст заголовка
        System.out.println(message);

        alert.setContentText(message); // Основное сообщение ошибки
        alert.showAndWait(); // Показываем Alert и ждем, пока пользователь его закроет
    }
    protected static void showSuc(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION); // Создаем новый Alert типа ERROR
        alert.setTitle("Всё хорошо"); // Заголовок окна
        alert.setHeaderText(null); // Не используем текст заголовка
        System.out.println(message);
        alert.setContentText(message); // Основное сообщение ошибки
        alert.showAndWait(); // Показываем Alert и ждем, пока пользователь его закроет
    }

}
