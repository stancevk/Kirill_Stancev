package home_work_nr_7;

public class Manager extends Employee {
    Integer teamSize;
    String teamName;

    public Manager(String name, String surname, String companyName, Integer teamSize, String teamName) {
        super(name, surname, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    void work(String work) {
        System.out.println(work);
    }
}
