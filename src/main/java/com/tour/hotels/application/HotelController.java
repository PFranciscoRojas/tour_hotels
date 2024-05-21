package com.tour.hotels.application;

import com.tour.hotels.domain.dto.HotelDto;
import com.tour.hotels.domain.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelSrv;

    @GetMapping()
    public List<HotelDto> getAll(){
        return hotelSrv.getAll();
    }

    @GetMapping("{id}")
    public Optional<HotelDto> getByID(@PathVariable("id") long hotelId){
        return hotelSrv.getByID(hotelId);
    }

    @PostMapping()
    public HotelDto save (@RequestBody HotelDto hotelDto){
        return hotelSrv.save(hotelDto);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") int hotelId){
        if(getByID(hotelId).isPresent()){
            hotelSrv.delete(hotelId);
            return true;
        }
        return false;
    }


}
