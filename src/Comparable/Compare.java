package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100,"Peter","Sam");
        Employee emp2 = new Employee(10,"Alla","Vam");
        Employee emp3 = new Employee(27,"Alla","Aam");

        List<Employee> stringList = new ArrayList<>();

        stringList.add(emp1);
        stringList.add(emp2);
        stringList.add(emp3);

        System.out.println("До сортировки" + " - " + stringList);
        Collections.sort(stringList);
        System.out.println("После сортировки" + " - " + stringList);
    }
}
