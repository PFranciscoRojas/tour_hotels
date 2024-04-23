public package com.tour.hotels.infraestructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tour.hotels.domain.dto.RoomDto;
import com.tour.hotels.domain.repository.RoomRepository;

@Repository
class RoomRepositorio implements RoomRepository {
@Override
public List<RoomDto> getAll(){
    return null;
}

@Override
public void deleteByID(Long id) {
    
}

@Override
public Optional<RoomDto> getById(Long id) {
    return Optional.empty();
}

@Override
public boolean isRoomAviable(Long id) {
    
}

@Override
public int whatIsItCapacity(Long id) {
    
}

@Override

public RoomDto save(RoomDto roomDto) {
    
    return null;

}
    
}
