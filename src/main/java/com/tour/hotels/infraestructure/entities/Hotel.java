package com.tour.hotels.infraestructure.entities;

import jakarta.persistence.*;
import java.text.DateFormat;
import java.util.List;

@Entity
@Table(name = "Hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idHotel;

    @Column(name = "name")
    private String nameHotel;

    private String description;

    private String location;

    private boolean active;

    private boolean checkin;

    private boolean checkout;

    @Column(name = "create_at")
    private DateFormat createAt;

    @Column(name = "updated_at")
    private DateFormat updatedAt;

    @OneToMany(mappedBy = "Hotel", cascade = CascadeType.ALL)

    private List<Room> rooms;

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isCheckin() {
        return checkin;
    }

    public void setCheckin(boolean checkin) {
        this.checkin = checkin;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public DateFormat getCreateAt() {
        return createAt;
    }

    public void setCreateAt(DateFormat createAt) {
        this.createAt = createAt;
    }

    public DateFormat getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateFormat updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
