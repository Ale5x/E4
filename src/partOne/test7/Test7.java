package partOne.test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {

    /*
        Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
    периметра и точки пересечения медиан.
     */

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите координаты...");
            System.out.print("\nВведите координаты Ах - ");
            double Ax = Integer.parseInt(reader.readLine());
            System.out.print("Введите координаты Аy - ");
            double Ay = Integer.parseInt(reader.readLine());

            System.out.print("\nВведите координаты Bх - ");
            double Bx = Integer.parseInt(reader.readLine());
            System.out.print("Введите координаты By - ");
            double By = Integer.parseInt(reader.readLine());

            System.out.print("\nВведите координаты Cх - ");
            double Cx = Integer.parseInt(reader.readLine());
            System.out.print("Введите координаты Cy - ");
            double Cy = Integer.parseInt(reader.readLine());

            Triangle triangle = new Triangle();
            triangle.solveTriangle(Ax, Ay, Bx, By, Cx, Cy);

        }catch (IOException e) {

        }
    }
}
