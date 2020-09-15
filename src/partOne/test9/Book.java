package partOne.test9;

public class Book {

    /*
        В классе представлены переменные: id книги, автор и название произведения, издательство, год издания,
    количество страниц и тип книги. А так же методы get для получения данных.
     */

    private int id;
    private String author;
    private String title;
    private String publisher;
    private int year;
    private int pages;
    private double price;
    private String typeBook;

    public Book(int id, String author, String title, String publisher, int year, int pages, double price, String typeBook) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.typeBook = typeBook;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public String getTypeBook() {
        return typeBook;
    }

    @Override
    public String toString() {
        return "id - " + getId() + ". Author - " + getAuthor() + "Title - " + getTitle() + ". Publisher - " + getPublisher() +
                ". Year - " + getYear() + ". Page - " + getPages() + ". Price - " + getPrice() +
                ". Type book - " + getTypeBook();
    }
}
