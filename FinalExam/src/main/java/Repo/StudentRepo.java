package Repo;

import Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    @Query(value = "select s.* from student s" +
            " where s.fio= :name", nativeQuery = true)
    List<Student> findAllByName(@Param("name") String name);
}
