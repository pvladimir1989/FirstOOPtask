package com.company;

import java.time.LocalDate;

public class Generator {


    static void studentGenerator() {
        Student[] student = new Student[4];

        student[0] = new Student(1, "Fedorov",
                "Fedor", "Fedorovich", LocalDate.of(1989,02,05),
                "Moscow", 8800, "chemistry", 4, "A");
        student[1] = new Student(2, "Ivanov",
                "Ivan", "Ivanovich", LocalDate.of(1987,01,05),
                "Piter", 8700, "history", 4, "B");
        student[2] = new Student(3, "Petrov",
                "Petr", "Petrovich", LocalDate.of(1991,02,05),
                "Novosibirsk", 8600, "history", 4, "C");
        student[3]=new Student(4, "Vladimirov",
                "Vladimir", "Vladimirovich", LocalDate.of(1995,02,05),
                "Vladimir", 8500, "history", 4, "A");

        System.out.println("Показывает всех студентов");
//        for (int i = 0; i <=3 ; i++) {
//            student[i].show();
//        }

        System.out.println("Показывает студентов на факультете");
        for (int i = 0; i <=3 ; i++) {
            student[i].showFaculty();
        }

        System.out.println("Показывает студентов на курсе и факультете");
        for (int i = 0; i <=3 ; i++) {
            student[i].showFacCourse();
        }

        System.out.println("После определенной даты");
        for (int i = 0; i <=3 ; i++) {
            student[i].showAfterDate();
        }

        System.out.println("Показать студентов из одной группы");
        for (int i = 0; i <=3 ; i++) {
            student[i].showOneGroup();
        }


    }

}
