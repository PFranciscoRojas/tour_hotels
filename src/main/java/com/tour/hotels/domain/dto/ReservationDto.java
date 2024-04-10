package com.tour.hotels.domain.dto;

import java.text.DateFormat;

public class ReservationDto {
    private Integer ReservacionId;
    private String nombre;
    private String descripcion;
    private String localizacion;
    private  boolean activo;
    private DateFormat ingreso;
    private DateFormat salida;

    public Integer getReservacionId() {
        return ReservacionId;
    }

    public void setReservacionId(Integer reservacionId) {
        ReservacionId = reservacionId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public DateFormat getIngreso() {
        return ingreso;
    }

    public void setIngreso(DateFormat ingreso) {
        this.ingreso = ingreso;
    }

    public DateFormat getSalida() {
        return salida;
    }

    public void setSalida(DateFormat salida) {
        this.salida = salida;
    }
}

