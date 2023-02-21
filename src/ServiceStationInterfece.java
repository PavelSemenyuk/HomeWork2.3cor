
public interface ServiceStationInterfece {
    default void check(Car car) {
        System.out.println("СЕРВИС НА ВЫХОДНОМ");
    }

    void check1(Truck truck);

    void check2(Bicycle bicycle);
}
