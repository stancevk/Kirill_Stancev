package home_work_nr_6;

public class Invoice {
    private String model;
    private String about;
    private Integer colProd;
    private Double cena;

    public Invoice(String model, String about, Integer colProd, Double cena) {
        this.model = model;
        this.about = about;
        this.colProd = colProd;
        this.cena = cena;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Integer getColProd() {
        return colProd;
    }

    public void setColProd(Integer colProd) {
        this.colProd = colProd;
    }

    public Double getCena() {

        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }
    public  double  getAmount(){
       return cena * 1.5f; //высокие налоги
    }
}
