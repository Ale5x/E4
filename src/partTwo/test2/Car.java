package partTwo.test2;

public  class Car implements CarInterface {

    private String model;
    private int wheel;
    private String engine; // "Gas Engine";

    public Car(String model, int wheel, String engine) {
        this.model = model;
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    public String getFrontLeftWheel() {
        return "Front Left Wheel";
    }

    @Override
    public String getFrontRightWheel() {
        return "Front Right Wheel";
    }

    @Override
    public String getRearLeftWheel() {
        return "Rear Left Wheel";
    }

    @Override
    public String getRearRightWheel() {
        return "Rear Right Wheel";
    }

    @Override
    public String replacement() {
        return "Replacement wheel " + this.model + ": ";
    }

    public String toString(){
        return "Model - " + this.model + ". Engine - " + this.engine;
    }

    @Override
    public String engine() {
        return this.engine;
    }

    @Override
    public String full() {
        return "Заправка топливом";
    }

    @Override
    public String go() {
        return "Автомобиль едет";
    }
}

