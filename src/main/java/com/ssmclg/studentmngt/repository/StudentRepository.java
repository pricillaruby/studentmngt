package com.ssmclg.studentmngt.repository;

import com.ssmclg.studentmngt.enitities.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<StudentEntity,Long> {
    StudentEntity findById(String id);
}
