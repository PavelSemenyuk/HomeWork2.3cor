
public class Car extends Transport{
    private int engineCapacit;

    public Car(String modelName, int wheelsCount, int engineCapacit) {
        super(modelName, wheelsCount);
        this.engineCapacit = engineCapacit;
    }

    public int getEngineCapacit() {
        return engineCapacit;
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель, обьемом " + getEngineCapacit() + " литра.");
    }
}