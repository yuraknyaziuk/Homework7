package com.company.Collections;

import com.company.Gender;
import com.company.Person;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Person person = new Person("Darek", "CAYD", Gender.MALE);
        Person person2 = new Person("Faght", "DARAYD", Gender.MALE);
        Person person3 = new Person("ELizavet", "Fartuna", Gender.MALE);
        Person person4 = new Person("Darek", "CAYD", Gender.MALE);
        Person person5 = new Person("ELizavet", "Fartuna", Gender.MALE);
        Set<Person> personSet = new HashSet<>();
        personSet.add(person);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        int i=0;
        for (Person items:personSet
        ) {
            i++;
            System.out.print("Items" + i + ": " + items + "    ");

        }
        System.out.println("\n" + "Length Set = " + personSet.size());


    }
}
