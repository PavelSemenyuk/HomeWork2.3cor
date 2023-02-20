public class Truck extends Car {
    private String trailer;

    public Truck(String modelName, int wheelsCount, int engineCapacit, String trailer) {
        super(modelName, wheelsCount, engineCapacit);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку у " + getModelName() +" в колличестве "+ getWheelsCount() + " штук.");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель, обьемом " + getEngineCapacit() + " литра.");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп: " + getTrailer());
    }

}
