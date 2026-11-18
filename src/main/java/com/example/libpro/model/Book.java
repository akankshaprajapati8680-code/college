
package com.example.libpro.model;

public class Book {

    // 1. Instance Variables
    private Integer id;
    private String title;
    private String author;
    private String category;
    private boolean available;

    // 2. Default Constructor
    public Book() {
    }

    // 3. Parameterized Constructor
    public Book(Integer id, String title, String author,
                String category, boolean available) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.available = available;
    }

    // 4. Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // 5. toString() Method
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", available=" + available +
                '}';
    }
}
