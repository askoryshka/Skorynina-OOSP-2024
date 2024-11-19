package org.example.task5;

public class Notification implements Observer {
    private String userName;

    public Notification(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println("Уведомление для " + userName + ": " + message);
    }
}
