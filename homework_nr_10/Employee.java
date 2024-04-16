package homework_nr_10;

public class Employee {
    //Name, Surname, Age, Department. Создайте метод testEmployee(Employee e, Predicate<Employee> testMethod
    String name;
    String surname;
    Integer age;
    String department;

    public Employee(String name, String surname, Integer age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public Employee() {

    }
   static void testEmployee(Employee e, Predicate testMethod)
   {

   }

}
