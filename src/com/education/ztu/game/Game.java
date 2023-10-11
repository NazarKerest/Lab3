package com.education.ztu.game;

public class Game {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Student student1 = new Student("Mykola", 20);
        Student student2 = new Student("Viktoria", 21);
        Employee employee1 = new Employee("Andriy", 28);
        Employee employee2 = new Employee("Oksana", 25);

        // Створюємо команди з використанням generics
        Team<Schoolar> schoolarTeam = new Team<>("Dragon");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Vpered");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Robotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        // Спроба додати учасника іншого типу до команди (помилка)
        //schoolarTeam.addNewParticipant(student1);

        Team<Schoolar> scollarTeam2 = new Team<>("Rozumnyky");
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olga", 14);
        scollarTeam2.addNewParticipant(schoolar3);
        scollarTeam2.addNewParticipant(schoolar4);

        // Гра між командами одного типу (працює)
        schoolarTeam.playWith(scollarTeam2);

        // Гра між командами різних типів (помилка)
        // scollarTeam.playWith(employeeTeam);
    }
}

