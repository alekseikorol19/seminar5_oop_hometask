package Service;

import Model.Type;
import Model.Student;
import Model.Teacher;
import java.util.ArrayList;
import java.util.List;

import Model.User;

public class DataService {
    private List<User> userList = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeId(type);
        if (Type.Student == type) {
            Student student = new Student(id, firstName, secondName, lastName);
            userList.add(student);
        }
        if (Type.Teacher == type) {
            Teacher teacher = new Teacher(id, firstName, secondName, lastName);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type){
        int id = 0;
        for (User user : userList) {
            if (user instanceof Teacher && type == Type.Teacher) {
                id = ((Teacher)user).getTeacherId();
            }
            if (user instanceof Student && type == Type.Student) {
                id = ((Student)user).getStudentId();
            }
        }
        return ++id;
    }

    public List<User> getAllStudent(){
        List<User> newList = new ArrayList<User>();
        for (User user : userList) {
            if (user instanceof Student) {
                newList.add(user);
            }
        }
        return newList;
    }
}
