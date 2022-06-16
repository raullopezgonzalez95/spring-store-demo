package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "equivalencias")
public class FoodEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "categoria", length=50)
    private String category;

    @Column(name = "alimento", length=50)
    private String aliment;

    @Column(name = "porcion", length=50)
    private String portion;

    @Column(name = "existencia")
    private Boolean stock;

    @Column(name = "comentario", length=500)
    private String comment;

    public FoodEntity() {

    }

    public FoodEntity(Integer id, String category, String aliment, String portion, Boolean stock, String comment) {
        this.id = id;
        this.category = category;
        this.aliment = aliment;
        this.portion = portion;
        this.stock = stock;
        this.comment = comment;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAliment(String aliment) {
        this.aliment = aliment;
    }

    public void setPortion(String portion) {
        this.portion = portion;
    }

    public void setStock(Boolean stock) {
        this.stock = stock;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getAliment() {
        return aliment;
    }

    public String getPortion() {
        return portion;
    }

    public Boolean getStock() {
        return stock;
    }

    public String getComment() {
        return comment;
    }
}
