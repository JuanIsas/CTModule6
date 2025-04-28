import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList <Student> students = new ArrayList <>();
        Student student1 = new Student (2, "Alejandro", "Los Angeles");
        Student student2 = new Student (9, "Charlie", "Garden Grove");
        Student student3 = new Student (8, "David", "Santa Ana");
        Student student4 = new Student (3, "Brian", "WestSide");
        Student student5 = new Student (5, "Fauzo", "Corona");
        Student student6 = new Student (4, "Lary", "Pomona");
        Student student7 = new Student (7, "Gary", "Fullerton");
        Student student8 = new Student (6, "John", "Orange");
        Student student9 = new Student (10, "Harry", "Beverly Hills");
        Student student10 = new Student (1, "Edward", "Pineapple");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        //System.out.println(students);
        System.out.println("Sorted By Roll Number \n");

        //Collections.sort(students, new NameComparator());
        //Collections.sort(students, new RollNumberComparator);
        selectionSort(students);


       System.out.println(students);




    }

    private static void selectionSort(ArrayList<Student> students) {
        int n = students.size();
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for(int j = i +1; j < n; j++) {
                if (students.get(min).getRollNumber() > students.get(j).getRollNumber()) {
                    min = j;
                }
            }
            Student temp = students.get(i);
            students.set(i, students.get(min));
            students.set(min, temp);
        }


    }
}

