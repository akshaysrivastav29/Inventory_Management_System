package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "inventories")
public class InventoryEntity {

    @Id
    @Column(name = "inventory_id", unique = true, nullable = false, length = 10)
    private String id;

    @Column(name = "inventory_zip_code", nullable = false, length = 6)
    private Integer zipCode;

    @Column(name = "inventory_active", nullable = false)
    private Boolean active=false;

    @OneToOne(mappedBy = "inventory")
    private AdminEntity admin;

    @OneToMany(mappedBy = "inventory")
    private Set<StorageEntity> items;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}
