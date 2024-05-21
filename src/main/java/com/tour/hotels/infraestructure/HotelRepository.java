package com.tour.hotels.infraestructure;

import com.tour.hotels.domain.dto.HotelDto;
import com.tour.hotels.domain.repository.HotelesRepository;
import com.tour.hotels.infraestructure.entities.Hotel;
import com.tour.hotels.infraestructure.mapper.HotelMapper;
import com.tour.hotels.infraestructure.repositories.HotelCroudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HotelRepository implements HotelesRepository {
    @Autowired
    public HotelCroudRepository hotelRepo;

    @Autowired
    public HotelMapper hotelMapper;
    @Override
    public List<HotelDto> getAll() {
        List<Hotel> resul = (List<Hotel>) hotelRepo.findAll();
        return hotelMapper.toHotelDto(resul);
    }

    @Override
    public Optional<HotelDto> getById(long idHotel) {
        Optional<Hotel> hotel = hotelRepo.findById((int)idHotel);
        return hotelMapper.toHotelDtoOptional(hotel);
    }

    @Override
    public void deleteByID(long idHotel) {}

    @Override
    public HotelDto save(HotelDto hotelDto) {
        Hotel hotel = hotelMapper.toHotel(hotelDto);
        return hotelMapper.toHotelDto(hotelRepo.save(hotel));
    }

}
