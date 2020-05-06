package Controller;

import Entity.Student;
import Repo.StudentRepo;
import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;


    @GetMapping
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Student getById(@PathVariable("id") Long id) {
        return studentService.getById(id);
    }

    @PostMapping("/add")
    public void create(@RequestBody Student student) {
        studentService.create(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        studentService.deleteById(id);
    }

    @GetMapping("/find/{name}")
    public List<Student> getByName(@PathVariable(value = "name") @RequestHeader String name) {
        return studentService.getByName(name);
    }
}
