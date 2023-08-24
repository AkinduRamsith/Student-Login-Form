package edu.icet.repository;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,Long> {

    StudentEntity findByUserNameAndPassword(String userName,String password);
}
