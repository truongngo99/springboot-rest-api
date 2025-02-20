package asia.executionlab.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import asia.executionlab.springboot.bean.Student;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent() {
        Student student = new Student(1, "Ramesh", "Fadatare");
        return student;
    }

    @GetMapping("students")
    public List<Student> getStudents(@RequestParam String param) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Ramesh1", "Fadatare1"));
        students.add(new Student(2, "Ramesh2", "Fadatare2"));
        students.add(new Student(3, "Ramesh3", "Fadatare3"));
        return students;
    }

    // Spring boot REST API with Path Variable
    // http://localhost:8080/students/1/ngo/truong
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId, @PathVariable("first-name") String firstName,
            @PathVariable("last-name") String lastName) {
        return new Student(studentId, firstName, lastName);
    }

    // Spring boot REST API with Request Param
    // http://localhost:8080/students/query?id=1&firstName=Hihi&lastName=Haha
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id, @RequestParam String firstName,
            @RequestParam String lastName) {
        return new Student(id, firstName, lastName);
    }

}
