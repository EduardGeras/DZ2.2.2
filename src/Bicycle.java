public class Bicycle extends Transport{

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }
    }
    /*public void updateTyre() {
            System.out.println("Меняем покрышку");

    }*/
}
