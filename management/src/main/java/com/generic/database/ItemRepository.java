package com.generic.database;

import com.generic.model.Booking;
import com.generic.model.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jens on 10.01.2017.
 */
public interface ItemRepository extends CrudRepository<Item, Long>{
}
