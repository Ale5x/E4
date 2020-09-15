package partTwo.test5;

public class Trip {

    /*
        Создаем класс Trip, в котором будут переменные: тип путёвки, количество дней, еда, транспорт, страна, цена.
    И методы для получения этих данных
     */

    private String type;
    private int days;
    private String eat;
    private String transport;
    private String country;
    private double price;

    public Trip(String type, String country, int days, String eat, String transport, double price) {
        this.type = type;
        this.country = country;
        this.days = days;
        this.eat = eat;
        this.transport = transport;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getDays() {
        return days;
    }

    public String getEat() {
        return eat;
    }

    public String getTransport() {
        return transport;
    }

    public String getCountry() {
        return country;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "Тип путевки - '" + type + '\'' +
                ", количество дней - " + days +
                ", еда - '" + eat + '\'' +
                ", транспорт - '" + transport + '\'' +
                ", страна - '" + country + '\'' +
                ", цена " + price + " $";
    }
}
