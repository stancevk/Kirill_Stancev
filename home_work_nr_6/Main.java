package home_work_nr_6;
public class Main {
    //выпольняяю пункт 4
    public static void main(String[] args) {
        Invoice invoiceObj = new Invoice("Xll1", "It is small", 20, 5.5d);
        Invoice invoiceObj2 = new Invoice("Xss1", "It is normal", 10, 10.5d);
        Invoice invoiceObj3 = new Invoice("Xxx1", "It is big", 5, 20.5d);

        Invoice[] invoicesMassiv = new Invoice[]{
                invoiceObj, invoiceObj2, invoiceObj3
        };

        for (int i = 0; i != invoicesMassiv.length; i++) {
            if(invoicesMassiv[i].getColProd() > 0)
            {
                invoicesMassiv[i].setColProd(0);
            }
            if(invoicesMassiv[i].getCena() > 0)
            {
                invoicesMassiv[i].setCena(0.0d);
            }
        }
        // выполняю 5 пункт
        Invoice invoiceObj4 = new Invoice("Test1","It is prototip",1,55.2);

        invoiceObj4.getAmount(); //просто вызываю метод
        System.out.println("Цена = " + invoiceObj4.getAmount());
        // выполняю 6 пункт
        Date dateObject = new Date(32,1,2024);
        System.out.print("Твоя указаная дата = ");
        dateObject.displayDate();
    }
}


