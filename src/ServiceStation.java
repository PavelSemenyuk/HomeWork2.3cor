public class ServiceStation implements ServiceStationInterfece {
    @Override
    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
            }
            car.updateTyre();
            car.checkEngine();
        }
    }
    @Override
    public void check1(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
            }
        }
        truck.updateTyre();
        truck.checkEngine();
        truck.checkTrailer();
    }

    @Override
    public void check2(Bicycle bicycle){
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {

            }
        }
        bicycle.updateTyre();
    }
}
