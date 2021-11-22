package com.manifestcorp.techreads.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    double rating;
    String author;
    String img;




    public Book() {}
    public Book(String title) {this.title = title;}

    public Book(String title, double rating, String author,String img) {
        this.title = title;
        this.rating = rating;
        this.author = author;
        this.img = img;
    }



    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getRating() {return rating;}
    public void setRating(double rating) {this.rating = rating;}

    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}

    public String getImg() {return img;}
    public void setImg(String img) {this.img = img;}

}
