package org.example.task5;

import java.util.ArrayList;
import java.util.List;

public class User implements Observable {
    private String name;
    private List<Observer> followers;

    public User(String name) {
        this.name = name;
        this.followers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Подписка и отписка наблюдателей
    @Override
    public void addObserver(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        followers.remove(observer);
    }

    // Уведомление наблюдателей о событии
    @Override
    public void notifyObservers(String message) {
        for (Observer follower : followers) {
            follower.update(name + ": " + message);
        }
    }

    // Методы для различных действий
    public void post(String content) {
        notifyObservers("опубликовал пост: " + content);
    }

    public void comment(String comment) {
        notifyObservers("оставил комментарий: " + comment);
    }

    public void like(String likedContent) {
        notifyObservers("поставил лайк на: " + likedContent);
    }
}
