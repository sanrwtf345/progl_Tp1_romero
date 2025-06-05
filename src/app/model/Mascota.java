package app.model;

public abstract class Mascota {

  private String nombre;
  private int edad;
  private String raza;
  private String comportamiento;
  private final String ID;

  public Mascota(String nombre, int edad, String raza, String comportamiento, String ID){
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.comportamiento = comportamiento;
    this.ID = ID;
  }

  //setters

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setComportamiento(String comportamiento) {
    this.comportamiento = comportamiento;
  }

  //getters

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getRaza() {
    return raza;
  }

  public String getComportamiento() {
    return comportamiento;
  }

  public String getID() {
    return ID;
  }

 public void mostrarFicha(){}

  abstract String tipoMascota();
}
