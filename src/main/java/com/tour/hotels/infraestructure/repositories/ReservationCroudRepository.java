package com.tour.hotels.infraestructure.repositories;

import com.tour.hotels.infraestructure.entities.Hotel;
import com.tour.hotels.infraestructure.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCroudRepository  extends CrudRepository<Hotel,Integer>{
}

