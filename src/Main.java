public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Car car = new Car("car1", 4, 3);
        Car car2 = new Car("car2", 4, 5);

        Truck truck = new Truck("truck1", 4, 7, "ЗАГРУЖЕН");
        Truck truck2 = new Truck("truck2", 4, 6, "ПУСТОЙ");

        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(car2);
        System.out.println();
        station.check2(bicycle);
        System.out.println();
        station.check2(bicycle2);
        System.out.println();
        station.check1(truck);
        System.out.println();
        station.check1(truck2);

    }
}