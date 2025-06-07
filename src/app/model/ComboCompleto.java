package app.model;

import java.util.logging.Logger;

public class ComboCompleto implements Servicio {
  private static final Logger log = Logger.getLogger(ComboCompleto.class.getName());

  private Servicio[] servicios;

  public ComboCompleto() {
    //inicializamos el array con los servicios que conforman el combo
    servicios = new Servicio[3];
    servicios[0] = new Banio();
    servicios[1] = new CortePelo();
    servicios[2] = new LimpiezaOidos();
  }

  @Override
  public void aplicarServicio(Mascota m) {
    log.info("Aplicando combo completo a " + m.getNombre());
    for (Servicio s : servicios) {
      s.aplicarServicio(m);
    }
  }

  @Override
  public double calcularPrecio(Mascota m) {
    double total = 0;
    for (Servicio s : servicios) {
      total += s.calcularPrecio(m);
    }
    log.info("Precio total del combo completo: $" + total);
    return total;
  }
}
