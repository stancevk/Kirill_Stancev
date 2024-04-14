package homew_work_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int sum_nec = 0;
        int proiz = 0;
        int [] copyNumbers = new int[100];

        for (int index = 0; index != 100; index++)
        {
            numbers[index] = 100 -index;
        }
        for (int i = 0; i != 100; i++)
        {
            System.out.println(numbers[i]);
        }
        System.out.println("Это весь массив\n" + "---------");
        for(int ix = 0; ix != 100; ix++) {
            if (numbers[ix] % 2 == 0) {
                sum_nec += numbers[ix];
            }
            else {
            proiz = numbers[ix] * proiz;
            }
        }
        System.out.println("Сума всех четных чисел: "  + sum_nec + "\n" + "Произведение нечётных: "+ proiz);
        for (int ix = 0; ix != 100; ix++)
        {
            copyNumbers[ix] = numbers[ix]; // копирую все элементы из массива в массив
        }
    }
}
