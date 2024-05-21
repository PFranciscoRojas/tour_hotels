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
public interface HotelMapper {

    @Mappings({
            @Mapping(source = "idHotel", target ="hotelId"),
            @Mapping(source = "nameHotel", target ="nombre"),
            @Mapping(source = "location", target ="ubicacion"),
            @Mapping(source = "description", target ="descripcion"),
            @Mapping(source = "active", target ="activa"),
            @Mapping(source = "checkin", target ="entrada"),
            @Mapping(source = "checkout", target ="salida"),
            @Mapping(source = "createAt", target ="fechaRegistro"),
            @Mapping(source = "updatedAt", target ="fechaSalida"),

    })
    HotelDto toHotelDto(Hotel hotel);
    List<HotelDto> toHotelDto(List<Hotel> hotel);
    default Optional<HotelDto> toHotelDtoOptional(Optional<Hotel> hotel ){
        return  hotel.map(this::toHotelDto);
    }
    @InheritInverseConfiguration
    Hotel toHotel(HotelDto hotelDto);
}
