public class Truck extends Transport{

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
        }
        truck.checkEngine();
        truck.checkTrailer();
    }
}
