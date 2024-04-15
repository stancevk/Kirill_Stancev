package home_work_nr_9;

public class Main implements Animalble {
    public static void main(String[] args) {
//        Elephant elephantObj = new Elephant(50,32);
//        elephantObj.Smaller();
//        System.out.println(Animalble.INTEGER1);
//        Animalble ANIMABLEInterf = new Elephant(5, 3);
//        ANIMABLEInterf.Biggers();
//        System.out.println( Animalble.Great(5));
      //  Animalble animalbleInterf = new
        System.out.println(Animalble.ELEPHANTObj.killo + "\n" + Animalble.ELEPHANTObj.size);
        // не совсем понял пункт 9
    }
// Вызвать методы пункт 11
    @Override
    public void Biggers() {
        System.out.println("In Main void Biggers");
    }

    @Override
    public void Smaller() {
        System.out.println("In Main void Smaller");
    }

    @Override
    public Integer Medium(Integer x) {
        return Animalble.super.Medium(x);
    }
}
