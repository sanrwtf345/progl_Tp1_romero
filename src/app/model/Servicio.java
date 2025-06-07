package app.model;

import java.util.logging.Logger;

public interface Servicio {

  void aplicarServicio(Mascota m);

  double calcularPrecio(Mascota m);

}
