package com.tour.hotels.infraestructure.mapper;

import com.tour.hotels.domain.dto.HotelDtoExpo;
import com.tour.hotels.infraestructure.entities.Hotel;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = {RoomMapper.class})
public interface HotelExpoMapper {

    @Mappings({
            @Mapping(source = "idHotel", target ="hotelId"),
            @Mapping(source = "nameHotel", target ="nombre"),
            @Mapping(source = "location", target ="ubicacion"),
            @Mapping(source = "description", target ="descripcion"),
            //@Mapping(source = "rooms", target ="habitacionesDisponibles")
    })
    HotelDtoExpo toHotelDtoExpo(Hotel hotel);
    List<HotelDtoExpo> toHotelDtoExpo(List<Hotel> hotel);
    default Optional<HotelDtoExpo> toHotelDtoExpoOptional(Optional<Hotel> hotel ){
        return  hotel.map(this::toHotelDtoExpo);
    }
    @InheritInverseConfiguration
    Hotel toHotel(HotelDtoExpo hotelDtoExpo);
}
