package com.project.ecommerce.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int orderItemId;

    private  int quantity;

    private  int totalPrice;

    @OneToOne
    @JoinColumn(name = "product_id")
    private  Product product;


    @ManyToOne
    @JoinColumn(name = "order_id")
    private  Order order;
}
