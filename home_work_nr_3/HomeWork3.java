package homew_work_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        System.out.println("----------------");
        for (int minCislo = 100; minCislo != 1000 ; minCislo += 5)
        {
            System.out.println("Это число делится на 5 = " + " " + minCislo);
        }
        System.out.println("----------------");
        double firstCislo = 1d;
        double sumOfallCis = 0d;
        double sumOfCis = 0d;
        float i = 3f;
        while (firstCislo != 99.0) {

            for (; i != 101f ;) {

                sumOfCis = firstCislo / i;
                System.out.println("Деление этих чисел " + firstCislo + "/" + i + " = " + sumOfCis);
                firstCislo += 2.0;
                break;
            }
            i += 2f;
            sumOfallCis += sumOfCis;
        }
        System.out.println("Сума всех чисел = " + sumOfallCis);
    }
}
