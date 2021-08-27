package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "admin")
public class AdminEntity {

    @Id
    @Column(name = "admin_id",length = 15,
            unique = true, nullable = false)
    private String id;

    @Column(name = "admin_first_name", nullable = false,
            length = 20)
    private String firstName;

    @Column(name = "admin_last_name", nullable = false,
            length = 20)
    private String lastName;

    @Column(name = "admin_email", nullable = false,
            length = 50)
    private String email;

    @Column(name = "admin_contact", nullable = false,
            length = 10)
    private long contact;

    @Column(name = "admin_address", nullable = false,
            length = 100)
    private String address;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "admin_joining_date", nullable = false)
    private Date joiningDate;

    @Column(name = "admin_active", nullable = false)
    private boolean active;
}
