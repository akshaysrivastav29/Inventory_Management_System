package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "item_categories")
public class ItemCategoryEntity {

    @Id
    @Column(name = "item_category_id", unique = true, nullable = false, length = 8)
    private String id;

    @Column(name = "item_category_name", unique = true, nullable = false, length = 20)
    private String name;

    @Column(name = "item_category_description")
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}
