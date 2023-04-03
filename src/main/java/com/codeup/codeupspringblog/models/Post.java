package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private long id;

    @Column (name = "title", nullable = false, length = 55)
    private String title;

    @Column (name = "body", nullable = false, length = 300)
    private String body;

    @Column (name = "category", nullable = false, length = 55)
    private String category;

    public Post() {
    }

    public Post(long id, String title, String body, String category) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.category = category;
    }


    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getBody() {return body;}

    public void setBody(String body) {this.body = body;}

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getCategory() {return category;}

    public void setCategory(String category) {this.category = category;}


}