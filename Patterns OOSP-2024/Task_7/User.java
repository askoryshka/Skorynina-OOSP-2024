package org.example.task7;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String address;

    // Конструктор класса User
    public User(String firstName, String lastName, String email, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    // Геттеры для всех полей
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Переопределение метода toString для вывода информации о пользователе
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
