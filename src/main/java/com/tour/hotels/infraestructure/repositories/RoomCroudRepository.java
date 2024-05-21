package com.tour.hotels.infraestructure.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.tour.hotels.infraestructure.entities.Room;



@Repository
public interface RoomCroudRepository extends CrudRepository<Room, Long>{
}