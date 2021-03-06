package com.training.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQueries({
        @NamedQuery(name = "Model.Author.findAll", query = "select a from Author a"),
        @NamedQuery(name = "Model.Author.findAuthorsByBookId", query = "select a from Author a, BookAuthor ba where ba.bookId = :bookId and a.id = ba.authorId")
})
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name, nationality, placeOfBirth;
    private Date dateOfBirth;

    public Author(int id, String name, String nationality, String placeOfBirth, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.placeOfBirth = placeOfBirth;
        this.dateOfBirth = dateOfBirth;
    }

    public Author(String name, String nationality, String placeOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.placeOfBirth = placeOfBirth;
    }

    public Author() {
    }

    @JsonProperty
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    @JsonProperty
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty
    public String getNationality() {
        return nationality;
    }
    @JsonProperty
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    @JsonProperty
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
    @JsonProperty
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
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
    public String getName() {
        return name;
    }

    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }
}
