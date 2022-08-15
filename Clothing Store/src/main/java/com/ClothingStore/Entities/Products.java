package com.ClothingStore.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Products")
public class Products {

    @Id // to make the id in the products primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // makes this column auto increamented
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name; // to store the name of the clothing product

    @Column(name = "image")
    private String image; // to store the image url of the product

    @Column(name = "size")
    private String size; // to store the size of the product ex (large,medium,small)

    @Column(name = "color")
    private String color; // to store the color of the clothing item

    @Column(name = "Description")
    private String description;

    @Column(name="price")
    private double price;

    @Column(name = "Added_To_Cart")
    private boolean Added_to_cart;
}
