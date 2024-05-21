package com.tour.hotels.infraestructure.entities;
import jakarta.persistence.*;

import java.security.Timestamp;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idReservation;
    private Integer capacity;
    private Date date;
    private Time time;
    private boolean status;
    @Column(name = "total_days")
    private Integer totalDays;
    private boolean payment;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "id_customer")
    private Integer idCustomer;
    @Column(name = "id_room")
    private Integer idRoom;
    @ManyToOne

    private Room room;


    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    private List<Room> rooms;

  public Integer getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
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

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Integer getTotalDays() {
        return totalDays;
    }
    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }
    public boolean isPayment() {
        return payment;
    }
    public void setPayment(boolean payment) {
        this.payment = payment;
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
    public Integer getIdCustomer() {
        return idCustomer;
    }
    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }
    public Integer getIdRoom() {
        return idRoom;
    }
    public void setIdRoom(Integer idRoom) {
        this.idRoom = idRoom;
    }
   
}
