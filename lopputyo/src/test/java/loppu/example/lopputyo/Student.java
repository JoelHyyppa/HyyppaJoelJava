package loppu.example.lopputyo;

import java.util.List;

public class Student implements CourseService {
    public String name;
    public String surname;
    public int age;
    public int studentId;
    private static int studentIdCounter = 0;

    public Student(String name, String surname, int age, int studentId){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studentId = studentIdCounter++;
    }

public Student(Object object, String string, String string2) {
    }

@Override
    public String toString(){
        return String.format(surname + " " + name);
    }

//@Override
//public List<Course> getCoursesByStudent(List<Course> studentId) {
   // return null;
//}

@Override
public boolean addStudentToCourse(long studentId, long courseId) {
    return false;
}

@Override
public boolean addStudent(Student s) {
    return false;
}

public Student getStudentById(Object id) {
    return null;
}

@Override
public List<Course> getCoursesByStudent(List<Course> studentId) {
    return null;
}

@Override
public List<Course> getCourses() {
    
    return null;
}
}