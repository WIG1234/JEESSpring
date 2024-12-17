package org.example.donationms.Model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String nom;
    private String email;
    private String motDePasse;
    private String telephone;
    private String Role;
}
