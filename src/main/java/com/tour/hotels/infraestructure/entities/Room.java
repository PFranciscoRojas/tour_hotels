package com.tour.hotels.infraestructure.entities;

import java.security.Timestamp;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "rooms")

public class Room {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Long id;
private Integer capacity;
private Date date;
private Time time;
private Boolean status;
private String type;
private double price;
@Column (name = "Create_at")
private DateFormat createdAt;
@Column (name = "updated_at")
private DateFormat updatedAt;
@Column (name = "id_Hotel")
private Integer idHotel;
@ManyToOne
private Hotel hotel;

@ManyToOne
@JoinColumn(name = "id_reservation")
private Reservation reservation;



public Integer getCapacity() {
    return capacity;
}

public void setCapacity(Integer capacity) {
    this.capacity = capacity;
}

public Date getDate() {
    return date;
}

public void setDate(Date date) {
    this.date = date;
}

public Time getTime() {
    return time;
}

public void setTime(Time time) {
    this.time = time;
}

public Boolean getStatus() {
    return status;
}

public void setStatus(Boolean status) {
    this.status = status;
}

public String getType() {
    return type;
}

public void setType(String type) {
    this.type = type;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public DateFormat getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(DateFormat createdAt) {
    this.createdAt = createdAt;
}

public DateFormat getUpdatedAt() {
    return updatedAt;
}

public void setUpdatedAt(DateFormat updatedAt) {
    this.updatedAt = updatedAt;
}

public Integer getIdHotel() {
    return idHotel;
}

public void setIdHotel(Integer idHotel) {
    this.idHotel = idHotel;
}

public Hotel getHotel() {
    return hotel;
}

public void setHotel(Hotel hotel) {
    this.hotel = hotel;
}

public Reservation getReservation() {
    return reservation;
}

public void setReservation(Reservation reservation) {
    this.reservation = reservation;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}





}
