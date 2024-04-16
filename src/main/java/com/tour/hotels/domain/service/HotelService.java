package com.tour.hotels.domain.service;

import com.tour.hotels.domain.dto.HotelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HotelService {
    private HotelService hotelRepo;
    @Autowired
    public List<HotelDto> getAll(){

        return hotelRepo.getAll();
    }
    public Optional<HotelDto> getByID(long hotelId){

        return hotelRepo.getByID(hotelId);
    }
    public HotelDto save (HotelDto hotelDto){
        return hotelRepo.save(hotelDto);
    }
    public boolean delete(long hotelId){
        if(getByID(hotelId).isPresent()){
            hotelRepo.delete(hotelId);
            return true;
        }
        return false;
    }
}
