package com.GouravThakur.LibraryManagementSystem.Repo;


import com.GouravThakur.LibraryManagementSystem.Pojo.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books,Integer> {

}