package app;

import app.model.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
  private static final Logger log = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {

    // Crear dueños
    Duenio ana = new Duenio("Ana", "3411234567");
    Duenio pedro = new Duenio("Pedro", "3419876543");

    // Crear mascotas
    Mascota firulais = new Perro("Firulais", 3, "Labrador", Comportamiento.DOCIL, "1");
    Mascota michi = new Gato("Michi", 2, "Siames", Comportamiento.MIMOSO, "2");

    // Agregar mascotas a dueños
    ana.agregarMascota(firulais);
    pedro.agregarMascota(michi);

    // Crear servicios
    Servicio banio = new Banio();
    Servicio combo = new ComboCompleto();

    // Crear turno
    Turno turno1 = new Turno(firulais, ana, banio, LocalDate.now());
    Turno turno2 = new Turno(michi, pedro, combo, LocalDate.now());
    Turno turno3 = new Turno(firulais, ana, new ComboCompleto()); // La fecha se autogenera
    turno3.confirmarTurno();
    Scanner sc = new Scanner(System.in);

    int opcion;
    do {
      log.info("\n--- MENÚ MASCOTAPP ---");
      log.info("1. Mostrar fichas de mascotas");
      log.info("2. Mostrar tipo de mascota");
      log.info("3. Aplicar servicio");
      log.info("4. Calcular precio del servicio");
      log.info("5. Mostrar detalle del turno");
      log.info("0. Salir");
      log.info("Seleccione una opción: ");
      opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          firulais.mostrarFicha();
          michi.mostrarFicha();
          break;
        case 2:
          log.info(firulais.getNombre() + " tipo de mascota: " + firulais.tipoMascota());
          log.info(michi.getNombre() + " tipo de mascota: " + michi.tipoMascota());
          break;
        case 3:
          banio.aplicarServicio(firulais);
          combo.aplicarServicio(michi);
          combo.aplicarServicio(firulais);
          break;
        case 4:
          banio.calcularPrecio(firulais);
          combo.calcularPrecio(michi);
          combo.calcularPrecio(firulais);
          break;
        case 5:
          turno1.mostrarDetalle();
          turno2.mostrarDetalle();
          turno3.mostrarDetalle();
          break;
        case 0:
          log.info("Saliendo del sistema...");
          break;
        default:
          log.warning("Opción inválida.");
      }

    } while (opcion != 0);

    sc.close();
  }
}