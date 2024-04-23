package com.tour.hotels.infraestructure.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tour.hotels.infraestructure.entities.Room;

public interface RoomCroudRepository extends CrudRepository<Room, Long> {
}
