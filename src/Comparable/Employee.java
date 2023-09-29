package Comparable;

public class Employee implements Comparable<Employee> {
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
        return id + " - " + name + " - " + surName;
    }

    @Override
    public int compareTo(Employee o) {
        //    public int compareTo(Employee o) {
//        if (this.id == o.id){
//            return 0;
//        }else if (this.id < o.id){
//            return -1;
//        }else return 1;

//        return this.id - o.id;     //в основном пишут так
//
//        return this.id.compareTo(o.id);   // или так если - Integer id
//
//        return this.name.compareTo(o.name); // для имени
//
//        если по имени и фамилии, то:
          int res = this.name.compareTo(o.name);
          if (res == 0){                           // если имена одинаковые, сравнит фамилии
              res = this.surName.compareTo(o.surName);
          }
          return res;
    }
}


