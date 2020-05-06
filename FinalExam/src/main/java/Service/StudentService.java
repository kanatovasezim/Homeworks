package Service;

import Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAll();
    List<Student> getByName(String name);
    Student getById(Long id);
    void deleteById(Long id);
    void create(Student student);
}
