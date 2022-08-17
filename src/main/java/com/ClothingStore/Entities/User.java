package com.ClothingStore.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "Users")
public class User {

    @Id // to make the id in the table primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // makes this column auto increamented
    @Column(name = "id")
    private Long id;
    @Column(name = "Username")
    private String username; // for saving user name in the data base
    @Column(name = "Password")
    private String password; // for saving user's password in the database
    @Column(name = "Email", unique = true)
    private String email;  // for saving email of the user in the database
    @Column(name = "role")
    private String role;
}
