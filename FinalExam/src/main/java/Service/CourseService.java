package Service;

import Entity.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
     void create(Course course);
}
