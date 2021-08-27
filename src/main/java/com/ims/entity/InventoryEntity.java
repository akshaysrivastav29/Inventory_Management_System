package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/** Represents 'Inventory' Table
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
            unique = true, length = 8)
    private String id;

    @Column(name = "inventory_name", nullable = false,
            length = 30)
    private String name;

    @Column(name = "inventory_zip_code", nullable = false,
            length = 6)
    private int zipCode;

    @Column(name = "inventory_contact", nullable = false,
            unique = true, length = 10)
    private long contact;

    @Column(name = "inventory_email", nullable = false,
            unique = true, length = 50)
    private String email;

    @Column(name = "inventory_active", nullable = false)
    private boolean active;
}
