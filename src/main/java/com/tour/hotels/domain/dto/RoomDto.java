package com.tour.hotels.domain.dto;

import jakarta.persistence.Column;

import java.security.Timestamp;

public class RoomDto {

    private Long habitacionId;
    private int capacidad;
    private Long fecha;
    private Long tiempo;
    private Boolean estado;
    private String tipo;
    private double precio;

    public Long getHabitacionId() { return habitacionId; }

    public void setHabitacionId(Long habitacionId) { this.habitacionId = habitacionId; }

    public int getCapacidad() { return capacidad; }

    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public Long getFecha() { return fecha; }

    public void setFecha(Long fecha) { this.fecha = fecha; }

    public Long getTiempo() { return tiempo; }

    public void setTiempo(Long tiempo) { this.tiempo = tiempo; }

    public Boolean getEstado() { return estado; }

    public void setEstado(Boolean estado) { this.estado = estado; }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getPrecio() { return precio;}

    public void setPrecio(double precio) { this.precio = precio;}
}
