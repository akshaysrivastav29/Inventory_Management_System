package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


/** Represents 'inventory_admin' Table
 * @author Rajesh Sinha
 * @version 1.0
 */
@Getter
@Setter
@Entity
@Table(name = "inventory_admin")
public class AdminEntity {

    @Id
    @Column(name = "admin_id",length = 15,
            unique = true, nullable = false)
    private String id;

    @Column(name = "admin_first_name", nullable = false,
            length = 50)
    private String firstName;

    @Column(name = "admin_last_name", nullable = false,
            length = 50)
    private String lastName;

    @Column(name = "admin_email", nullable = false,
            unique = true, length = 100)
    private String email;

    @Column(name = "admin_contact", nullable = false,
            unique = true, length = 10)
    private long contact;

    @Column(name = "admin_password", nullable = false,
            length = 20)
    private String password;

    @Column(name = "admin_enabled", nullable = false)
    private boolean enabled;

    @OneToOne
    @JoinColumn(name = "inventory_id", nullable = false)
    private InventoryEntity inventory;
}
