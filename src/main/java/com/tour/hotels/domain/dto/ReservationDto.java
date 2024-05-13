package com.tour.hotels.domain.dto;

import java.sql.Time;
import java.util.Date;

public class ReservationDto {
    private Integer reservacionId;
    private String capacidad;
    private Date fecha;
    private Time hora;
    private Boolean estado;
    private  Integer totalDias;
    private boolean pago;

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getReservacionId() {
        return reservacionId;
    }

    public void setReservacionId(Integer reservacionId) {
        reservacionId = reservacionId;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
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
}

