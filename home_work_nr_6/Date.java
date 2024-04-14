package home_work_nr_6;

public class Date {
private Integer day;
private Integer month;
private Integer year;

    public Date(Integer day, Integer month, Integer year) {
        if (day < 32 && day > 0) {
            this.day = day;
        }
        else {
            System.out.println("Type corect day");
        }
        if (month < 13 && month > 0)
        this.month = month;
        else {
            System.out.println("Type corect month");
        }
        if (year < 2025 && year > 0)
        this.year = year;
        else {
            System.out.println("Type corect year");
        }
    }
// все работает и без методов get() и set() , но я сделаю это т.к написано д/з   :)
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        if (day < 32)
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        if (month < 13)
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        if (year < 2025 && year > 0)
        this.year = year;
    }

    public void displayDate()
    {
        System.out.println(day + "." + month + "." + year);
    }

}
//displayDate, который будет отображать дату календаря на экране в следующем формате: день/месяц/год