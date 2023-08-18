package com.interswitch.legitProducts.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
