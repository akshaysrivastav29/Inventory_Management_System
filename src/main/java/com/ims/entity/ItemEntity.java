package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "items")
public class ItemEntity {

    @Id
    @Column(name = "item_id", unique = true, nullable = false, length = 8)
    private String id;

    @Column(name = "item_name", unique = true, nullable = false, length = 50)
    private String name;

    @Column(name = "item_price", nullable = false)
    private Double price;

    @Column(name = "item_description")
    private String description;

    @OneToOne
    @JoinColumn(name = "item_category", nullable = false)
    private ItemCategoryEntity category;

    @OneToMany(mappedBy = "item")
    private Set<StorageEntity> inventories;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}
