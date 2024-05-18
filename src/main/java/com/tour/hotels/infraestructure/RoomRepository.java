package com.tour.hotels.infraestructure;

import com.tour.hotels.domain.dto.RoomDto;
import com.tour.hotels.domain.repository.HabitacionRepository;
import com.tour.hotels.infraestructure.entities.Room;
import com.tour.hotels.infraestructure.mapper.RoomMapper;
import com.tour.hotels.infraestructure.repositories.RoomCroudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
class RoomRepository implements HabitacionRepository {

    @Autowired
    public RoomCroudRepository roomRepoo;

    @Autowired 
    public RoomMapper roomMapper;

    @Override
    public List<RoomDto> getAll(){
        List<Room> res = (List<Room>) roomRepoo.findAll();
        return roomMapper. aRoomDto(res); 
    }

    @Override
    public void deleteByID(Long id) {
    }

    @Override
    public Optional<RoomDto> getById(Long id) {
        Optional<Room> roomm = roomRepoo.findById(id); // Solucionar error
        return roomMapper.aRoomDtoOptional(roomm);
    }

    @Override
    public void isRoomAviable(Long id) {}

    @Override
    public int whatIsItCapacity(int id){
    
    final int areaTotal = 70;
    final int areaPorPersona = 6;
    // final int capacidadHab = whatIsItCapacity(areaTotal);
    int capacid = areaTotal / areaPorPersona;
    return capacid;
    }

    @Override
    public RoomDto save(RoomDto roomDto) {
        Room room = roomMapper.aRoom(roomDto);
        return roomMapper.aRoomDto(roomRepoo.save(room));
    }    
}
