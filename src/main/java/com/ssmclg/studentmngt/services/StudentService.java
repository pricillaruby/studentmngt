package com.ssmclg.studentmngt.services;

import com.ssmclg.studentmngt.dto.StudentDTO;

import com.ssmclg.studentmngt.enitities.StudentEntity;
import com.ssmclg.studentmngt.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    StudentRepository studentRepository;

    public void add(StudentDTO studentDTO){
        System.out.println("Add Student in Service layer"+studentDTO);


        StudentEntity studentEntity = StudentEntity.builder()
                .name(studentDTO.getName())
                .age(studentDTO.getAge())
                .department(studentDTO.getDepartment())
                .build();

        studentRepository.save(studentEntity);
    }

    public StudentDTO get(String id){
        StudentEntity studentEntity= studentRepository.findById(id);
        System.out.println(StudentDTO.builder()
                .name(studentEntity.getName())
                .age(studentEntity.getAge())
                .department(studentEntity.getDepartment())
                .build());
        return StudentDTO.builder()
                .name(studentEntity.getName())
                .age(studentEntity.getAge())
                .department(studentEntity.getDepartment())
                .build();
    }

    public void update(String id,StudentDTO studentDTO){
        StudentEntity studentEntity = studentRepository.findById(id);
        studentEntity.setName(studentDTO.getName());
        studentEntity.setAge(studentDTO.getAge());
        studentEntity.setDepartment(studentEntity.getDepartment());

        studentRepository.save(studentEntity);
        System.out.println(studentEntity);
    }

    public void delete(String id){
        StudentEntity entity = studentRepository.findById(id);
        studentRepository.delete(entity);
    }
}
