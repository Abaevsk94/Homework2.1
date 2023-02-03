public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "================" +
                "\n Марка: " + brand +
                "\n Модель: " + model +
                "\n Объем двигателя: " + engineVolume +
                "\n Цвет: " + color +
                "\n Год производства: " + productionYear +
                "\n Страна сборки: " + productionCountry;
    }
}
