package com.generic.database;

import com.generic.model.Item;
import com.generic.model.ItemType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jens on 10.01.2017.
 */
public interface ItemTypeRepository extends CrudRepository<ItemType, Long>{
}
