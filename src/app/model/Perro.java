package app.model;

public class Perro extends Mascota{


  public Perro(String nombre, int edad, String raza, Comportamiento comportamiento, String ID) {
    super(nombre, edad, raza, comportamiento, ID);
  }



  @Override
  public String tipoMascota() {
    return "Perro";
  }

  @Override
  public void mostrarFicha() {
    super.mostrarFicha();
    log.info("Tipo: Perro");
  }
}
