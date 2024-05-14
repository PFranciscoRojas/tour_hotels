package com.tour.hotels.application;

import com.tour.hotels.domain.dto.HotelDtoExpo;
import com.tour.hotels.domain.service.HotelExpoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotelsExpo")
public class HotelExpoController {
    @Autowired
    private HotelExpoService hotelExpoSrv;

    @GetMapping()
    public List<HotelDtoExpo> getAll(){
        return hotelExpoSrv.getAll();
    }
    @GetMapping("{id}")
    public Optional<HotelDtoExpo> getByID(@PathVariable("id") long hotelId){
        return hotelExpoSrv.getByID(hotelId);
    }

    @PostMapping()
    public HotelDtoExpo save (@RequestBody HotelDtoExpo hotelDtoExpo){
        return hotelExpoSrv.save(hotelDtoExpo);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") int hotelId){
        if(getByID(hotelId).isPresent()){
            hotelExpoSrv.delete(hotelId);
            return true;
        }
        return false;
    }
}
