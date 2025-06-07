package app.model;

import java.util.logging.Logger;

public class CortePelo implements Servicio {

  private static final Logger log = Logger.getLogger(Banio.class.getName());

  @Override
  public void aplicarServicio(Mascota m) {
    log.info("Aplicando corte de pelo a " + m.getNombre());
  }

  @Override
  public double calcularPrecio(Mascota m) {
    double precio = m instanceof Perro ? 1800 : 1400;
    log.info("Precio calculado para " + m.getNombre() + ": $" + precio);
    return precio;
  }
}
