package com.tour.hotels.infraestructure.entities;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "Rooms")
public class Room {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Integer capacity;
private Date date;
private Time time;
private Boolean status;
private String type;
private double price;
@Column (name = "Created_at")
private Date createdAt;
@Column (name = "updated_at")
private Date updatedAt;
@Column (name = "id_Hotel")
private Integer idHotel;

@OneToMany(mappedBy = "room",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
private List<Reservation> reservations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
