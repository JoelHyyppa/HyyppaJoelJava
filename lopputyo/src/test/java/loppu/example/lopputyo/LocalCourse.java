package loppu.example.lopputyo;

import java.util.List;

public class LocalCourse extends Course {
    private String classRoom;
    private static int limit = 25;
    private static int students = 0;

    public LocalCourse(String teacher, String courseName, String classRoom){
        super(classRoom, limit);
        this.classRoom = classRoom;
    }

    public String getClassRoom(){
        return this.classRoom;
    }

    public void setClassRoom(String classRoom){
        this.classRoom = classRoom;
    }

    @Override
    public boolean addStudent(Student s){
        if (students < limit) 
        {
            super.addStudent(s);
            students++;
            System.out.println(students);
            return true;
        }
        else
        {
            System.out.println("Unable to add students - course full.");
            return false;
        }
        }

        public void removeStudent(Student s){
            super.removeStudent(s);
            students--;
            System.out.println("Do you really want to remove student? (Y/N)");
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


