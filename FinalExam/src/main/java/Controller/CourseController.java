package Controller;

import Entity.Course;
import Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public void create(@RequestBody Course course) {
        courseService.create(course);
    }

}
