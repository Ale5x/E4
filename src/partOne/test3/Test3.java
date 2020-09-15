package partOne.test3;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    /*
    	Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
    (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода
    фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
     */

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        initializeStudent(studentList);
        output(studentList);
    }

    // Инициализация студентов
    public static List<Student> initializeStudent(List<Student> studentList) {
        studentList.add(new Student("Jek", 45, new int[]{8, 9, 9, 7, 9}));
        studentList.add(new Student("Steve", 21, new int[]{5, 5, 9, 9, 2}));
        studentList.add(new Student("Katy", 21, new int[]{8, 8, 9, 10, 10, 9}));
        studentList.add(new Student("Mari", 55, new int[]{5, 4, 5, 7, 9}));
        studentList.add(new Student("Jesica", 45, new int[]{10, 10, 10, 8, 9}));
        studentList.add(new Student("Din", 45, new int[]{9, 8, 7, 10, 8}));
        studentList.add(new Student("Merlin", 21, new int[]{9, 9, 7, 8, 3}));
        studentList.add(new Student("Harry", 45, new int[]{9, 8, 7, 10, 8}));
        studentList.add(new Student("Margo", 55, new int[]{9, 8, 8, 8, 8}));
        studentList.add(new Student("Ronald", 55, new int[]{8, 9, 8, 7, 7}));
        return studentList;
    }

    // Вывод студентов, средний бал которых выше 9
    public static void output(List<Student> studentList) {
        int count = 0;
        for(Student student : studentList){
            if(student.getRating(student.points) >= 9) {
                System.out.println("Name - " + student.getName() + ". Group - " + student.getGroup() +
                        " rating - " + student.getRating(student.points));
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Студентов с оценками выше 9 нет!");
        }
    }
}
