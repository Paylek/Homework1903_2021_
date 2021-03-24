package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;


    public static void main(String[] args) {
        int course = 3;
        List<Student> list = new ArrayList<>();
        Student student_1 = new Student("Pavel", "Sviryd", "13.04.2001", 3);
        Student student_2 = new Student("Misha", "Voitovich", "24.08.1991", 4);
        Student student_3 = new Student("Vova", "Vainberg", "26.06.2000", 2);
        Student student_4 = new Student("Grisha", "Kuzmenko", "22.10.2002", 1);
        Student student_5 = new Student("Dima", "Penda", "27.01.2003", 3);

        list.add(student_1);
        list.add(student_2);
        list.add(student_3);
        list.add(student_4);
        list.add(student_5);


        printStudents(list, course);
    }

    public Student(String name, String surname, String dateOfBirthday, int course) {
        if(name != null)
            this.name = name;
        else
            System.out.println("Неверное имя");
        if(surname != null)
            this.surname = surname;
        else
            System.out.println("Неверная фамилия");

        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        if(name != null)
            this.name = name;
        else
            System.out.println("Неверное имя");
    }

    public void setSurname(String surname) {
        if(surname != null)
            this.surname = surname;
        else
            System.out.println("Неверная фамилия");
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setCourse(int course) {
        if (this.course >= 1 && this.course <= 5)
            this.course = course;
        else
            System.out.println("Введите правильно курс!");
    }

    public static void printStudents(List<Student> stud, int c) {
        System.out.println("Студенты " + c + " курса:");

        Iterator<Student> iter = stud.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.getCourse() == c) {
                System.out.println(student.getName());
            }
        }
    }

}