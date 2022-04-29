package com.GouravThakur.LibraryManagementSystem.Service;

import com.GouravThakur.LibraryManagementSystem.Pojo.Books;
import com.GouravThakur.LibraryManagementSystem.Pojo.Students;
import com.GouravThakur.LibraryManagementSystem.Repo.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BooksService  {

    @Autowired
    private BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }


    public List<Books> printBook() {
       List<Books> books = new ArrayList<>();
       booksRepository.findAll().forEach(books::add);

        return books;
    }

    public Books addBook(Books books) {
      return  booksRepository.save(books);

    }

    public Books updateBook(Books books) {
       return booksRepository.save(books);
    }

    public Books deleteBook(Books books,String title) {
        booksRepository.delete(books);
        return books;
    }

    public Students rentBook(Students students, int bookId) {
       booksRepository.findById(bookId);
       students.setBookId(bookId);
        System.out.println("The required book is rented to this " + " " + students);
       return students;

    }

    public void save(List<Books> books) {
        booksRepository.saveAll(books);
    }


}





