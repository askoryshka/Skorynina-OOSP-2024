package org.example.task5;

public class SocialMediaApp {
    public static void main(String[] args) {
        // Создаем пользователей
        User user1 = new User("Алексей");
        User user2 = new User("Мария");

        // Создаем подписчиков (наблюдателей)
        Notification notification1 = new Notification("Ольга");
        Notification notification2 = new Notification("Дмитрий");

        // Подписываем Ольгу и Дмитрия на действия Алексея
        user1.addObserver(notification1);
        user1.addObserver(notification2);

        // Подписываем Ольгу на действия Марии
        user2.addObserver(notification1);

        // Алексей и Мария выполняют действия
        user1.post("Добро пожаловать в мой профиль!");
        user1.comment("Спасибо за комментарий!");
        user2.like("пост Алексея");
    }
}
