package org.example.task7;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String address;

    // Методы для установки свойств
    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this; // Возвращаем текущий объект для цепочки вызовов
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    // Метод для создания объекта User
    public User build() {
        return new User(firstName, lastName, email, age, address);
    }
}
