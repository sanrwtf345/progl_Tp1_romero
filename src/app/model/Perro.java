package app.model;

public class Perro extends Mascota{


  public Perro(String nombre, int edad, String raza, String comportamiento, String ID) {
    super(nombre, edad, raza, comportamiento, ID);
  }



  @Override
  public String tipoMascota() {
    return "";
  }
}
