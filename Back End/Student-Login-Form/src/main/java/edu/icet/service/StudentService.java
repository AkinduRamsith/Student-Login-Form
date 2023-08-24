package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;

public interface StudentService {
public void saveStudent(Student student);

    boolean getStudentByUserName(String userName,String password);
}
