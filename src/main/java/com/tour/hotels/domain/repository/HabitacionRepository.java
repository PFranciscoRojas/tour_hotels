package com.tour.hotels.domain.repository;

import java.util.List;
import java.util.Optional;

import com.tour.hotels.domain.dto.RoomDto;

public interface HabitacionRepository {

    List <RoomDto> getAll();
    void deleteByID(Long id );
    Optional<RoomDto> getById(Long id);
    void isRoomAviable(Long id);
    int whatIsItCapacity(int id); 
    RoomDto save(RoomDto roomDto);
}
