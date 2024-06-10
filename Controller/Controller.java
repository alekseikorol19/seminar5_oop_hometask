package Controller;

import Model.Student;
import Model.Type;
import Model.User;
import Service.DataService;
import View.StudentView;

public class Controller {

    private StudentView sv = new StudentView();
    private DataService ds = new DataService();

    public void createStudent(String firstName, String secondName, String lastName){
        ds.create(firstName, secondName, lastName, Type.Student);
    }

    public void printStudents(){
        for (User iterable : ds.getAllStudent()) {
            sv.printStudent((Student)iterable);
        }
    }
    
}
