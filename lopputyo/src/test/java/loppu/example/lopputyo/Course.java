package loppu.example.lopputyo;

public abstract class Course implements CourseService {
    public static int courseId;
    public static int courseIdCounter = 0;
    public String courseName;
    public String teacher;
    public String studentList;

    public Course(String courseName, int courseId){
        this.courseName = courseName;
        Course.courseId = courseIdCounter++;
    }

    void studentList(){
        System.out.println("Tulostetaan opiskelijalistaa");
        studentList();
        System.out.println(studentList);
    }

    public boolean addStudent(Student s) {
        return true;
        }

    public void removeStudent(Student s) {
    }

    public boolean contains(Student student) {
        return false;
    }



    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        return false;
    }

    public Course getCourseById(Object courseid2) {
        return null;
    }
}


