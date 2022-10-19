public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
            if (model == null) {
                this.brand = "default";
            } else {
                this.model = model;
            }
                if (Double.compare(engineVolume,0) == 0) {
                    this.engineVolume = 1.5;
                } else {
                    this.engineVolume = engineVolume;
                }
                    if (color == null) {
                        this.color = "белый";
                    } else {
                        this.color = color;
                    }
                        if (productionYear == 0) {
                            this.productionYear = 2000;
                        } else {
                            this.productionYear = productionYear;
                        }
                            if (productionCountry == null) {
                                this.productionCountry = "default";
                            } else {
                                this.productionCountry = productionCountry;
                            }
                        }

    void car() {
        System.out.println("Модель и марка машины: " + brand + " " + model + ", " + " год выпуска: " + productionYear + ", " + " сборка: " + productionCountry + ", " + " цвет: " + color + ", " + " объем двигателя - " + engineVolume);
    }
}
