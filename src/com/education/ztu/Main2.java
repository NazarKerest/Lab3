package com.education.ztu;
import com.education.ztu.game.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<>();
        participants.add(new Schoolar("Ivan", 13));
        participants.add(new Student("Mykola", 20));
        participants.add(new Employee("Andriy", 28));
        participants.add(new Schoolar("Olga", 14));
        participants.add(new Student("Mykola", 19));

        // Сортування за ім'ям
        Collections.sort(participants);
        System.out.println("Sorted by name:");
        for (Participant participant : participants) {
            System.out.println(participant);
        }

        // Сортування за віком
        AgeComparator ageComparator = new AgeComparator();
        participants.sort(ageComparator);
        System.out.println("\nSorted by age:");
        for (Participant participant : participants) {
            System.out.println(participant);
        }

        // Сортування з пріорітетом
        PriorityComparator priorityComparator = new PriorityComparator();
        participants.sort(priorityComparator);
        System.out.println("\nSorted with priority:");
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }
}
