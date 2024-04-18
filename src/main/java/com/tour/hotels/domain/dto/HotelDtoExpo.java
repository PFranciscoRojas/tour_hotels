package com.tour.hotels.domain.dto;

public class HotelDtoExpo {
  private Integer hotelId;
  private String nombre;
  private String ubicacion;
  private String descripcion;
  private String habitacionesDisponibles;

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

  public String getHabitacionesDisponibles() {
    return habitacionesDisponibles;
  }

  public void setHabitacionesDisponibles(String habitacionesDisponibles) {
    this.habitacionesDisponibles = habitacionesDisponibles;
  }
}
