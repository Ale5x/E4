package partTwo.test3;

public class City {

    /*
        Создаем переменные класса "Город". Город имеет переменные: население и площадь
    Имеет методы get и set для получения и установки значений.
     */

    private int population;
    private double square;
    private String city;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}