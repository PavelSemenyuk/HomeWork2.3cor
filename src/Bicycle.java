public class Bicycle {
    public String modelName;
    public int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у " + getModelName() +" в колличестве "+ getWheelsCount() + " штук.");
    }
}
