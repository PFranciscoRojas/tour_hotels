package com.tour.hotels.domain.dto;

import java.sql.Time;
import java.util.Date;

public class ReservationDto {
    private Integer reservacionId;
    private Integer capacidad;
    private Date fecha;
    private Time hora;
    private boolean estado;
    private  Integer totalDias;
    private boolean pago;
    //private Integer idHabitacion;

    public Integer getReservacionId() {
        return reservacionId;
    }

    public void setReservacionId(Integer reservacionId) {
        this.reservacionId = reservacionId;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Integer getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(Integer totalDias) {
        this.totalDias = totalDias;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    //public Integer getIdHabitacion() {
    //    return idHabitacion;
    //}

    //public void setIdHabitacion(Integer idHabitacion) {
    //    this.idHabitacion = idHabitacion;
    //}
}

