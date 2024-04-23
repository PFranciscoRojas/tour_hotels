package com.tour.hotels.domain.repository;

import com.tour.hotels.domain.dto.HotelDtoExpo;

import java.util.List;
import java.util.Optional;

public interface HotelesExpoRepository {

    List<HotelDtoExpo> getAll();
    Optional<HotelDtoExpo> getById(long idHotel);

    void deleteByID(long idHotel);
    HotelDtoExpo save(HotelDtoExpo hotelDtoExpo);
}
