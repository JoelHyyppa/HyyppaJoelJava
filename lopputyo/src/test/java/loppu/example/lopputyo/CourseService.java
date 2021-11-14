package loppu.example.lopputyo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface CourseService {

    static Scanner sc = new Scanner(System.in);
    static Object id = null;
    static Object courseId = null;
    public static int courseIdCounter = 0;
    public String courseName;
    public String teacher;
    public String students;
    public static void main(String[] args){
    List<Student> getStudents = new ArrayList<>();
    System.out.println("Delivering the list of students, one moment..");
    String studentList = sc.nextLine();
    System.out.println(studentList);

    List<Course> getCourses = new ArrayList<>();
    System.out.println("Getting list of courses..");
    String courseList = sc.toString();
    System.out.println(courseList);

    sc.close();
    }

    
    List<Course> courseList = new ArrayList<>();
    Student student = ((Student) courseList).getStudentById(id);{

    for(Course c : CourseService.courseList){
        if(course.contains(student)) {
        courseList.add(course);
        }
    }
            return;
    }

    List<Student> studentList = new ArrayList<>();
    Course course = ((Course) studentList).getCourseById(courseId)
    ;
    {
        
    }
    for(Student s : this.studentList){
    if(course.contains(student)) {
    studentList.add(student);
        }
    }
        return;
    }

    List<Course> getCoursesByStudent = new ArrayList<>();
    public List<Course> getCoursesByStudent(List<Course> studentId) {
        return null;
     }{
        for(Course st : CourseService.courseList){
            if(course.contains(student)){
                int studentId;
                courseList.get(studentId);
            }

        }
    }

    boolean addStudentToCourse(long studentId, long courseId);
    public boolean addStudent(Student s){
        if (students < limit) 
        {
            super.registerStudent(s);
            students++;
            System.out.println(students);
            return true;
        }
        else
        {
            System.out.println("Registration not successful.");
            return false;
        }
        }
    public List<Course> getCourses(){
        return List.of(
            new Course("HTML/CSS", 1),
            new Course("Keittokurssi", 2),
            new Course("Näppäimistö tutuksi", 3)

        );
    } //numero perässä on courseId

    public static void getStudents() {
    }
}
