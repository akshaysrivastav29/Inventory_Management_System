package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "inventory_items")
public class ItemEntity {

    @Id
    @Column(name = "item_id", nullable = false,
            unique = true, length = 8)
    private String id;

    @Column(name = "item_name", nullable = false,
            unique = true, length = 50)
    private String name;

    @Column(name = "item_price", nullable = false)
    private Double price;

    @Column(name = "item_quantity_available", nullable = false)
    private Integer quantityAvailable;

    @Column(name = "item_description")
    private String description;

    @OneToOne
    @JoinColumn(name = "item_category", nullable = false)
    private ItemCategoryEntity category;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}
