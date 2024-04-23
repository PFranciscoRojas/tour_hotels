package com.tour.hotels.infraestructure;

import com.tour.hotels.domain.dto.HotelDtoExpo;
import com.tour.hotels.domain.repository.HotelExpoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HotelExpoRepository implements HotelExpoRepository {
    @Override
    public List<HotelDtoExpo> getAll() {
        return null;
    }

    @Override
    public Optional<HotelDtoExpo> getById(long idHotel) {
        return Optional.empty();
    }

    @Override
    public void deleteByID(long idHotel) {}

    @Override
    public HotelDtoExpo save(HotelDtoExpo hotelDtoExpo) {
        return null;
    }
}
