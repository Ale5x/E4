package partTwo.test2;

public class Test2{

    /*
	    Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
    менять колесо, вывести на консоль марку автомобиля.
     */

    public static void main(String[] args) {
        String line = "*********************";

        // Произвольно проинициализируем лист машин
        Car BMW = new Car("BMW", 4, "Gas Engine");
        Car AUDI = new Car("Audi", 4, "Gas Engine");
        Car FORD = new Car("Ford", 4, "Diesel Engine");
        Car TESLA = new Car("TESLA", 4, "Electric Engine");

        /*
            Далее выведем информацию об автомобиле и какие кале
         */

        System.out.println(BMW.toString());
        System.out.println(BMW.full() + ". " + BMW.go());
        System.out.println(BMW.replacement() + BMW.getFrontRightWheel() + " and " + BMW.getRearRightWheel());
        System.out.println(line);

        System.out.println(AUDI.toString());
        System.out.println(AUDI.full() + ". " + AUDI.go());
        System.out.println(AUDI.replacement() + AUDI.getFrontLeftWheel());
        System.out.println(line);

        System.out.println(FORD.toString());
        System.out.println(FORD.full() + ". " + FORD.go());
        System.out.println(FORD.replacement() + FORD.getFrontLeftWheel() + " and " + FORD.getRearRightWheel() + " and " + FORD.getRearLeftWheel());
        System.out.println(line);

        System.out.println(TESLA.toString());
        System.out.println(TESLA.full() + ". " + TESLA.go());
        System.out.println(TESLA.replacement() + TESLA.getRearLeftWheel());
        System.out.println(line);
    }
}
