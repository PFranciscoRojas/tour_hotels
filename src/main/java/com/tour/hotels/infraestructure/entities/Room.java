package com.tour.hotels.infraestructure.entities;

import java.security.Timestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "rooms")

public class Room {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Long id;
private int capacity;
private Long date;
private Long time;
private Boolean status;
private String type;
private double price;
@Column (name = "Create_at")
private Timestamp createdAt;
@Column (name = "updated_at")
private Timestamp updatedAt;
@Column (name = "id_Hotel")
private Long idHotel;
@ManyToOne
private Hotel hotel;

@ManyToOne
@JoinColumn(name = "id_reservation")
private Reservation reservation;

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public int getCapacity() {
    return capacity;
}
public void setCapacity(int capacity) {
    this.capacity = capacity;
}
public Long getDate() {
    return date;
}
public void setDate(Long date) {
    this.date = date;
}
public Long getTime() {
    return time;
}
public void setTime(Long time) {
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
public Timestamp getCreatedAt() {
    return createdAt;
}
public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
}
public Timestamp getUpdatedAt() {
    return updatedAt;
}
public void setUpdatedAt(Timestamp updatedAt) {
    this.updatedAt = updatedAt;
}
public long getId_hotel() {
    return idHotel;
}
public void setId_hotel(Long idHotel) {
    this.idHotel = idHotel;
}

}
