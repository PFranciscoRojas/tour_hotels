package com.tour.hotels.domain.repository;

import java.util.List;
import java.util.Optional;

import com.tour.hotels.domain.dto.RoomDto;

public interface RoomRepository {

    List <RoomDto> getAll();
    void deleteByID(Long id );
    Optional<RoomDto> getById(Long id);
    boolean isRoomAviable(Long id);
    int whatIsItCapacity(Long id);
    RoomDto save(RoomDto roomDto);
}
