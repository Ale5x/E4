package partTwo.test4;

public class CardUser {

    /*
        Создадим класс с данными клиента банка. Он имеет персональный id, номер карт(ы), ФИО
     сумму на сте карты, и доступ к карте(заблокирована либо не заблокирована
     */

    private int id;
    private long numberCard;
    private String name;
    private double sum;
    private boolean access;

    public CardUser(int id, long numberCard, String name, double sum, boolean access) {
        this.id = id;
        this.numberCard = numberCard;
        this.name = name;
        this.sum = sum;
        this.access = access;
    }

    public int getId() {
        return id;
    }

    public long getNumberCard() {
        return numberCard;
    }

    public String getName() {
        return name;
    }

    public double getSum() {
        return sum;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }
}