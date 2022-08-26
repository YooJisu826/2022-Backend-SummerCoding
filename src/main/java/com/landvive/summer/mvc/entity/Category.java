package com.landvive.summer.mvc.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "product")
@Table(name= "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI 형식으로 만들어짐!
    private Long id;

    private String name;
    private Long count; //해당 카테고리의 Product 개수

    @OneToMany(mappedBy = "category")
    private List<Product> productList;
}
