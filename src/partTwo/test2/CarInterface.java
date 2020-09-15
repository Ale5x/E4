package partTwo.test2;

public interface CarInterface {

    /*
    В интерфейсе Engine создаем метод CarInterface, который будет классифицировать возможности автомобиля
    */

    public String engine();
    public String full();
    public String go();

    public String getFrontLeftWheel();
    public String getFrontRightWheel();
    public String getRearLeftWheel();
    public String getRearRightWheel();
    public String replacement();
}
