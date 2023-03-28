package com.codeup.codeupspringblog.model;

import jakarta.persistence.*;

@Entity
@Table (name = "dogs")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", columnDefinition = "int(11) unsigned")
    private long id;

    @Column (name = "age", nullable = false, columnDefinition = "tinyint(3) unsigned")
    private int age;

    @Column(name = "name", nullable = false, length = 200)
    private String name;

    @Column(name = "resideState", columnDefinition = "char(2) default 'XX'")
    private String resideState;

    public Dog(){
    }

    public Dog(long id, int age, String name, String resideState) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.resideState = resideState;
    }

    public Dog(int age, String name, String resideState) {
        this.age = age;
        this.name = name;
        this.resideState = resideState;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResideState() {
        return resideState;
    }

    public void setResideState(String resideState) {
        this.resideState = resideState;
    }
}
