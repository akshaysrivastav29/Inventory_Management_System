package com.ims.entity;

import com.ims.entity.keys.StorageCompositeKey;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "inventory_storage")
public class StorageEntity {

    @EmbeddedId
    private StorageCompositeKey id;

    @ManyToOne
    @MapsId("inventoryId")
    @JoinColumn(name = "inventory_id", nullable = false)
    private InventoryEntity inventory;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "item_id", nullable = false)
    private ItemEntity item;

    @Column(name = "item_quantity_available", nullable = false)
    private int quantity;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_updated_on", nullable = false)
    private Date lastUpdatedDate;
}
