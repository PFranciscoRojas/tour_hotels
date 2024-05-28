package com.tour.hotels.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tour.hotels.domain.dto.RoomDto;
import com.tour.hotels.domain.service.RoomService;

@RestController
@RequestMapping("/rooms")

public class RoomController {
    @Autowired 
    private RoomService roomService;

    @GetMapping()
    public List<RoomDto> getAll(){
        return roomService.getAll();
    }
    @GetMapping("{id}")
    public Optional<RoomDto> getById(@PathVariable("id") Long id){
        return roomService.getById(id);
    }
    @PostMapping()
    public RoomDto save(@RequestBody RoomDto roomDto){
        return roomService.save(roomDto);
    }
    
}
