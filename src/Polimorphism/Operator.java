package Polimorphism;

import java.util.ArrayList;
import java.util.List;

public class Operator   implements Employee {

    public String nameOperator;
    public int operatorSalary;
    private static final int fixSalary = 30000;
    public

    List<Operator> operatorList = new ArrayList<>();

    public Operator() {
        this.nameOperator = getClass().getName();
        this.operatorSalary = getMonthSalary();
    }
    @Override
    public int getMonthSalary() {

        return fixSalary;
    }

    public String getNameOperator() {
        return nameOperator;
    }

    public void setNameOperator(String nameOperator) {
        this.nameOperator = nameOperator;
    }

    public int getOperatorSalary() {
        return operatorSalary;
    }

    public void setOperatorSalary(int operatorSalary) {
        this.operatorSalary = operatorSalary;
    }

    @Override
    public String toString() {
        return nameOperator + " - " + operatorSalary;
    }
}