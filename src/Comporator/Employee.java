package Comporator;


import java.util.Comparator;

public class Employee {
    int id;
    String name;
    String surName;

    public Employee(int id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.id == o2.id) {
            return 0;
        } else if (o1.id < o2.id) {
            return -1;
        } else return 1;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
       return o1.name.compareTo(o2.name);
    }

}





