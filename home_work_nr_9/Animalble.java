package home_work_nr_9;

public interface Animalble {
    //определите как минимум 4 метода, один метод default, один static, необходимые переменные
    Integer killoweight = 30;
    Integer sizeLarge = 10;
    void Biggers();

    void Smaller();
    default Integer Medium(Integer x)
    {
        return x;
    }
    static Integer Great(Integer y)
    {
        return y;
    }
    //Создание экземпляра объекта Elephant через интерфейс животных пункт 6
    static Elephant ELEPHANTObj = new Elephant(100,42);
}
