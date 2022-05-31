package com.training.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.checkerframework.checker.units.qual.N;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQueries({
        @NamedQuery(name = "Model.Book.findAll", query = "select b from Book b"),
        @NamedQuery(name = "Model.Book.findBooksByAuthorId", query = "select b from Book b where b.authorId = :authorId")
})

public class Book {
    private String name, authorName, genre;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private int authorId;
    private Date dateOfPublish, dateAdded;

    public Book(String name, String authorName, String genre, int authorId) {
        this.name = name;
        this.authorName = authorName;
        this.genre = genre;
        this.authorId = authorId;
//        this.dateOfPublish = dateOfPublish;
        this.dateAdded = new Date();
    }

    public Book() {
    }

    public Book(String name, String authorName, String genre, int authorId, int id, Date dateOfPublish, Date dateAdded) {
        this.name = name;
        this.authorName = authorName;
        this.genre = genre;
        this.authorId = authorId;
        this.id = id;
        this.dateOfPublish = dateOfPublish;
        this.dateAdded = dateAdded;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }
    @JsonProperty
    public String getAuthorName() {
        return authorName;
    }
    @JsonProperty
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    @JsonProperty
    public String getGenre() {
        return genre;
    }
    @JsonProperty
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @JsonProperty
    public int getAuthorId() {
        return authorId;
    }
    @JsonProperty
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    @JsonProperty
    public int getId() {
        return id;
    }

    @JsonProperty
    public void setId(int id) {
        this.id = id;
    }
    @JsonProperty
    public Date getDateOfPublish() {
        return dateOfPublish;
    }
    @JsonProperty
    public void setDateOfPublish(Date dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }
    @JsonProperty
    public Date getDateAdded() {
        return dateAdded;
    }
    @JsonProperty
    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
