package com.ims.entity.keys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class StorageCompositeKey implements Serializable {

    @Column(name = "storage_inventory_id")
    String inventoryId;

    @Column(name = "storage_item_id")
    String itemId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StorageCompositeKey)) return false;
        StorageCompositeKey that = (StorageCompositeKey) o;
        return getInventoryId().equals(that.getInventoryId()) && getItemId().equals(that.getItemId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInventoryId(), getItemId());
    }
}
