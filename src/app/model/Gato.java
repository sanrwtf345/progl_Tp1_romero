package app.model;

public class Gato extends Mascota{

  public Gato(String nombre, int edad, String raza, String comportamiento, String ID) {
    super(nombre, edad, raza, comportamiento, ID);
  }


  @Override
  String tipoMascota() {
    return "";
  }
}
