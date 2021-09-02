package com.ims.entity.independant;

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
    @Column(name = "item_category_id", nullable = false,
            unique = true, length = 8)
    private String id;

    @Column(name = "item_category_name", nullable = false,
            unique = true, length = 20)
    private String name;

    @Column(name = "item_category_description")
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}