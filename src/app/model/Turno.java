package app.model;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Turno {

  private static final Logger log = Logger.getLogger(Turno.class.getName());

  private Mascota mascota;
  private Duenio duenio;
  private Servicio servicio;
  private LocalDate fecha;

  public Turno(Mascota mascota, Duenio duenio, Servicio servicio, LocalDate fecha) {
    this.mascota = mascota;
    this.duenio = duenio;
    this.servicio = servicio;
    this.fecha = fecha;
  }

  //setters

  public void setMascota(Mascota mascota) {
    this.mascota = mascota;
  }

  public void setDuenio(Duenio duenio) {
    this.duenio = duenio;
  }

  public void setServicio(Servicio servicio) {
    this.servicio = servicio;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  //getters

  public Mascota getMascota() {
    return mascota;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public Servicio getServicio() {
    return servicio;
  }

  public Duenio getDuenio() {
    return duenio;
  }

  public void confirmarTurno() {
    log.info("Turno confirmado para " + mascota.getNombre() + " el día " + fecha);
  }

  public void mostrarDetalle() {
    mascota.mostrarFicha();
    log.info("Servicio: " + servicio.getClass().getSimpleName());
    log.info("Costo: $" + servicio.calcularPrecio(mascota));
  }

}
