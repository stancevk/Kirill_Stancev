package home_work_nr_6;

public class Employee {
    private String name;
    private int ages;
    private String tendency;

    public Employee(String name, int ages, String tendency) {
        this.name = name;
        this.ages = ages;
        this.tendency = tendency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public String getTendency() {
        return tendency;
    }

    public void setTendency(String tendency) {
        this.tendency = tendency;
    }
    public static void main(String[] args) {

    }

}
//имя, возраст и отдел типа String, int и String. Пометьте участников
//модификатором доступа private. Предоставьте конструктору 3 параметра и методы getter/setter для каждого члена. Цель упражнения —
//создать хорошо инкапсулированный класс.
