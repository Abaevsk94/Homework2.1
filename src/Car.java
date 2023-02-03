public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.isEmpty() ? "белый" : color);
        this.productionYear = (productionYear <= 0 ? 2000 : productionYear);
        this.productionCountry = (productionCountry == null || productionCountry.isEmpty() ? "default" : productionCountry);
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
