package com.GouravThakur.LibraryManagementSystem.DbConfig;

import com.GouravThakur.LibraryManagementSystem.Pojo.Students;
import com.GouravThakur.LibraryManagementSystem.Service.StudentsService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
public class StudentDbConfig{

    @Bean()
    public List<Students> students(StudentsService studentsService) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Students>> typeReference = new TypeReference<List<Students>>() {
        };
        InputStream inputStream = TypeReference.class.getResourceAsStream("/json/Students.json");
        List<Students> students = mapper.readValue(inputStream, typeReference);
        studentsService.save(students);
        System.out.println("students Saved!");
        return students;
    }

}
