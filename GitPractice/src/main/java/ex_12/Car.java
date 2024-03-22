package ex_12;

public class Car {
    String model = model;
    String brand = brand;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printIfo() {
        System.out.println("" + brand + "\n" + model);
    }
}
