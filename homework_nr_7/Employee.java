package home_work_nr_7;

public abstract class Employee extends Person{
String companyName;
abstract void work(String work);
    public Employee(String name, String surname, String companyName) {
        super(name, surname);
        this.companyName = companyName;
    }
    @Override
    void printMyName(String name1, String surname1)
    {
        System.out.println(name1 + surname1);
    }
}
