package app.model;

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

}
