package org.example.userms.Model;

import lombok.Data;

@Data
public class Donation {
    private long id;
    private double amount;
    private String description;
}
