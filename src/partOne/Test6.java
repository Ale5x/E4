package partOne;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test6 {

    /*
    	Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
    изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
    В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени
    на заданное количество часов, минут и секунд.
     */

    public static void main(String[] args) {

        Calendar time = new GregorianCalendar();

        time.set(Calendar.HOUR_OF_DAY, 15);
        time.set(Calendar.MINUTE, 15);
        time.set(Calendar.SECOND, 7);


        System.out.println("Вывод времени");
        System.out.println(time.getTime());

        System.out.println("*************************");

        setTimeUser(time);
        System.out.print("\nВывод времени после настройки пользователем: ");
        System.out.println(time.getTime());
    }

    public static Calendar setTimeUser(Calendar time) {
        System.out.println("Установка пользовательского времени: ");

        try {
            Scanner scanner = new Scanner(System.in);

            int timeHour;
            int timeMinute;
            int timeSecond;

            System.out.print("Введите 'час' - ");
            timeHour = scanner.nextInt();
            if (!(timeHour > 23) & !(timeHour < 0)) {
                time.set(Calendar.HOUR_OF_DAY, timeHour);
            } else {
                System.out.println("Пользователь ввёл время выше допустимого, по умолчанию время в "
                        + "\"часах\" будет установлено \"0\"");
                time.set(Calendar.HOUR_OF_DAY, 0);
            }

            System.out.print("Введите 'минуты' - ");
            timeMinute = scanner.nextInt();
            if (!(timeMinute >= 60) & !(timeMinute < 0)) {
                time.set(Calendar.MINUTE, timeMinute);
            } else {
                time.set(Calendar.MINUTE, 0);
                System.out.println("Пользователь ввёл время выше допустимого, по умолчанию время в "
                        + "\"минутах\" будет установлено \"0\"");
            }

            System.out.print("Введите 'секунды' - ");
            timeSecond = scanner.nextInt();
            if (!(timeSecond >= 60) & !(timeSecond < 0)) {
                time.set(Calendar.SECOND, timeSecond);
            } else {
                time.set(Calendar.SECOND, 0);
                System.out.println("Пользователь ввёл время выше допустимого, по умолчанию время в "
                        + "\"секундах\" будет установлено \"0\"");
            }
        }catch (Exception e) {
    //  обработка exception
        }
        return time;
    }
}

