package app.model;

public class Gato extends Mascota{

  public Gato(String nombre, int edad, String raza, Comportamiento comportamiento, String ID) {
    super(nombre, edad, raza, comportamiento, ID);
  }


  @Override
  String tipoMascota() {
    return "";
  }

  @Override
  public void mostrarFicha() {
    super.mostrarFicha();
    log.info("Tipo: gato");
  }
}
