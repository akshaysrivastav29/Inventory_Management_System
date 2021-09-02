package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "owners")
public class OwnerEntity {

    @Id
    @Column(name = "owner_id", unique = true, nullable = false, length = 8)
    private String id;

    @Column(name = "owner_first_name", nullable = false)
    private String firstName;

    @Column(name = "owner_last_name", nullable = false)
    private String lastName;

    @Column(name = "owner_email", unique = true, nullable = false, length = 50)
    private String email;

    @Column(name = "owner_contact", unique = true, nullable = false, length = 10)
    private Long contact;

    @Column(name = "owner_password", nullable = false)
    private String password;
}
