package ru.mirea.LAB4_1.sixthTask;

class Employer {
    private String firstName;
    private String lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income * 12;
    }
}
