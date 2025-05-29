package com.ssmclg.studentmngt.enitities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value="student")
@Builder
public class StudentEntity {
    @Id
    private String id;
    private String name;
    private int age;
    private String department;
}
