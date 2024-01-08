package com.workintech.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="category",schema = "workintech")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "code")
    private String code;
    @Column(name = "rating")
    private Integer rating;
    @Column(name="title")
    private String title;
    @Column(name = "gender")
    @Enumerated
    private Gender gender;

    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.REFRESH, CascadeType.PERSIST},mappedBy = "category")
    private List<Product> product;
}
