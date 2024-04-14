package home_work_nr_7;

public abstract class Pensioned extends Person{
    Integer refireDate;
    Integer age;

    public Pensioned(String name, String surname, Integer refireDate, Integer age) {
        super(name, surname);
        this.refireDate = refireDate;
        this.age = age;
    }
    @Override
    void printMyName(String name1, String surname1)
    {
        System.out.println(name1 + surname1);
    }
}
