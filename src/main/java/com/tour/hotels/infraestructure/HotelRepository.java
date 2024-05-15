package com.tour.hotels.infraestructure;

import com.tour.hotels.domain.dto.HotelDto;
import com.tour.hotels.domain.repository.HotelesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HotelRepository implements HotelesRepository {
    @Override
    public List<HotelDto> getAll() {
        return null;
    }
    @Override
    public Optional<HotelDto> getById(long idHotel) {
        return Optional.empty();
    }
    @Override
    public void deleteByID(long idHotel) {}
    @Override
    public HotelDto save(HotelDto hotelDto) {
        return null;
    }

}
