//Задача 1.
//        Создать классы, спецификации которых приведены ниже. Определить. Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//        1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа. Создать массив объектов. Вывести: a) список студентов заданного факультета; b) списки студентов для каждого факультета и курса; c) список студентов, родившихся после заданного года; d) список учебной группы.
//        2. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета. Создать массив объектов. Вывести: a) список покупателей в алфавитном порядке; b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
//        3. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз. Создать массив объектов. Вывести: a) список пациентов, имеющих данный диагноз; b) список пациентов, номер медицинской карты которых находится в заданном интервале.
//        4. Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки. Создать массив объектов. Вывести: a) список абитуриентов, имеющих неудовлетворительные оценки; b) список абитуриентов, у которых сумма баллов выше заданной; c) выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов (вывести также полный список абитуриентов, имеющих полупроходную сумму).
//        5. Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета. Создать массив объектов. Вывести: a) список книг заданного автора; b) список книг, выпущенных заданным издательством; c) список книг, выпущенных после заданного года.
//        6. House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип здания, Срок эксплуатации. Создать массив объектов. Вывести: a) список квартир, имеющих заданное число комнат; b) список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке; c) список квартир, имеющих площадь, превосходящую заданную. КЛАССЫ И ОБЪЕКТЫ 89
//        7. Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Дебет, Кредит, Время городских и междугородных разговоров. Создать массив объектов. Вывести: a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное; b) сведения об абонентах, которые пользовались междугородной связью; c) сведения об абонентах в алфавитном порядке.
//        8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер. Создать массив объектов. Вывести: a) список автомобилей заданной марки; b) список автомобилей заданной модели, которые эксплуатируются больше n лет; c) список автомобилей заданного года выпуска, цена которых больше указанной.
//        9. Product: id, Наименование, UPC, Производитель, Цена, Срок хранения, Количество. Создать массив объектов. Вывести: a) список товаров для заданного наименования; b) список товаров для заданного наименования, цена которых не превосходит заданную; c) список товаров, срок хранения которых больше заданного.
//        10. Train: Пункт назначения, Номер поезда, Время отправления, Число мест (общих, купе, плацкарт, люкс). Создать массив объектов. Вывести: a) список поездов, следующих до заданного пункта назначения; b) список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа; c) список поездов, отправляющихся до заданного пункта назначения и имеющих общие места.
//        11. Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута, Марка, Год начала эксплуатации, Пробег. Создать массив объектов. Вывести: a) список автобусов для заданного номера маршрута; b) список автобусов, которые эксплуатируются больше заданного срока; c) список автобусов, пробег у которых больше заданного расстояния.
//        12. Airline: Пункт назначения, Номер рейса, Тип самолета, Время вылета, Дни недели. Создать массив объектов. Вывести: a) список рейсов для заданного пункта назначения; b) список рейсов для заданного дня недели; c) список рейсов для заданного дня недели, время вылета для которых больше заданного.


package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    int id;
    String surname;
    String name;
    String secondName;
    LocalDate birthdate;
    String address;
    int phoneNumber;
    String faculty;
    int course;
    String group;

    LocalDate localDate = LocalDate.of(1987, 4, 2);


    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public Student(int id, String surname, String name, String secondName, LocalDate birthdate, String address, int phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.birthdate = birthdate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public void show() {
        System.out.println("id: " + getId());
        System.out.println("Surname: " + getSurname());
        System.out.println("Name: " + getName());
        System.out.println("Second name: " + getSecondName());
        System.out.println("Birthday: " + getBirthdate());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Faculty: " + getFaculty());
        System.out.println("Course: " + getCourse());
        System.out.println("Group: " + getGroup());

    }

    public void showFaculty() {
        if (this.getFaculty().equals("history")) {
            System.out.println("id: " + getId());
            System.out.println("Surname: " + getSurname());
            System.out.println("Name: " + getName());
            System.out.println("Second name: " + getSecondName());
            System.out.println("Birthday: " + getBirthdate());
            System.out.println("Address: " + getAddress());
            System.out.println("Phone number: " + getPhoneNumber());
            System.out.println("Faculty: " + getFaculty());
            System.out.println("Course: " + getCourse());
            System.out.println("Group: " + getGroup());
        }
    }

    public void showFacCourse() {
        if (this.getFaculty().equals("history") && this.getCourse() == 4) {
            System.out.println("id: " + getId());
            System.out.println("Surname: " + getSurname());
            System.out.println("Name: " + getName());
            System.out.println("Second name: " + getSecondName());
            System.out.println("Birthday: " + getBirthdate());
            System.out.println("Address: " + getAddress());
            System.out.println("Phone number: " + getPhoneNumber());
            System.out.println("Faculty: " + getFaculty());
            System.out.println("Course: " + getCourse());
            System.out.println("Group: " + getGroup());
        }

    }

    public void showAfterDate() {
        if (this.getBirthdate().isAfter(localDate)) {
            System.out.println("id: " + getId());
            System.out.println("Surname: " + getSurname());
            System.out.println("Name: " + getName());
            System.out.println("Second name: " + getSecondName());
            System.out.println("Birthday: " + getBirthdate());
            System.out.println("Address: " + getAddress());
            System.out.println("Phone number: " + getPhoneNumber());
            System.out.println("Faculty: " + getFaculty());
            System.out.println("Course: " + getCourse());
            System.out.println("Group: " + getGroup());
        }


    }


    public void showOneGroup() {
        if (this.getGroup().equals("A")) {
            System.out.println("id: " + getId());
            System.out.println("Surname: " + getSurname());
            System.out.println("Name: " + getName());
            System.out.println("Second name: " + getSecondName());
            System.out.println("Birthday: " + getBirthdate());
            System.out.println("Address: " + getAddress());
            System.out.println("Phone number: " + getPhoneNumber());
            System.out.println("Faculty: " + getFaculty());
            System.out.println("Course: " + getCourse());
            System.out.println("Group: " + getGroup());
        }

    }

}