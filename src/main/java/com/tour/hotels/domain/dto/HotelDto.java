package com.tour.hotels.domain.dto;

import java.security.Timestamp;

public class HotelDto {
  private Integer hotelId;
  private String nombre;
  private String ubicacion;
  private String descripcion;
  private boolean activa;
  //private Timestamp entrada;
  //private Timestamp salida;
  //private Timestamp fechaRegistro;
  //private Timestamp fechaSalida;

  public Integer getHotelId() {
    return hotelId;
  }

  public void setHotelId(Integer hotelId) {
    this.hotelId = hotelId;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public boolean isActiva() {
    return activa;
  }

  public void setActiva(boolean activa) {
    this.activa = activa;
  }

}
