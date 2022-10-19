public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    void car() {
        System.out.println("Модель и марка машины: " + brand + " " + model + ", " + " год выпуска: " + productionYear + ", " + " сборка: " + productionCountry + ", " + " цвет: " + color + ", " + " объем двигателя - " + engineVolume);
    }
}
