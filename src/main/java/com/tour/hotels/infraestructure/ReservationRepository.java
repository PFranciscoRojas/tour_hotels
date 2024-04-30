package com.tour.hotels.infraestructure;

import com.tour.hotels.domain.dto.ReservationDto;
import com.tour.hotels.domain.repository.ReservaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository implements ReservaRepository {
    @Override
    public List<ReservationDto> getAll() {
        List<Reservation> resul = (List<Reservation>) reservationRepo.findAll();
        return reservationmapper.toReservationDto(resul);
    }

    @Override
    public Optional<ReservationDto> getById(long idReservation) {
        Optional<Reservation> resul = reservationRepo.findById(idReservation);
        return reservationMapper.toReservationDto(resul);
    }

    @Override
    public void deleteByID(long idReservation) {}

    @Override
    public ReservationDto save(ReservationDto reservationDto) {
        return null;
    public EventDto save(EventDto eventDto) {
        Reservation reservation = reservationMapper.toReservation(ReservationDto);
        return reservationMapper.toReservationDto(reservationRepo.save(reservation));
    }
}
