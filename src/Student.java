public class Student {
    private int rollNumber;
    private String name;
    private String address;

    // default constructor
    public Student () {
        this.rollNumber = 0;
        this.name = null;
        this.address = null;
    }
    // parametrized constructor
    public Student (int rollNumber, String name, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toString () {
        return "The Students information is the following: \n\t Student Name: "
                + name + "\n\t Roll Number:  " + rollNumber +
                "\n\t Student's adress: " + address + "\n";
    }
}
