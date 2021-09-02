package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "order_categories")
public class OrderCategoryEntity {

    @Id
    @Column(name = "order_category_id", unique = true, nullable = false, length = 4)
    private String id;

    @Column(name = "order_category_name", unique = true, nullable = false, length = 20)
    private String name;

    @Column(name = "order_category_description")
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}
