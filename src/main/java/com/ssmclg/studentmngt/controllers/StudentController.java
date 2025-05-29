package com.ssmclg.studentmngt.controllers;

import com.ssmclg.studentmngt.dto.StudentDTO;
import com.ssmclg.studentmngt.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
public class StudentController {

    StudentService studentService;

    @PostMapping("/add")
    public void add(@RequestBody StudentDTO studentDTO){
        studentService.add(studentDTO);
    }

    @GetMapping("/get/{id}")
    public StudentDTO get(@PathVariable String id){
         return studentService.get(id);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable String id , @RequestBody StudentDTO studentDTO){
        studentService.update(id,studentDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        studentService.delete(id);
    }
}

