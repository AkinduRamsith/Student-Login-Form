package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentServiceImplV1 implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveStudent(Student student) {
//        if(student == null)return;
//        if ( student.getAge() == null && student.getAge().isBlank() && student.getFirstName() == null && student.getFirstName().isBlank()) {
//
//            return;
//        }
//        StudentEntity studentEntity=new StudentEntity();
//        studentEntity.setFirstName(student.getFirstName());
//        studentEntity.setLastName(student.getLastName());
//        studentEntity.setAge(student.getAge());
//        studentEntity.setPhoneNumber(student.getPhoneNumber());
//        studentEntity.setEmail(student.getEmail());
//        studentEntity.setAddress(student.getAddress());
//        studentEntity.setInstitute(student.getInstitute());
//        studentEntity.setBatch(student.getBatch());
//        studentEntity.setGender(student.getGender());
//        studentRepository.save(studentEntity);

        StudentEntity map = modelMapper.map(student, StudentEntity.class);
        if (map.getAge() == null || map.getAge().isBlank() || map.getFirstName() == null || map.getFirstName().isBlank() || map.getPhoneNumber() == null || map.getPhoneNumber().isBlank() || map.getEmail() == null || map.getEmail().isBlank() || map.getAddress() == null || map.getAddress().isBlank() || map.getLastName() == null || map.getLastName().isBlank() || map.getBatch() == null || map.getBatch().isBlank() || map.getInstitute() == null || map.getInstitute().isBlank() || map.getGender()==null || map.getGender().isBlank()) {
            System.out.println("Hello");
            return;
        }

        studentRepository.save(map);


    }
}
