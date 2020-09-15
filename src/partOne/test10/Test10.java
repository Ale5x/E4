package partOne.test10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test10 {

    /*
    	Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
    	метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
    	методами. Задать критерии выбора данных и вывести эти данные на консоль.
     */

    public static void main(String[] args) {

        List<Airline> airlineList = new ArrayList<>();

        initializeAirline(airlineList);
        output(airlineList);
        flightSearch(airlineList);
        searchDayOfTheWeek(airlineList);
    }

    //Инициализация списка рейсов
    public static List<Airline> initializeAirline(List<Airline> airlineList) {
        airlineList.add(new Airline("USA", 785, "Класс - А", 3, 33,
                new ArrayList<String>(Arrays.asList("Понедельник", "Среда", "Пятница"))));
        airlineList.add(new Airline("CA", 546, "Класс - А", 16, 45,
                new ArrayList<String>(Arrays.asList("Понедельник", "Пятница"))));
        airlineList.add(new Airline("UK", 854, "Класс - B", 14, 25,
                new ArrayList<String>(Arrays.asList("Среда", "Пятница"))));
        airlineList.add(new Airline("UK", 884, "Класс - B", 4, 00,
                new ArrayList<String>(Arrays.asList("Вторник", "Суббота"))));
        airlineList.add(new Airline("SW", 985, "Класс - C", 2, 20,
                new ArrayList<String>(Arrays.asList("Воскресенье"))));
        airlineList.add(new Airline("FL", 787, "Класс - C", 3, 30,
                new ArrayList<String>(Arrays.asList("Среда", "Пятница", "Суббота", "Воскресенье"))));
        airlineList.add(new Airline("USA", 785, "Класс - А", 3, 50,
                new ArrayList<String>(Arrays.asList("Четверг", "Воскресенье"))));

        return airlineList;
    }

    public static void output(List<Airline> list) {
        System.out.println("\nВывод всех рейсов...");
        for(Airline airline : list) {
            System.out.println(airline.toString());
        }
    }

    public static void flightSearch(List<Airline> list) {
        System.out.println("\nПоиск заданного рейса...\nВведите пункт назначения ");
        BufferedReader reader = null;
        int countAirline = 0;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Пункт назначения - ");
            String flight = reader.readLine();
            for(Airline airline : list) {
                if (airline.getPlace().equalsIgnoreCase(flight)) {
                    System.out.println(airline.toString());
                    countAirline++;
                }
            }
            if(countAirline == 0) {
                    System.out.println("Рейсы не найдены...");
            }
        }catch (IOException e) {

        }
    }

    public static void searchDayOfTheWeek(List<Airline> list) {
        System.out.println("\nПоиск рейсов по дням недели. Время вылета которых, больше заданного...");
        BufferedReader reader = null;
        Calendar time = new GregorianCalendar();
        int countAirline = 0;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите день недели - ");
            String day = reader.readLine();

            System.out.print("Введите час - ");
            int hour = Integer.parseInt(reader.readLine());

            System.out.print("Введите минуты - ");
            int minute = Integer.parseInt(reader.readLine());
            if(!(hour < 0 & hour > 24 & minute < 0 & minute > 60)) {
                time.set(Calendar.HOUR_OF_DAY, hour);
                time.set(Calendar.MINUTE, minute);
            }else System.out.println("Неправильно ввели время");

            String dateFormat = new SimpleDateFormat("HH:mm").format(time.getTime());;

            System.out.println("\nПоиск по параметрам.... " + day + ". Время после - " + dateFormat);

            for(Airline airline : list) {
                for (int i = 0; i < airline.getDays().size(); i++) {
                if(airline.getDays().get(i).equals(day)) {
                    if ((airline.getTime().getTime().after(time.getTime()))) {
                        System.out.println(airline.toString());
                        countAirline++;
                    }
                }
                }
            }
            if(countAirline == 0) {
                System.out.println("По данным параметрам рейсы не обнаружены...");
            }
        }catch (IOException e) {
            System.out.println("Введен не верный формат...");
        }
    }
 }
