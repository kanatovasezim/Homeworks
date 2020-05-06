package Service;

import Entity.Student;
import Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    @Override
    public List<Student> getByName(String name) {
        return studentRepo.findAllByName(name);
    }

    @Override
    public Student getById(Long id) {
        return studentRepo.getOne(id);
    }

    @Override
    public void deleteById(Long id) {
        studentRepo.deleteById(id);
        System.out.println("Deleted");
    }

    @Override
    public void create(Student student) {
        studentRepo.save(student);
        System.out.println("Created");
    }
}
