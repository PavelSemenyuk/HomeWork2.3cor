
public class Car extends Bicycle{
    private int engineCapacit;

    public Car(String modelName, int wheelsCount, int engineCapacit) {
        super(modelName, wheelsCount);
        this.engineCapacit = engineCapacit;
    }

    public int getEngineCapacit() {
        return engineCapacit;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышки у " + getModelName() +" в колличестве "+ getWheelsCount() + " штук.");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель, обьемом " + getEngineCapacit() + " литра.");
    }
}