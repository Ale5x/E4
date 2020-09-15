package partTwo.test1;

public class Test1 {

    /*
        Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
    вывести на консоль текст, заголовок текста.
     */

    public static void main(String[] args) {

        Sentence sentence = new Sentence();
        // Вызываем метод для формирования названия текста
        System.out.println(sentence.outPutTitle(sentence.getTitleSentenceText()));
        // Ввызываем метод, который публикует предложения
        System.out.println(sentence.outputText());
    }
}

