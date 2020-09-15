package partOne;

public class Test1 {

    /*
        Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
    Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
    из этих двух переменных.
     */

    public static void main(String[] args) {

        int numberOne = 7;
        int numberTwo = 8;

        println(numberOne, numberTwo);
        changeNumbers(numberOne, numberTwo);
        sumNumbers(numberOne, numberTwo);
        maxNumbers(numberOne, numberTwo);
    }

    private static void maxNumbers(int numberOne, int numberTwo) {
        System.out.println("Нахождение максимального числа");
        System.out.println("Максимальное число из двух чисел является - " + Math.max(numberOne, numberTwo));
        System.out.println("******************");
    }

    private static void sumNumbers(int numberOne, int numberTwo) {
        System.out.println("Сумма чисел");
        int sum = numberOne + numberTwo;
        System.out.println("Сумма двух чисел = " + sum);
        System.out.println("******************");
    }

    public static void changeNumbers(int numberOne, int numberTwo) {
        System.out.println("Вывод измененных чисел");
        System.out.println("Number one " + (numberOne * -1));
        System.out.println("Number two " + (numberTwo * -1));
        System.out.println("******************");
    }

    public static void println(int one, int two){
        System.out.println("Вывод чисел");
        System.out.println("Number one " + one);
        System.out.println("Number two " + two);
        System.out.println("******************");
    }
}

