package com.generic.database;

import com.generic.model.Booking;
import com.generic.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jens on 10.01.2017.
 */
public interface BookingRepository extends CrudRepository<Booking, Long>{
}
