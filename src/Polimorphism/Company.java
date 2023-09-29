package Polimorphism;

import java.util.*;

public class Company {
    List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        employees.add(employee);
    }

//    public void hireAll(Collection<Employee> employees) {
//        employees.addAll(employees);
//    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {

        return employees;
    }

    @Override
    public String toString() {
        return  employees.toString() ;
    }

}
