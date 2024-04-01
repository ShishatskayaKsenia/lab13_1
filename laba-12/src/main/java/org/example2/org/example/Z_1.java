package org.example2.org.example;


public class Z_1 {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Z_1(String name) {
        this(name, "Pre-Intermediate");
    }

    public Z_1(String name, String surname) {
        this(name, surname, 0);
    }

    public Z_1(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Pre-Intermediate", 0.0);
    }

    public Z_1(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public double getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
    }

    public void printDetails(boolean includeSurname) {
        if (includeSurname) {
            System.out.println("Name: " + name + ", Surname: " + surname);
        } else {
            printDetails();
        }
    }

    public void printDetails(boolean includeSurname, boolean includeExperience) {
        if (includeExperience) {
            System.out.println("Name: " + name + ", Surname: " + surname + ", Experience: " + experienceInYears);
        } else {
            printDetails(includeSurname);
        }
    }



    public static void printGoodbye() {
        System.out.println("Goodbye from Z_1 class!");
    }

}
