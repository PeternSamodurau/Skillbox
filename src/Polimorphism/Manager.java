package Polimorphism;

public class Manager  implements Employee {

    public String nameManager;
    public int managerSalary;
    static int amountMoneyEarned;
    static int fixSalary = 100000;
    static double bonus = 0.05;
    static final int MIN_AMOUNT_MONEY_EARNED = 115000;
    static final int MAX_AMOUNT_MONEY_EARNED = 140000;

    public Manager() {
        this.nameManager = getClass().getName();
        this.managerSalary = getMonthSalary();
    }

    @Override
    public  int getMonthSalary() {
        amountMoneyEarned = MIN_AMOUNT_MONEY_EARNED +
                (int) (Math.random() *
                        (MAX_AMOUNT_MONEY_EARNED - MIN_AMOUNT_MONEY_EARNED + 1));
        managerSalary = fixSalary + (int) Math.round(amountMoneyEarned * bonus);

        return managerSalary;
    }

    public String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public int getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(int managerSalary) {
        this.managerSalary = managerSalary;
    }
    @Override
    public String toString() {
        return nameManager + " - " + managerSalary;
    }



}
