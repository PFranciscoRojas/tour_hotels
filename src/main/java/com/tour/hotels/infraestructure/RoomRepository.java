package com.tour.hotels.infraestructure;

import com.tour.hotels.domain.dto.RoomDto;
import com.tour.hotels.domain.repository.HabitacionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
class RoomRepository implements HabitacionRepository {
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
        return false;
    }

    @Override
    public int whatIsItCapacity(Long id) {
        return 0;
    }

    @Override
    public RoomDto save(RoomDto roomDto) {
        return null;
    }
    
}
