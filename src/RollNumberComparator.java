import java.util.Comparator;

public class RollNumberComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNumber()>o2.getRollNumber()?1 : o1.getRollNumber()< o2.getRollNumber() ?-1 : 0;
    }
}
//this method compares the roll number of object student 1 to roll number of object student 2