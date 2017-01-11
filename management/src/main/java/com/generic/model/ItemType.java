package com.generic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Jens on 10.01.2017.
 */
@Entity
public class ItemType {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
