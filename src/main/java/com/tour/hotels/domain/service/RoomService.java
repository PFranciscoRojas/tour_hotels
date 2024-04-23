package com.tour.hotels.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.hotels.domain.dto.RoomDto;
import com.tour.hotels.domain.repository.RoomRepository;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<RoomDto> getAll(){
        return roomRepository.getAll();
    }
    public Optional<RoomDto> getById(Long id){
        return roomRepository.getById(id);
    }
    public RoomDto save (RoomDto roomDto){
        return roomRepository.save(roomDto);
    }
    public boolean delete(Long id){
        if(getById(id).isPresent()){
            roomRepository.deleteByID(id);
            return true;
        }
        return false;
    }
}
