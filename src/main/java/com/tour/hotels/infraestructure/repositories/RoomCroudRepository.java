package com.tour.hotels.infraestructure.repositories;

import com.tour.hotels.infraestructure.entities.Hotel;
import com.tour.hotels.infraestructure.entities.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomCroudRepository  extends CrudRepository<Hotel,Integer>{
}

