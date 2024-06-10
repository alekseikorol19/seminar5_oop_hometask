package Model;

public class Student extends User {

    private int studentId;

    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + "]" + super.toString();
    }

    public int getStudentId() {
        return studentId;
    }

    
    
}
