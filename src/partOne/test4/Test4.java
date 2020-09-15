package partOne.test4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test4 {

    /*
        Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
     Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
     по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
     Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
     должны быть упорядочены по времени отправления.
     */

    public static void main(String[] args) {

        List<Train> trainList = new ArrayList<>();

        initializeTrain(trainList);
        output(trainList);
        sortTrain(trainList);
        searchTrain(trainList);
        sortPlaсeAndTime(trainList);
    }

    public static  List<Train> initializeTrain(List<Train> trainList) {
        trainList.add(new Train("UK", 526, 3, 5));
        trainList.add(new Train("USA", 342, 10, 50));
        trainList.add(new Train("FR", 493, 9, 30));
        trainList.add(new Train("SW", 854, 12, 0));
        trainList.add(new Train("UK", 895, 1, 40));
        trainList.add(new Train("UK", 985, 3, 30));
        trainList.add(new Train("SW", 752, 6, 30));
        trainList.add(new Train("USA", 852, 5, 25));
        trainList.add(new Train("IT", 875, 10, 10));
        trainList.add(new Train("IT", 786, 8, 45));

        return trainList;
    }
    public static void output(List<Train> list) {
        System.out.println("Вывод всего списка...");
        for(Train train : list) {
            System.out.println(train.toString());
        }
    }
    public static void sortTrain(List<Train> trainList) {
        System.out.println("\nСортировка поездов по номерам:");
        trainList.sort(Comparator.comparing(Train::getNumber));
        for (Train train : trainList) {
            System.out.println(train.toString());
        }
    }

    public static void searchTrain(List<Train> trainList) {
        BufferedReader reader = null;
        System.out.println("\nПоиск поезда по номеру...");
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите номер поезда:  ");
            int numberTrain = Integer.parseInt(reader.readLine());
            int count = 0;
            for (Train train : trainList) {
                if (train.getNumber() == numberTrain) {
                    System.out.println(train.toString());
                    count++;
                }
            }
            if(count == 0) {
                System.out.println("Номер поезда не найден, возможно Вы ввели неправильный номер поезда");
            }
        } catch (Exception e) {

        }
    }

    public static void sortPlaсeAndTime(List<Train> list) {
        System.out.println("\nСортировка поездов по пункту назначения и времени...");
        list.sort(Comparator.comparing(Train::getPlace).thenComparing(Train::getTime));
        for (Train train : list) {
            System.out.println(train.toString());
        }
    }
}

