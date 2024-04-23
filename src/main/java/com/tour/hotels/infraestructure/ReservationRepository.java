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
        return null;
    }

    @Override
    public Optional<ReservationDto> getById(long idReservation) {
        return Optional.empty();
    }

    @Override
    public void deleteByID(long idReservation) {}

    @Override
    public ReservationDto save(ReservationDto reservationDto) {
        return null;
    }
}
