package home_work_nr_7;

public abstract class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
 abstract void printMyName(String name1, String surname1);
}
