package com.GouravThakur.LibraryManagementSystem.DbConfig;


import com.GouravThakur.LibraryManagementSystem.Pojo.Books;
import com.GouravThakur.LibraryManagementSystem.Service.BooksService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
public class BooksDbConfig {

    @Bean()
    public List<Books> books(BooksService booksService) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Books>> typeReference = new TypeReference<List<Books>>() {
        };
        InputStream inputStream = TypeReference.class.getResourceAsStream("/json/Books.json");
        List<Books> books = mapper.readValue(inputStream, typeReference);
        booksService.save(books);
        System.out.println("BOOKS Saved!");
        return books;
    }


}

