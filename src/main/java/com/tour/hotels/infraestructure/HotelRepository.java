package com.tour.hotels.infraestructure;

import com.tour.hotels.domain.dto.*;
import com.tour.hotels.domain.repository.HotelRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public class HotelRepository implements HotelRepository {

    List<HotelDto> getAll();
    Optional<HotelDto> getById(long idHotel);

    void deleteByID(long idHotel);
    HotelDto save(HotelDto hotelDto);

}
