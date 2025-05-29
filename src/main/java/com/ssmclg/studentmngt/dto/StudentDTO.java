package com.ssmclg.studentmngt.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDTO {
    private long id;
    private String name;
    private int age;
    private String department;
}
