package account;

/**
 * Refactor Exercise 2: Account
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
// TODO: Think about what can be a issue of the Student class?
public class Student {

    private double gpa;
    private final String name;
    private final int studentID;

    public Student(String name, int studentID, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public void updateGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return studentID;
    }
}
