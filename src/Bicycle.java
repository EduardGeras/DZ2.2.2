public class Bicycle extends Transport implements ServiceStationCheck{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда " + getModelName());
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем велосипед " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
