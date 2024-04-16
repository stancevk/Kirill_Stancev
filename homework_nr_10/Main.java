package homework_nr_10;

//import static homework_nr_10.Predicate.MAINOBJ;

import java.util.List;

public class Main extends Employee implements Function{
   static Employee employeeObjMain = new Employee("Dumitru","Miron",25,"Software Engineering");
    public static void main(String[] args) {
        // пункт 3
        PredicateClass predicateClassObj = new PredicateClass();
        //PredicateClass predicateClassObj1 = new PredicateClass(4);
        System.out.println("Если true число чётно, а если false число не чётное");
        System.out.println(predicateClassObj.cisloCetNicet(predicateClassObj.cislo));
        // пункт 4
        System.out.println("--------------");
        ConsumerClass consumerClass = new ConsumerClass();
        System.out.println(consumerClass.stringInterface("This is task 4 in homeworl 10"));
        // пункт 5
        System.out.println("-----------------");
        Main mainObj = new Main();
        System.out.println("Cislo *2 = " + mainObj.cisloSUmnof2(5f));
        // пункт 7
        System.out.println("-------------");
      //  Employee employeeObjMain = new Employee("Kirll","Stancev",21,"Software Engineering");
        testEmployNaAll();

    }
//    Employee employeeMedod()
//    {
//        return Main.
//    }
    static void testEmployNaAll() {
        if (Main.employeeObjMain.department == "Software Engineering")
        System.out.println("Employee work at deportament Software Engineering");
        else{
            System.out.println("He work at other place");
        }
        if (Main.employeeObjMain.age > 20)
            System.out.println("Employee is older 20 age");
        if (Main.employeeObjMain.name.startsWith("A"))
            System.out.println("Name start with A");
        else {
            System.out.println("Name dont start with A");
        }

        System.out.println("-------------");
//        Predicate<String> = (String e) -> {
//          return e.startsWith("A");
//        };

    }

//    Если Employee работает в департаменте Software Engineering
//    Если Employee старше 20 лет
//    Если имя Employee начинается с буквы А
    @Override
    public Float cisloSUmnof2(Float floatCislo) {
        return floatCislo * 2;
    }

    // решит для 6 пункта не создовать новый класс
// не совсем понял задание пункт 8
}
