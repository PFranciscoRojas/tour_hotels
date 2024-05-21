package com.tour.hotels.domain.repository;

import com.tour.hotels.domain.dto.ReservationDto;
import java.util.List;
import java.util.Optional;

public interface ReservaRepository {
    List<ReservationDto> getAll();
    Optional<ReservationDto> getById(long idReservation);

    void deleteByID(long idReservation);
    ReservationDto save(ReservationDto reservationDto);
}
