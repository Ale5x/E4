package partOne.test9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test9 {

    /*
    	Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
    	метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
    	методами. Задать критерии выбора данных и вывести эти данные на консоль.

    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. Найти и вывести:
    a)	список книг заданного автора;
    b)	список книг, выпущенных заданным издательством;
    c)	список книг, выпущенных после заданного года.
     */

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();

        initializeBook(bookList);
        output(bookList);
        outputAuthor(bookList);
        outputPublisher(bookList);
        outputYear(bookList);

    }

    // Инициализация списка
    public static List<Book> initializeBook(List<Book> bookList) {
        bookList.add(new Book(13422, "Роулинг", "Гарри Поттер и философский камень",
                "Росмен", 1992, 400, 10.2, "Бумажный"));
        bookList.add(new Book(1232, "Роулинг", "Гарри Поттер и Тайная комната",
                "Росмен", 1993, 400, 10.5, "Бумажный"));
        bookList.add(new Book(125232, "Гари Корнелл и Кей С. Хорстманн", "Библиотека профессионала Т1",
                "Вильямс", 2003, 900, 100, "Бумажный"));
        bookList.add(new Book(125233, "Гари Корнелл и Кей С. Хорстманн", "Библиотека профессионала Т2",
                "Вильямс", 2004, 900, 100, "Бумажный"));
        bookList.add(new Book(1252533, "Роберт Седжвик", "Алгоритмы на Java", "Вильямс",
                2013, 700, 70, "Бумажный"));
        bookList.add(new Book(15335, "Д. Дефо", "Приключение Робинзона Крузо", "-",
                2013, 290, 1, "Бумажный"));
        return bookList;
    }

    public static void output(List<Book> bookList) {
        System.out.println("Вывод всех книг в библиотеке...");
        for(Book book : bookList) {
            System.out.println(book.toString());
        }
        System.out.println();
    }

    public static void outputAuthor(List<Book> bookList) {
        System.out.println("Вывод книг определённого автора - ");
        System.out.print("Введите автора - " );
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String author = reader.readLine();
        for(Book book : bookList) {
            if(!(book.getAuthor().indexOf(author)== -1)) {
                System.out.println(book.toString());
            }
        }
        System.out.println();
        }catch (IOException e) {

        }
        }

    public static void outputPublisher(List<Book> bookList) {
        System.out.println("Вывод книг определенного издательства - ");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите издательство - " );
            String publisher = reader.readLine();
        for(Book book : bookList) {
            if(publisher.equalsIgnoreCase(book.getPublisher())) {
                System.out.println(book.toString());
            }
        }
        System.out.println();
        }catch (IOException e) {

        }
    }

    public static void outputYear(List<Book> bookList) {
        System.out.println("Вывод книг после указанного года - ");
        BufferedReader reader = null;
        try {
        System.out.println("Введите год - ");
        int year = Integer.parseInt(reader.readLine());
        for(Book book : bookList) {
            if(year <= book.getYear()) {
                System.out.println(book.toString());
            }
        }
        }catch (IOException e) {

        }
    }
}
