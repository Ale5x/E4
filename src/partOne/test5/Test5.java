package partOne.test5;

public class Test5 {

    /*
        Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
      на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными
      значениями. Счетчик имеет методы увеличения и уменьшения состояния,  и  метод позволяющее получить его текущее
      состояние. Написать код, демонстрирующий все возможности класса.
     */

    public static void main(String[] args) {

        Counter counter = new Counter();

        int  count = 0;
        int even = 0;
        int odd = 0;
        System.out.print("Count - ");
        for(int i = 0; i < 10; i++){
            count = (int)(Math.random() * 10);
            if(count % 2 == 0){
                counter.setCounterPlus();
                even++;
            }else{
                counter.setCounterMinus();
                odd++;
            }

            System.out.print(count + " |");
        }
        System.out.println();
        System.out.println("Количество чётных элементов - " + even + ". Количество нечётных элементов - " + odd);
        System.out.println("Counter = " + counter.getCounter());

        System.out.println("***************");
        System.out.println("Обнуление Counter");
        counter.setCounter(0);
        System.out.println("Counter равен - " + counter.getCounter());
        System.out.println("Изменение Counter в диапазоне чисел: \"0 ... 15\", выполняется +1."
                + "\"16 ... 20\", выполняется -1");

        for (int i = 0; i <= 20; i++){
            if(i > 0 && i < 15){
                counter.setCounterPlus();
            }else if(i >= 16 && i <= 20){
                counter.setCounterMinus();
            }
        }
        System.out.println("Counter = " + counter.getCounter());
    }
}
