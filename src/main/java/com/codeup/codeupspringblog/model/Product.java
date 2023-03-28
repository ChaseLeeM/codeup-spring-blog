package com.codeup.codeupspringblog.model;

import jakarta.persistence.*;

@Entity
@Table(name= "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private int costInCents;

    public Product(long id, String name, int costInCents) {
        this.id = id;
        this.name = name;
        this.costInCents = costInCents;
    }

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }
}

