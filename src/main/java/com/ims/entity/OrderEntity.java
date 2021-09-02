package com.ims.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @Column(name = "order_id", nullable = false,
            unique = true, length = 8)
    private Integer id;

    @Temporal(TemporalType.DATE)
    @Column(name = "order_date", nullable = false)
    private Date date;

    @OneToOne
    @JoinColumn(name = "order_item", nullable = false)
    private ItemEntity itemEntity;

    @Column(name = "order_item_quantity", nullable = false)
    private Integer quantity;

    @Column(name = "order_total", nullable = false)
    private Double total;

    @OneToOne
    @JoinColumn(name = "order_category", nullable = false)
    private OrderCategoryEntity category;

    @OneToOne
    @JoinColumn(name = "order_status", nullable = false)
    private OrderStatusEntity status;

    @OneToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private AdminEntity admin;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;

    //TODO: Implement the single column for keeping item id and respective quantity
}
