package home_work_nr_7;

import java.util.SplittableRandom;

public class Programmer extends Employee{
    String programingLanguade;
    Integer yearsOfExperiencee;

    public Programmer(String name, String surname, String companyName, String programingLanguade, Integer yearsOfExperiencee) {
        super(name, surname, companyName);
        this.programingLanguade = programingLanguade;
        this.yearsOfExperiencee = yearsOfExperiencee;
    }

    @Override
    void work(String work) {
        System.out.println(work);
    }
}
