public class Truck extends Transport {
    private String trailer;
    private int EngineCapacit;

    public Truck(String modelName, int wheelsCount, String trailer, int engineCapacit) {
        super(modelName, wheelsCount);
        this.trailer = trailer;
        EngineCapacit = engineCapacit;
    }

    public int getEngineCapacit() {
        return EngineCapacit;
    }

    public String getTrailer() {
        return trailer;
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель, обьемом " + getEngineCapacit() + " литра.");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп: " + getTrailer());
    }

}
