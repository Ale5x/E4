package partTwo.test4;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

    /*
    	Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
    Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
    имеющим положительный и отрицательный балансы отдельно.
     */

    public static void main(String[] args) {

        List<CardUser> cardUserList = new ArrayList<>();

        /*
           Произвольно проинициализируем данные клиентов банка. Т.к. id является уникальным номером клиента,
        то записей клиентов может быть несколько, а id 1

         */
        cardUserList.add(new CardUser(1, 222231118, "Din", 500.0, true));
        cardUserList.add(new CardUser(1, 124324343, "Din", 250.0, true));
        cardUserList.add(new CardUser(1, 784654342, "Din", 150.25, true));
        cardUserList.add(new CardUser(1, 073434343, "Din", 700.0, false));
        cardUserList.add(new CardUser(2, 222231118, "Katy", 1000.0, true));
        cardUserList.add(new CardUser(2, 233435454, "Katy", 500.0, false));
        cardUserList.add(new CardUser(3, 345233133, "Bob", 100.0, true));

        dataCardUser(cardUserList);
        System.out.println("\nБлокировка первой карты пользователя\n");
        blockCard(cardUserList);
        dataCardUser(cardUserList);
        System.out.println("\nРазблокировка заблокированной карты\n");
        unlockCard(cardUserList);
        dataCardUser(cardUserList);
    }

    public static void dataCardUser(List<CardUser> cardList) {
        int countBlockCard = 0;
        int countCard = 0;
        int countWorkCard = 0;
        int id = 1;
        double sum = 0;
        double sumBlock = 0;

        System.out.println("Вывод сумм на счёте пользователя с id = " + id + " и количество заблокированных карт");

        for (CardUser cardUser : cardList) {
            if (id == cardUser.getId()) {
                if (cardUser.isAccess()) {
                    System.out.println("Пользователь - " + cardUser.getName() + " | Карта - " + cardUser.getNumberCard() + " | Сумма - " + cardUser.getSum() + " | Статус - Активна");
                    sum += cardUser.getSum();
                    countWorkCard++;
                } else {
                    System.out.println("Пользователь - " + cardUser.getName() + " | Карта - " + cardUser.getNumberCard() + " | Сумма - " + cardUser.getSum() + " | Статус - Заблокирована");
                    countBlockCard++;
                    sumBlock += cardUser.getSum();
                }
                countCard++;
            }
        }

        System.out.println("************");
        System.out.println("Количество карт - " + countCard + "\nАктивных карт - " + countWorkCard + "\nЗаблокированных карт - " + countBlockCard);
        System.out.println("Сумма на счёте пользователя '" + sum + "'");
        System.out.println("Сумма на заблокированном счёте пользователя '" + sumBlock + "'");
    }

    // Блокировка карты
    public static List<CardUser> blockCard(List<CardUser> cardUserList) {

        cardUserList.get(0).setAccess(false); // блокировка
        return cardUserList;
    }

    // Разблокировка карты
    public static List<CardUser> unlockCard(List<CardUser> cardUserList) {
        cardUserList.get(3).setAccess(true); // разблокировка
        return cardUserList;
    }
}

