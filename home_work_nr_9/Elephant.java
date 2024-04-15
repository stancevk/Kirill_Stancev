package home_work_nr_9;

public class Elephant extends Erbivor implements Animalble {
    Integer killo;
    Integer size;
    public Elephant(Integer killo, Integer size) {
        this.killo = killo;
        this.size = size;
    }
    public static void main(String[] args) {

    }
    //Создайте класс Elephant, реализуйте интерфейс Animal
    @Override
    public void Biggers() {
        System.out.println("Interfase metod Bigger");
    }
    @Override
    public void Smaller() {
        System.out.println("Interfase metod Smaller");
    }
    @Override
    void abstractMetod()
    {
        System.out.println("Interfase metod abstractMetod");
    }
    //Erbivor erbivorInter = Erbivor;

    @Override
    public Integer Medium(Integer x)
    {
        return Animalble.super.Medium(x);
    }
// Пункт 10 Создание объект Elephant через родительский класс Erbivor
    //Erbivor erbivorObj = new Elephant(50,20);
}
