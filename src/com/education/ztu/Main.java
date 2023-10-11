package com.education.ztu;
import com.education.ztu.game.Employee;
import com.education.ztu.game.Schoolar;
import com.education.ztu.game.Student;
public class Main {

    public static void main(String[] args) {
        // Створюємо екземпляр класу Employee
        Employee employee1 = new Employee("Andriy", 28);

        // Викликаємо методи класу Employee
        System.out.println("Employee's Name: " + employee1.getName());
        System.out.println("Employee's Age: " + employee1.getAge());

        // Викликаємо методи клонування, hashCode, equals та toString для Employee
        try {
            Employee clonedEmployee = (Employee) employee1.clone();
            System.out.println("Cloned Employee: " + clonedEmployee);

            System.out.println("HashCode of Employee1: " + employee1.hashCode());
            System.out.println("HashCode of Cloned Employee: " + clonedEmployee.hashCode());

            System.out.println("Is employee1 equals to clonedEmployee: " + employee1.equals(clonedEmployee));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Створюємо екземпляр класу Student
        Student student1 = new Student("Mykola", 20);

        // Викликаємо методи класу Student
        System.out.println("Student's Name: " + student1.getName());
        System.out.println("Student's Age: " + student1.getAge());

        // Викликаємо методи клонування, hashCode, equals та toString для Student
        try {
            Student clonedStudent = (Student) student1.clone();
            System.out.println("Cloned Student: " + clonedStudent);

            System.out.println("HashCode of Student1: " + student1.hashCode());
            System.out.println("HashCode of Cloned Student: " + clonedStudent.hashCode());

            System.out.println("Is student1 equals to clonedStudent: " + student1.equals(clonedStudent));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Створюємо екземпляр класу Schoolar
        Schoolar schoolar1 = new Schoolar("Ivan", 13);

        // Викликаємо методи класу Schoolar (з якими ви вже ознайомили)
        System.out.println("Schoolar's Name: " + schoolar1.getName());
        System.out.println("Schoolar's Age: " + schoolar1.getAge());
        System.out.println("Schoolar's League: " + schoolar1.getLeague());

        // Викликаємо методи клонування, hashCode, equals та toString для Schoolar (з якими ви вже ознайомили)
        try {
            Schoolar clonedSchoolar = (Schoolar) schoolar1.clone();
            System.out.println("Cloned Schoolar: " + clonedSchoolar);

            System.out.println("HashCode of Schoolar1: " + schoolar1.hashCode());
            System.out.println("HashCode of Cloned Schoolar: " + clonedSchoolar.hashCode());

            System.out.println("Is schoolar1 equals to clonedSchoolar: " + schoolar1.equals(clonedSchoolar));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
