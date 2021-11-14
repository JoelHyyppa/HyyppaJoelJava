package loppu.example.lopputyo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCourseController {
    
    List<Student> studentcount = new ArrayList<>();
    List<Course> courses = new ArrayList<>();
    
    @PostConstruct
    public void myCounter(){
        studentcount.add(new Student ("Joppe", "Hyyppä", "21"));
        studentcount.add(new Student ("Tapsa", "Virtanen", "55"));
        studentcount.add(new Student ("Ismo", "Laitela", "55"));
    }

    @GetMapping("courses")
    public List<Course> getCourses(){
        return (List<Course>) this.courses.get(0);
    }

    @GetMapping("students")
    public Student getStudents(){
        return this.studentcount.get(0);
    }

    @GetMapping("onlinecourses")
    public OnlineCourse getOnlineCourse(){
        return this.getOnlineCourse();
    }

    @GetMapping("students/{id}")
    public String test(@PathVariable String student, PathVariable studentId){
        return "<h1>"+student+"</h1>"+ studentId;
    }

    @GetMapping("courses/{id}")
    public String test2(@PathVariable String course, PathVariable courseId){
        return "<h1>"+course+"</h1>"+ courseId;
    }

    @PostMapping("add")
    public Course firstPost(@RequestBody Course course){
        courses.add(course);
        return course;
    }

}
