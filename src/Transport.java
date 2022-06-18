public class Transport {
    public String modelName;
    public int wheelsCount;
    public Transport() {

    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
            System.out.println("Меняем покрышку");
    }
}
