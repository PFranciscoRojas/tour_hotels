package com.tour.hotels.infraestructure.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.tour.hotels.domain.dto.RoomDto;
import com.tour.hotels.infraestructure.entities.Room;

@Mapper(componentModel = "Spring", uses = {ReservationMapper.class})
public interface RoomMapper {
    @Mappings({
        
        @Mapping(source = "id", target = "ide"),
        @Mapping(source = "status", target = "roomState"),
        @Mapping(source = "price" , target = "cost"),
        @Mapping(source = "capacity", target = "capacy"),
        @Mapping(source = "time" , target = "duration"),
        @Mapping(source = "date" , target = "appointment"),
        @Mapping(source = "type", target = "kind")

    })
    
    RoomDto toRoomdDto(Room room);

    
    List<RoomDto> toRoomDtos(List<Room> rooms);
    
    default Optional<RoomDto> toRoomDtosOptional(Optional<Room> room){
        return room.map(this::toRoomdDto);
}


@InheritInverseConfiguration

Room toRoom(RoomDto roomDto);


Optional<Integer> toRoom(Optional<Room> room);

}
