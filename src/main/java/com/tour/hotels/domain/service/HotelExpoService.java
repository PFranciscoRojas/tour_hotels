package com.tour.hotels.domain.service;

import com.tour.hotels.domain.dto.HotelDtoExpo;
import com.tour.hotels.domain.repository.HotelesExpoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelExpoService {
    @Autowired
    private HotelesExpoRepository hotelExpoRepo;

    public List<HotelDtoExpo> getAll(){

        return hotelExpoRepo.getAll();
    }
    public Optional<HotelDtoExpo> getByID(long hotelId){

        return hotelExpoRepo.getById(hotelId);
    }
    public HotelDtoExpo save (HotelDtoExpo hotelDtoExpo){
        return hotelExpoRepo.save(hotelDtoExpo);
    }
    public boolean delete(long hotelId){
        if(getByID(hotelId).isPresent()){
            hotelExpoRepo.deleteByID(hotelId);
            return true;
        }
        return false;
    }
}
