package Equals_and_HashCode;

import java.util.*;

public class Equals_HashCode {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Peter0000", 0);
        Student student2 = new Student("Peter1111", 1);
        Student student3 = new Student("Peter2222", 2);
        Student student4 = new Student("Peter0000", 0);
        studentList.add(student1);

        System.out.println(studentList);
        System.out.println();
        studentList.remove(student4);
        System.out.println(studentList);
    }
}

final class Student {
    final String name;
    final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return id == student.id && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, id);
//    }

}
