package app.model;

import java.util.Objects;
import java.util.logging.Logger;

public class Duenio {

  private String nombre;
  private String telefono;
  Mascota[] mascotas = new Mascota[4];
  private int cantidad = 0;

  public Duenio(String nombre, String telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }
  private static final Logger log = Logger.getLogger(Duenio.class.getName());

  //setters

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public void setMascotas(Mascota[] mascotas) {
    this.mascotas = mascotas;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  //getters

  public String getNombre() {
    return nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public Mascota[] getMascotas() {
    return mascotas;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void agregarMascota(Mascota m) {
    if (cantidad < mascotas.length) {
      mascotas[cantidad++] = m;
      log.info("Mascota agregada: " + m.getNombre());
    } else {
      log.warning("No se pueden registrar más mascotas.");
    }
  }

  public void mostrarMascotas() {
    for (int i = 0; i < cantidad; i++) {
      mascotas[i].mostrarFicha();
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, telefono);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)  return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Duenio other = (Duenio) obj;
    return nombre.equals(other.nombre) && telefono.equals(other.telefono);
  }

}
