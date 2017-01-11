package com.generic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Jens on 10.01.2017.
 */
@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String label;
    private String description;

    @OneToOne
    private ItemType itemType;


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
