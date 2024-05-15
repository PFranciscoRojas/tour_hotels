package com.tour.hotels.infraestructure.repositories;

import com.tour.hotels.infraestructure.entities.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelCroudRepository extends CrudRepository<Hotel,Integer> {
}
