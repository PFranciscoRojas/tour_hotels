package com.tour.hotels.domain.dto;


import java.util.Date;

public class HotelDto {
  private Integer hotelId;
  private String nombre;
  private String ubicacion;
  private String descripcion;
  private boolean activa;
  private Date entrada;
  private Date salida;
  private Date fechaRegistro;
  private Date fechaSalida;

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

  public Date getEntrada() {
    return entrada;
  }

  public void setEntrada(Date entrada) {
    this.entrada = entrada;
  }

  public Date getSalida() {
    return salida;
  }

  public void setSalida(Date salida) {
    this.salida = salida;
  }

  public Date getFechaRegistro() {
    return fechaRegistro;
  }

  public void setFechaRegistro(Date fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }

  public Date getFechaSalida() {
    return fechaSalida;
  }

  public void setFechaSalida(Date fechaSalida) {
    this.fechaSalida = fechaSalida;
  }
}
