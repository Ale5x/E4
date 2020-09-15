package partOne.test8;

public class Customer {

    /*
        В классе реалезованы переменные: id клиента, его ФИО, номер кредитной карты, номер банковской карты, его адресс
    и соответствующие методы get.
     */

    private int id;
    private String name;
    private long creditCard;
    private long bankCard;
    private String address;

    public Customer(int id, String name, long creditCard, long bankCard, String address) {
        this.id = id;
        this.name = name;
        this.creditCard = creditCard;
        this.bankCard = bankCard;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public long getBankCard() {
        return bankCard;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "id - " + getId() + ". Name - " + getName() +
                ". Address - " + getAddress() + ". Number credit card - " +
                getCreditCard() + ". Number bank card - " + getBankCard();
    }
}
