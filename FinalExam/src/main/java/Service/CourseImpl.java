package Service;

import Entity.Course;
import Repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseImpl implements CourseService {
    @Autowired
    CourseRepo courseRepo;

    @Override
    public void create(Course course) {
        courseRepo.save(course);
    }
}
