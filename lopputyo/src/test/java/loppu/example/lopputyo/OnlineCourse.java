package loppu.example.lopputyo;

import java.util.List;

public class OnlineCourse extends Course {
    private String courseAddress;

    public OnlineCourse(String teacher, String courseName, String courseAddress) {
        super(courseAddress, courseId);
        this.courseAddress = courseAddress;
    }

    public String getCourseAddress(){
        return this.courseAddress;
    }

    public void setCourseAddress(String courseAddress){
        this.courseAddress = courseAddress;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getTeacher(){
        return this.teacher;
    }

    public void setTeacher(String teacher){
        this.teacher = teacher;
    }

    @Override
    public String toString(){
        return String.format(getCourseName() + " " + getTeacher() + " " + getCourseAddress());
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
