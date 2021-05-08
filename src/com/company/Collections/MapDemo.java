package com.company.Collections;

import com.company.Gender;
import com.company.Person;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Person person = new Person("Faght", "DARAYD", Gender.MALE);
        Person person2 = new Person("Vika", "ARAYD", Gender.FEMALE);
        Person person3 = new Person("Darek", "CAYD", Gender.MALE);
        Person person4 = new Person("Filip", "Paderak", Gender.MALE);
        Person person5 = new Person("ELizaveta", "Fartuna", Gender.FEMALE);


        Map<Integer, Person> personHashMap = new HashMap<>();
        personHashMap.put(1, person);
        personHashMap.put(24, person5);
        personHashMap.put(35, person2);
        personHashMap.put(47, person3);
        personHashMap.put(65, person4);
        for (Map.Entry<Integer, Person> items:personHashMap.entrySet()
        ) {
            System.out.println(items.getKey() + " - " + items.getValue());

        }
        System.out.println("\n" + "Length Map = " + personHashMap.size());

    }
}
