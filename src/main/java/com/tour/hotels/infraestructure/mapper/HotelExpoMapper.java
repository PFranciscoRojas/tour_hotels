package com.tour.hotels.infraestructure.mapper;

import com.tour.hotels.domain.dto.HotelDto;
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
    HotelDto toHotelDto(Hotel hotel);
    List<HotelDto> toHotelDto(List<Hotel> hotel);
    default Optional<HotelDto> toHotelDtoOptional(Optional<Hotel> hotel ){
        return  hotel.map(this::toHotelDto);
    }
    @InheritInverseConfiguration
    Hotel toHotel(HotelDto hotelDto);
}
