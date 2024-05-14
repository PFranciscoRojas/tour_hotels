package com.tour.hotels.domain.service;

import com.tour.hotels.domain.dto.ReservationDto;
import com.tour.hotels.domain.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    private ReservaRepository reservationRepo;

    public List<ReservationDto> getAll(){

        return reservationRepo.getAll();
    }
    public Optional<ReservationDto> getByID(long reservacionId){

        return reservationRepo.getById(reservacionId);
    }

    public ReservationDto save(ReservationDto reservationDto){

        return reservationRepo.save(reservationDto);
    }
    public boolean delete(long reservacionId){
        if(getByID(reservacionId).isPresent()){
            reservationRepo.deleteByID(reservacionId);
            return true;
        }
        return false;
    }
}
