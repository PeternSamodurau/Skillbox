package Polimorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        while (true) {
            hireEmployees(company);
            fireEmployees(company);


        }

    }

    private static void hireEmployees(Company company) {
        System.out.println("Введите количество Oператоров,которое хотите нанять");
        Scanner scanner = new Scanner(System.in);
        int operatorCount = scanner.nextInt();
        for (int i = 0; i < operatorCount; i++) {
            company.hire(new Operator());
        }
        System.out.println(company);

        System.out.println("Введите количество Менеджеров,которое хотите нанять");
        int managerCount = scanner.nextInt();
        for (int i = 0; i < managerCount; i++) {
            company.hire(new Manager());
        }
        System.out.println(company);

    }

    private static void fireEmployees(Company company) {
        System.out.println("Введите количество Oператоров,которое хотите уволить");
        Scanner scanner = new Scanner(System.in);
        int operatorCount = scanner.nextInt();
        for (int i = 0; i < operatorCount; i++) {
           Employee em = company.getEmployees().get(i);
        }

        System.out.println(company);

        System.out.println("Введите количество Менеджеров,которое хотите уволить");
        int managerCount = scanner.nextInt();
        for (int i = 0; i < managerCount; i++) {
            company.fire(new Manager());
        }
        System.out.println(company);

    }

}




