package com.tour.hotels.infraestructure;

import com.tour.hotels.domain.dto.HotelDtoExpo;
import com.tour.hotels.domain.repository.HotelesExpoRepository;
import com.tour.hotels.infraestructure.entities.Hotel;
import com.tour.hotels.infraestructure.mapper.HotelExpoMapper;
import com.tour.hotels.infraestructure.repositories.HotelExpoCroudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HotelExpoRepository implements HotelesExpoRepository {

    @Autowired
    public HotelExpoCroudRepository hotelExpoRepo;

    @Autowired
    public HotelExpoMapper hotelExpomapper;

    @Override
    public List<HotelDtoExpo> getAll() {
        List<Hotel> resul = (List<Hotel>) hotelExpoRepo.findAll();
       return hotelExpomapper.toHotelDtoExpo(resul);

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
