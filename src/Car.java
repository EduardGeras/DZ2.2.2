public class Car extends Transport implements ServiceStationCheck{
    public  Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку у легкового автомобиля " + getModelName());
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель у легкового автомобиля " + getModelName());
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем легковой автомобиль " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}

