package com.training.DAO;

import com.training.api.Author;
import com.training.api.DateParser;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class AuthorDAOJpaImpl extends AbstractDAO<Author> implements AuthorDAO {

    public AuthorDAOJpaImpl(SessionFactory factory) {
        super(factory);
    }

    @Override
    public Author insert(Author toBeInserted, String dobString) {
        toBeInserted.setDateOfBirth(DateParser.parseDate(dobString));
        return persist(toBeInserted);
    }

    @Override
    public Optional<Author> findById(int id) {
        Author author = get(id);
        return author == null ? Optional.empty() : Optional.of(author);
    }

    @Override
    public List<Author> findAll() {
        return (List<Author>) namedQuery("Model.Author.findAll").list();
    }
}
