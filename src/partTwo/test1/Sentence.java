package partTwo.test1;

public class Sentence {

    Word word = new Word();

    // Создаем некий текст состоящий из 5-ти предложений...
    private String titleSentenceText = word.word("New") + word.space() + word.word("text") + word.point();
    private String oneSentenceText = word.word("One") + word.space() + word.word("text") +  word.space() +
            word.word("line") +  word.space() + word.word("2") + word.point();
    private String twoSentenceText = word.word("Two") + word.space() + word.word("text") + word.space() +
            word.word("line") + word.space() + word.word("3") + word.point();
    private String threeSentenceText = word.word("Three") + word.space() + word.word("text") + word.space()
            + word.word("line") + word.space() + word.word("3") + word.point();
    private String fourSentenceText = word.word("Four") + word.space() + word.word("text") + word.space()
            + word.word("line") + word.space() + word.word("4") + word.point();
    private String fiveSentenceText = word.word("Five") + word.space() + word.word("text") + word.space()
            + word.word("line") + word.space() + word.word("5") + word.point();

    public String getTitleSentenceText() {
        return titleSentenceText;
    }

    // Вывод текста используя переменные класса Word
    public String outputText(){
        return oneSentenceText + word.space() + twoSentenceText +  word.space() + word.newLine() + threeSentenceText
                + word.newLine() + fourSentenceText + word.newLine() + fiveSentenceText;
    }
    // создаём элемент названия текста, который будет появлятся с определённым отступом
    public String outPutTitle(String titleText){
        return "             " + titleText;
    }
}

