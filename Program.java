import Controller.Controller;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("AAA", "AA", "A");
        controller.createStudent("BBB", "BB", "B");
        controller.createStudent("CCC", "CC", "C");

        controller.printStudents();
        
    }
}
