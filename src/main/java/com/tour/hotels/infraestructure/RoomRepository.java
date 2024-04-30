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
    public RoomCroudRepository habRepo;
    
    @Autowired 
    
    RoomMapper mapper;
    
    @Override
    public List<RoomDto> getAll(){
     List<Room>rooms = (List<Room>)habRepo.findAll();
     return mapper.toRoomDtos(rooms);
    }

    @Override
    public void deleteByID(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public Optional<RoomDto> getById(Long id) {
        Optional<Room> room = habRepo.finById(id);
        return mapper.toRoomDtosOptional(room);
    }

    @Override
    public boolean isRoomAviable(Long id) {
        if(RoomDto.finById(id)== true){
            System.out.println("Room aviable.");
            return true;
        }else if(RoomDto.finById(id) == false){
            System.out.println("Room is not aviable.");
            return false;
        }
        return false;
    }

    @Override
    public Optional<Integer> whatIsItCapacity(Long id) {
        Optional<Room> room = habRepo.finById(id);
        return mapper.toRoom(room);
        
    }

    @Override
    public RoomDto save(RoomDto roomDto) {
        Room room = mapper.toRoom(habRepo.save(roomDto));
        return roomDto;
    }
    
}
