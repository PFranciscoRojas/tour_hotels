package com.tour.hotels.infraestructure;

import com.tour.hotels.domain.dto.ReservationDto;
import com.tour.hotels.domain.repository.ReservaRepository;
import com.tour.hotels.infraestructure.entities.Reservation;


import com.tour.hotels.infraestructure.mapper.ReservationMapper;
import com.tour.hotels.infraestructure.repositories.ReservationCroudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository implements ReservaRepository {
    @Autowired
    public ReservationCroudRepository reservationRepo;

    @Autowired
    public ReservationMapper reservationmapper;
    @Override
    public List<ReservationDto> getAll() {
        List<Reservation> resul = (List<Reservation>) reservationRepo.findAll();
        return reservationmapper.toReservationDto(resul);
    }

        //here
    @Override
    public Optional<ReservationDto> getById(long idReservation) {
        Optional<Reservation> reserva = reservationRepo.findById((int) idReservation);
        return reservationmapper.toReservationDtoOptional(reserva);
    }

    @Override
    public void deleteByID(long idReservation) {}

    @Override
    public ReservationDto save(ReservationDto reservationDto) {
        Reservation reservation = reservationmapper.toReservation(reservationDto);
        return reservationmapper.toReservationDto(reservationRepo.save(reservation));
    }
}
