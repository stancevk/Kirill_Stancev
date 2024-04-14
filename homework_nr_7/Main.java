package home_work_nr_7;

public class Main {
    public static void main(String[] args) {

//Person personObj = new Manager("Alex", "Gin");
//        System.out.println(personObj.name);
        Employee employeeObj = new Manager("Alex", "Lovrov", "Pintolog", 20, "Super");
        employeeObj.printMyName("Dumitru ", "Alaibu");
        Manager managerObj = new Manager("Ale", "Lovrov", "Pintolog", 20, "Super");
        Programmer programmerObj = new Programmer("Dill","Gup","Ndava","C++",10);
        employeeObj.printMyName("Fill ","Tarov");
        managerObj.work(managerObj.companyName);
        programmerObj.work(programmerObj.companyName);
        Person personMassiv [] = new Person[] {
          managerObj,programmerObj
        };

//        managerObj.work();
//        programmerObj.work();

    }
}
