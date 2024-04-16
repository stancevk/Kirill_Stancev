package homew_work_nr_4;

public class TemperatureConverter {
    Float gradus;
    //Float gradus1;
    public TemperatureConverter(Float gradus) {
        this.gradus = gradus;
    }

    public static void main(String[] args) {
        toCelsius();
        toFahrenheit();
    }

    public static float toCelsius()
    {
        TemperatureConverter fahre = new TemperatureConverter(20.7f);
        float cel = (fahre.gradus - 32) * 5/9;
        //C = (F - 32) * 5/9
        System.out.println("Градусов фарингейта = " + fahre.gradus + " Переводим в градусы цельсия: " + cel);
        return cel;
    }

    public static float toFahrenheit()
    {
        TemperatureConverter celsia = new TemperatureConverter(31.5f);
        float faring = celsia.gradus * 9/5 + 32;
        //F = 21.7 * 9/5 + 32
        System.out.println("Градусов цельсия = " + celsia.gradus + " Переводим в градусы фарингейта: " + faring);
        return faring;
    }
}
