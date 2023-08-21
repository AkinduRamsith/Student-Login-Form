package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImplV1 implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public void saveStudent(Student student) {
//        if(student == null)return;
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setFirstName(student.getFirstName());
        studentEntity.setLastName(student.getLastName());
        studentEntity.setAge(student.getAge());
        studentEntity.setPhoneNumber(student.getPhoneNumber());
        studentEntity.setEmail(student.getEmail());
        studentEntity.setAddress(student.getAddress());
        studentEntity.setInstitute(student.getInstitute());
        studentEntity.setBatch(student.getBatch());
        studentEntity.setGender(student.getGender());
        studentRepository.save(studentEntity);

//        StudentEntity map = modelMapper.map(student, StudentEntity.class);
//        if(map.getAge()==null && map.getFirstName()==null){
//            return;
//        }
//
//        studentRepository.save(map);


    }
}
