package com.tour.hotels.infraestructure.mapper;

import com.tour.hotels.domain.dto.ReservationDto;
import com.tour.hotels.infraestructure.entities.Reservation;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = {RoomMapper.class})
public interface ReservationMapper {
    @Mappings({
            @Mapping(source = "idReservation", target ="reservacionId"),
            @Mapping(source = "capacity", target ="capacidad"),
            @Mapping(source = "date", target ="fecha"),
            @Mapping(source = "time", target ="hora"),
            @Mapping(source = "payment", target ="pago"),
            @Mapping(source = "status", target ="estado"),
            @Mapping(source = "totalDays", target ="totalDias"),
            //@Mapping(source = "idRoom", target ="idHabitacion")

    })
    ReservationDto toReservationDto(Reservation reservation);
    List<ReservationDto> toReservationDto(List<Reservation> reservation);
    default Optional<ReservationDto> toReservationDtoOptional(Optional<Reservation> reservation ){
        return  reservation.map(this::toReservationDto);
    }
    @InheritInverseConfiguration
    Reservation toReservation(ReservationDto reservationDto);

}
