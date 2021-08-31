package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/** Represents 'inventory' Table
 * @author Rajesh Sinha
 * @version 1.0
 */
@Getter
@Setter
@Entity
@Table(name = "inventory")
public class InventoryEntity {

    @Id
    @Column(name = "inventory_id", nullable = false,
            unique = true, length = 10)
    private String id;

    @Column(name = "inventory_zip_code", nullable = false,
            length = 6)
    private int zipCode;

    @Column(name = "inventory_active", nullable = false)
    private boolean active;

    @OneToOne(mappedBy = "inventory")
    private AdminEntity admin;

    @OneToMany(targetEntity = ItemEntity.class)
    @JoinColumn(name = "inventory_items", referencedColumnName = "inventory_id")
    private List<ItemEntity> items;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}
