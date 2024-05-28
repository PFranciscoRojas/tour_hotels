package com.tour.hotels.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.hotels.domain.dto.RoomDto;
import com.tour.hotels.domain.repository.HabitacionRepository;


@Service
public class RoomService {
    @Autowired
    private HabitacionRepository habitacionRepository;

    public List<RoomDto> getAll(){
        return habitacionRepository.getAll();
    }
    public Optional<RoomDto> getById(Long id){
        return habitacionRepository.getById(id);
    }
    public RoomDto save (RoomDto roomDto){
        return habitacionRepository.save(roomDto);
    }
    public boolean delete(Long id){
        if(getById(id).isPresent()){
            habitacionRepository.deleteByID(id);
            return true;
        }
        return false;
    }
    public boolean isRoomAviable(Long id){
        if(getById(id).isPresent()){
            habitacionRepository.isRoomAviable(id);
            return true;
        }
        return false;
    }

    public int whatIsItCapacity(int id){
        final int areaTotal = 70;
        final int areaPorPersona = 6;
        final int capacidadHab = whatIsItCapacity(areaTotal);

        int capacid = areaTotal / areaPorPersona;
        return capacid;
    }
}
