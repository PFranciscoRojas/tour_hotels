package com.tour.hotels.domain.dto;

import java.security.Timestamp;

public class HotelDto {
  private Integer hotelId;
  private String nombre;
  private String ubicacion;
  private String descripcion;
  private boolean activa;
  private Timestamp entrada;
  private Timestamp salida;
  private Timestamp fechaRegistro;
  private Timestamp fechaSalida;
  private String habitacionesDisponibles;
  private Timestamp Registro;
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

  public boolean isActiva() {
    return activa;
  }

  public void setActiva(boolean activa) {
    this.activa = activa;
  }

  public Timestamp getSalida() {
    return salida;
  }

  public void setSalida(Timestamp salida) {
    this.salida = salida;
  }

  public Timestamp getEntrada() {
    return entrada;
  }

  public void setEntrada(Timestamp entrada) {
    this.entrada = entrada;
  }

  public Timestamp getFechaRegistro() {
    return fechaRegistro;
  }

  public void setFechaRegistro(Timestamp fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }

  public Timestamp getFechaSalida() {
    return fechaSalida;
  }

  public void setFechaSalida(Timestamp fechaSalida) {
    this.fechaSalida = fechaSalida;
  }

  public String getHabitacionesDisponibles() {
    return habitacionesDisponibles;
  }

  public void setHabitacionesDisponibles(String habitacionesDisponibles) {
    this.habitacionesDisponibles = habitacionesDisponibles;
  }

  public Timestamp getRegistro() {
    return Registro;
  }

  public void setRegistro(Timestamp registro) {
    Registro = registro;
  }
}
