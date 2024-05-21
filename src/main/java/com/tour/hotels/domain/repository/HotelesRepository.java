package com.tour.hotels.domain.repository;

import com.tour.hotels.domain.dto.HotelDto;
import java.util.List;
import java.util.Optional;

public interface HotelesRepository {
    List<HotelDto> getAll();
    Optional<HotelDto> getById(long idHotel);

    void deleteByID(long idHotel);
    HotelDto save(HotelDto hotelDto);
}
