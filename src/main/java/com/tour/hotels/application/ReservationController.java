package com.tour.hotels.application;

import com.tour.hotels.domain.dto.ReservationDto;
import com.tour.hotels.domain.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationSrv;

    @GetMapping()
    public List<ReservationDto> getAll(){
        return reservationSrv.getAll();
    }
    @GetMapping("{id}")
    public Optional<ReservationDto> getByID(@PathVariable("id") long reservacionId){
        return reservationSrv.getByID(reservacionId);
    }

    @PostMapping()
    public ReservationDto save (@RequestBody ReservationDto reservationDto){
        return reservationSrv.save(reservationDto);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") int reservacionId){
        if(getByID(reservacionId).isPresent()){
            reservationSrv.delete(reservacionId);
            return true;
        }
        return false;
    }
}



