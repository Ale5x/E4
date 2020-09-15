package partTwo.test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test5 {

    /*
	    Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного
	типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
	транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
     */

    public static void main(String[] args) {

        List<Trip> holidayTour = new ArrayList<>();

        // Произвольно создаём лист путевок
        holidayTour.add(new Trip("Отдых", "Европа", 14, "Всё включено", "Автобус", 500.0));
        holidayTour.add(new Trip("Круиз", "Море", 20, "Всё включено", "Круизный лайнер", 1500.0));
        holidayTour.add(new Trip("Лечение", "Израиль", 14, "Всё включено", "Самолет", 2000.0));
        holidayTour.add(new Trip("Покупки", "Германия", 3, "Нет", "Автобус", 200.0));
        holidayTour.add(new Trip("Экскурсия", "Чехия", 7, "Всё включено", "Автобус", 950.0));
        holidayTour.add(new Trip("Отдых", "Швейцария", 5, "Завтраки", "Автобус", 700.0));
        holidayTour.add(new Trip("Отдых", "Швейцария", 7, "Нет", "Автобус", 600.0));
        holidayTour.add(new Trip("Круиз", "Море", 10, "Всё включено", "Круизный лайнер", 1300.0));
        holidayTour.add(new Trip("Лечение", "Италия", 14, "Всё включено", "Самолет", 1100.0));
        holidayTour.add(new Trip("Лечение", "Швейцария", 30, "Всё включено", "Самолёт", 1200.0));
        holidayTour.add(new Trip("Экскурсия", "Германия", 5, "Нет", "Автобус", 950.0));
        holidayTour.add(new Trip("Экскурсия", "Греция", 5, "Нет", "Самолет", 1300.0));
        holidayTour.add(new Trip("Экскурсия", "Италия", 5, "Всё включено", "Самолет", 950.0));
        holidayTour.add(new Trip("Экскурсия", "Италия", 5, "Нет", "Самолет", 1100.0));

        output(holidayTour);
        outputDay(holidayTour);
        outputPrice(holidayTour);
        outputUser(holidayTour);
    }

    // Вывод всех путёвок
    public static void output(List<Trip> holidayTour) {
        System.out.println("Вывод всех путёвок...");
        for (Trip trip : holidayTour) {
            System.out.println(trip.toString());
        }
    }

    // Сортировка путёвок по цене
    public static void outputPrice(List<Trip> holidayTour) {
        System.out.println("\nСортировка путёвок по цене...");
        holidayTour.sort(Comparator.comparingDouble(Trip::getPrice));
        for (Trip trip : holidayTour) {
            System.out.println(trip.toString());
        }
        System.out.println("***********************");
    }

    // Сортировка путёвок по дням
    public static void outputDay(List<Trip> holidayTour) {
        System.out.println("\nСортировка путёвок по дням...");
        holidayTour.sort(Comparator.comparingInt(Trip::getDays));
        for (Trip trip : holidayTour) {
            System.out.println(trip.toString());
        }
        System.out.println("************************");
    }

    // Подбор путёвки по параметрам пользователя
    public static void outputUser(List<Trip> holidayTour) {
        System.out.println("\nПодбор путевки по индивидуальным параметрам...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {
           System.out.print("Введите тип отдыха - ");
           String typeHoliday = reader.readLine();
           System.out.print("Введите страну - ");
           String country = reader.readLine();
           System.out.print("Введите колличество дней - ");
           int countDays = Integer.parseInt(reader.readLine());
           System.out.print("Введите цену... до - ");
           int priceAfter = Integer.parseInt(reader.readLine());

           int count = 0;

           for (Trip trip : holidayTour) {
               if(typeHoliday.equalsIgnoreCase(trip.getType())) {
                   if(country.equalsIgnoreCase(trip.getCountry())) {
                       if(countDays <= trip.getDays()) {
                           if(priceAfter >= trip.getPrice()) {
                               System.out.println(trip.toString());
                               count++;
                           }
                       }
                   }
               }
           }

           if(count == 0) {
               System.out.println("Ничего не найдено");
           }

           System.out.println("\nПоказать туры по стране...");
           count = 0;
           for(Trip trip : holidayTour) {
               if (country.equalsIgnoreCase(trip.getCountry())) {
                   System.out.println(trip.toString());
               }
           }

           if(count == 0) {
               System.out.println("Подходящих туров в стране - " + country + " не найдено");
           }

       }catch (IOException e) {

       }
        }
    }

