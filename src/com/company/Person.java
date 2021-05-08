package com.company;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Имя='" + firstName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", пол=" + gender +
                '}';
    }
}
