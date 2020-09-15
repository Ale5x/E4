package partOne.test7;

import java.text.DecimalFormat;

public class Triangle {

    /*
        Этот класс описывает решение вычисления площади, периметра и точек пересечения медиан...
     */
    private double perimeter;
    private double square;

    private DecimalFormat formatNumber = new DecimalFormat("#.###");

    public void solveTriangle(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        double AB = Math.sqrt(Math.pow(Math.abs(Ax - Bx), 2) + Math.pow(Math.abs(Ay - By), 2));
        double AC = Math.sqrt(Math.pow(Math.abs(Ax - Cx), 2) + Math.pow(Math.abs(Ay - Cy), 2));
        double BC = Math.sqrt(Math.pow(Math.abs(Bx - Cx), 2) + Math.pow(Math.abs(By - Cy), 2));

        perimeterTriangle(AB, AC, BC);
        squareTriangle(AB, AC, BC);
        medianPoint(Ax, Ay, Bx, By, Cx, Cy);
    }

    // Периметр треугольника
    public void perimeterTriangle(double sideAB, double sideAC, double sideBC) {
        perimeter = sideAB + sideAC + sideBC;
        System.out.println("\nPerimeter triangle - " + formatNumber.format(perimeter));
    }

    // Площадь треугольника
    public void squareTriangle(double sideAB, double sideAC, double sideBC) {
        // Площадь по формуле Герона
        double partPerimeter = perimeter / 2;
        square = Math.sqrt(partPerimeter * (partPerimeter - sideAB) * (partPerimeter - sideAC) * (partPerimeter - sideBC));
        System.out.println("Square - " + formatNumber.format(square));
    }

    // Метод вычисления точек пересечения медиан
    public void medianPoint(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        double Mx = ((Ax + Bx + Cx) / 3);
        double My = ((Ay + By + Cy) / 3);
        System.out.println("Координаты пересечения медиан: Мх - " + formatNumber.format(Mx) + ". My - " + formatNumber.format(My));
    }
}
