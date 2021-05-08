package com.company.Collections;

import com.company.Gender;
import com.company.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        Person person = new Person("Faght", "DARAYD", Gender.MALE);
        Person person2 = new Person("Vika", "ARAYD", Gender.FEMALE);
        Person person3 = new Person("Darek", "CAYD", Gender.MALE);
        Person person4 = new Person("Filip", "Paderak", Gender.MALE);
        Person person5 = new Person("ELizaveta", "Fartuna", Gender.FEMALE);
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        int i = 0;
        for (Person items : Collections.unmodifiableList(persons)
        ) {
            i++;
            System.out.print("Items" + i + ": " + items + "      ");

        }
        System.out.println("\n" + "Length List = " + persons.size());
    }
}
