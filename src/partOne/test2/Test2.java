package partOne.test2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    /*
        Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
     инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
     */

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        initializePerson(personList);
        output(personList);
    }

    // Инициализация списка
    public static List<Person> initializePerson(List<Person> personList) {
        personList.add(new Person("Kit", 24));
        personList.add(new Person("Kim", 26));
        personList.add(new Person("Tommi", 27));
        personList.add(new Person("Nick", 21));
        personList.add(new Person("Dick", 24));
        personList.add(new Person("Helly", 23));

        return personList;
    }

    // Вывод списка
    public static void output(List<Person> personList) {
        for(Person person : personList){
            System.out.println("Name - " + person.getName() + "; age - " + person.getAge());
        }
    }
}
