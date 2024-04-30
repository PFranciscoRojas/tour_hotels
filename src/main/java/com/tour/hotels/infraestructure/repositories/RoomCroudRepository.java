package com.tour.hotels.infraestructure.repositories;

import java.util.List;
import java.util.Optional;

import com.tour.hotels.domain.dto.RoomDto;
import com.tour.hotels.infraestructure.entities.Room;

public interface RoomCroudRepository {

    List<Room> findAll();

    void deleteById(Long id);

    Optional<Room> finById(Long id);

    RoomDto save(RoomDto roomDto);


}
