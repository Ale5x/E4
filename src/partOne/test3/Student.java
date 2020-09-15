package partOne.test3;

public class Student {

    private String name;
    private  int group;
    public int[] points;    // оценки

    public Student(String name, int group, int[] points) {
        this.name = name;
        this.group = group;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    // Подсчёт среднего бала
    public double getRating(int[] points){
        double sumPoints = 0;
        for(int i = 0; i < points.length; i++){
            sumPoints = sumPoints + points[i];
        }
        return (double) (sumPoints / points.length);
    }
}

