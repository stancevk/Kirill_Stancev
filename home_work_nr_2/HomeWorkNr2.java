package home_work_nr_2;

public class HomeWorkNr2 {
    public static void main(String[] args) {

        long currentWorldPopulation = 7811080815l;

        int carsProducedThisYear = 55235358;
        char firstLetterInAlphabet = 'A';
        boolean javaIsAmazing = true;
        float pi = 3.14159f;
        System.out.println(currentWorldPopulation);
        System.out.println(carsProducedThisYear);
        System.out.println(firstLetterInAlphabet);
        System.out.println(javaIsAmazing);
        System.out.println(pi);
        double price = 31.7d;
        double tax = 23.2d;
        int quantity = 52;
        double sum = 0d;
        System.out.println(price + "\n" + tax +"\n"+ quantity +"\n"+ sum);
        double total = price + tax * quantity + sum;
        System.out.println("total=" + total);
    }
}
