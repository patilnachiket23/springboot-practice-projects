package com.nachiket.JustPractice.repository;

import com.nachiket.JustPractice.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepo {

    private final Map<Integer,Book> bookdb = new HashMap<>();

    public Book addBook(Book book){
        bookdb.put(book.getId(), book);
        return book;
    }

    public List<Book> getAllBook(){
        return new ArrayList<>(bookdb.values());
    }




}
