package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "inventory_order_statuses")
public class OrderStatusEntity {

    @Id
    @Column(name = "order_status_id", nullable = false,
            unique = true, length = 5)
    private String id;

    @Column(name = "order_status_name", nullable = false,
            unique = true, length = 50)
    private String status;

    @Column(name = "order_status_description")
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}
