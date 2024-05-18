package com.tour.hotels.domain.dto;

import java.security.Timestamp;
import java.text.DateFormat;

public class HotelDto {
  private Integer hotelId;
  private String nombre;
  private String ubicacion;
  private String descripcion;
  private String habitacionesDisponibles;

  private boolean Registro;
  private Timestamp Salida;

  private Timestamp FechaRegistro;

  private Timestamp FechaSalida;

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

  public boolean isRegistro() {
    return Registro;
  }

  public void setRegistro(boolean registro) {
    Registro = registro;
  }

  public Timestamp isSalida() {
    return Salida;
  }

  public void setSalida(Timestamp salida) {
    Salida = salida;
  }

  public Timestamp getFechaRegistro() {
    return FechaRegistro;
  }

  public void setFechaRegistro(Timestamp fechaRegistro) {
    FechaRegistro = fechaRegistro;
  }

  public Timestamp getFechaSalida() {
    return FechaSalida;
  }

  public void setFechaSalida(Timestamp fechaSalida) {
    FechaSalida = fechaSalida;
  }
}
