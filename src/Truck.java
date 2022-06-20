public class Truck extends Transport implements ServiceStationCheck{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку у грузового автомобиля " + getModelName());
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель у грузового автомобиля " + getModelName());
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп у грузового автомобиля " + getModelName());
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем грузовой автомобиль " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
