package com.tour.hotels.domain.dto;

import java.security.Timestamp;
<<<<<<< HEAD
=======
import java.text.DateFormat;
>>>>>>> 347bb2c5377fd802eb48fff636ee57c810b053b7

public class HotelDto {
  private Integer hotelId;
  private String nombre;
  private String ubicacion;
  private String descripcion;
<<<<<<< HEAD
  private boolean activa;

  private Timestamp entrada;
  private Timestamp salida;

  private Timestamp fechaRegistro;

  private Timestamp fechaSalida;
=======
  private String habitacionesDisponibles;
  private Timestamp Registro;
  private Timestamp Salida;
  private Timestamp FechaRegistro;
  private Timestamp FechaSalida;
>>>>>>> 347bb2c5377fd802eb48fff636ee57c810b053b7

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

<<<<<<< HEAD
  public Timestamp getEntrada() {
    return entrada;
  }

  public void setEntrada(Timestamp entrada) {
    this.entrada = entrada;
  }

  public Timestamp getSalida() {
    return salida;
  }

  public void setSalida(Timestamp salida) {
    this.salida = salida;
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
=======
  public Timestamp isRegistro() {
    return Registro;
  }

  public void setRegistro(Timestamp registro) {
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
>>>>>>> 347bb2c5377fd802eb48fff636ee57c810b053b7
  }
}
