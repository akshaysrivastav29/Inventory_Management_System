package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "inventory_order_category")
public class OrderCategoryEntity {

    @Id
    @Column(name = "order_category_id", nullable = false,
            unique = true, length = 4)
    private String id;

    @Column(name = "order_category_name", nullable = false,
            unique = true)
    private String name;

    @Column(name = "order_category_description")
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}
