package partOne.test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test8 {

    /*
    	Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get-
    	методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими
    	конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.

    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    Найти и вывести:
    a)	список покупателей в алфавитном порядке;
    b)	список покупателей, у которых номер кредитной карточки находится в заданном интервале
     */

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        initializeCustomer(customerList);
        output(customerList);
        outputSort(customerList);
        outputCard(customerList);
    }

    // Инициализация Customer
    public static List<Customer> initializeCustomer(List<Customer> customerList) {
        customerList.add(new Customer(1, "Boby", 656, 5156165, "State CA"));
        customerList.add(new Customer(2, "Richard", 613, 15454850, "State NY"));
        customerList.add(new Customer(6, "Katy", 791, 4151165, "State NY"));
        customerList.add(new Customer(4, "Mizek", 546, 448465485, "State NY"));
        customerList.add(new Customer(5, "Boby", 387, 451321, "State CA"));
        customerList.add(new Customer(3, "Boby", 111, 78954564, "State CA"));

        return customerList;
    }

    public static void output(List<Customer> customerList) {
        System.out.println("Вывод всего списка...");
        for(Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    public static void outputSort(List<Customer> customerList) {
        System.out.println("\nВывод в алфавитном порядке...");
        customerList.sort(Comparator.comparing(Customer::getName));
        for(Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    public static void outputCard(List<Customer> customerList) {
        System.out.println("\nВывод пользователей с кредитной картой в диапазоне...");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите диапазон... ");
            int card = Integer.parseInt(reader.readLine());
            System.out.print("до... ");
            int cardAfter = Integer.parseInt(reader.readLine());

            for(Customer customer : customerList) {
                if(customer.getCreditCard() >= card & customer.getCreditCard() <= cardAfter) {
                    System.out.println(customer.toString());
                }
            }
        }catch (IOException e) {

        }finally {
            try {
                reader.close();
            }catch (IOException e) {

            }
        }
    }
}
