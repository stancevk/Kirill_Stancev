package homework_nr_10;

public class PredicateClass implements Predicate{
    Integer cislo = 5;  //число которое я проверяю на чётность или не чётность
    public PredicateClass() {
    }
//    public PredicateClass(Integer cislo) {
//        this.cislo = cislo;
//    }

    @Override
    public boolean cisloCetNicet(Integer cislo1) {
        if (cislo1 % 2 == 0)
        return true;
        else {
            return false;
        }
    }
}
