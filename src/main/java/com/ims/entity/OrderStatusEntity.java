package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "order_statuses")
public class OrderStatusEntity {

    @Id
    @Column(name = "order_status_id", unique = true, nullable = false, length = 5)
    private String id;

    @Column(name = "order_status_name", unique = true, nullable = false, length = 50)
    private String status;

    @Column(name = "order_status_description")
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}
