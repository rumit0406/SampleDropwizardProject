package com.training.DAO;

import com.training.api.Book;

import java.util.List;

public interface BookDAO {
    int insert(Book toBeInserted, String dopString);
    List<Book> findBooksByAuthorId(int authorId);
    List<Book> findAll();
}
