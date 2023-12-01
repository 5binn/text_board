package org.example;

public class Wise {
    private String content;
    private String author;
    private int id;

    Wise(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
    String getAuthor() {
        return this.author;
    }
    String getContent() {
        return this.content;
    }
    int getId() {
        return this.id;
    }

}
