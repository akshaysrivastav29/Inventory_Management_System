package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

    @Column(name = "inventory_name", nullable = false,
            length = 50)
    private String name;

    @Column(name = "inventory_active", nullable = false)
    private boolean active;

    @OneToOne(mappedBy = "inventory")
    private AdminEntity admin;
}
