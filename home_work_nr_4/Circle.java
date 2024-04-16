package homew_work_nr_4;

public class Circle {

    Float radius;

    public Circle(Float radius) {
        this.radius = radius;
    }
    public static float calculateArea()
    {
        homew_work_nr_4.Circle rad = new homew_work_nr_4.Circle(3.62f);

        float plosh = rad.radius * rad.radius * 3.14f;
        return plosh;
    }


    public static void main(String[] args) {

       // float answer = calculateArea();
        System.out.println("Площадь круга = " + calculateArea());
    }
}
