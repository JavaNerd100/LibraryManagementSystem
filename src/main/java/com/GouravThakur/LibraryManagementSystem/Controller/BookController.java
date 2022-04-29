package com.GouravThakur.LibraryManagementSystem.Controller;


import com.GouravThakur.LibraryManagementSystem.Pojo.Books;
import com.GouravThakur.LibraryManagementSystem.Pojo.Students;
import com.GouravThakur.LibraryManagementSystem.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/list/books")
    public List<Books> printBook() {
        return booksService.printBook();
    }


    @RequestMapping(method= RequestMethod.POST, value = "/list/add/books")
    public  Books addBook(@RequestBody Books books) {
       return booksService.addBook(books);
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/list/update/books")
    public Books updateBook( @RequestBody Books books ){
       return booksService.updateBook(books);
    }

    @RequestMapping(method= RequestMethod.DELETE, value = "/list/delete/books/{title}")
    public Books deleteBook(@RequestBody Books books, @PathVariable String title){
        return booksService.deleteBook(books, title);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/list/rent/books/{bookId}")
    public Students rentBook(@RequestBody Students students, @PathVariable int  bookId) {
        return booksService.rentBook(students,bookId);

    }
}
