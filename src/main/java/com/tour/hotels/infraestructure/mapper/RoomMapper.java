package com.tour.hotels.infraestructure.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.tour.hotels.domain.dto.RoomDto;
import com.tour.hotels.infraestructure.entities.Room;

@Mapper(componentModel = "spring", uses = {ReservationMapper.class})
public interface RoomMapper{
    @Mappings({
        @Mapping(source = "id",target = "idHabitacion"),
        @Mapping(source = "capacity",target = "capacidad"),
        @Mapping(source = "status",target = "estado"),
        @Mapping(source = "type",target = "tipoHabitacion"),
        @Mapping(source = "price",target = "costo"),
    })
    RoomDto aRoomDto(Room room);
    List<RoomDto> aRoomDto(List<Room> room);
    default Optional<RoomDto> aRoomDtoOptional(Optional <Room> room){
        return room.map(this::aRoomDto);
    }
    @InheritInverseConfiguration
    Room aRoom(RoomDto roomDto);
}





