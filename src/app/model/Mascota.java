package app.model;

import java.util.logging.Logger;

public abstract class Mascota {
 protected final Logger log = Logger.getLogger(Mascota.class.getName());

  private String nombre;
  private int edad;
  private String raza;
  private Comportamiento comportamiento;
  private final String ID;

  public Mascota(String nombre, int edad, String raza, Comportamiento comportamiento, String ID){
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.comportamiento = comportamiento;
    this.ID = ID;
  }

//Setters


  public void setComportamiento(Comportamiento comportamiento) {
    this.comportamiento = comportamiento;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  //Getters


  public int getEdad() {
    return edad;
  }

  public String getNombre() {
    return nombre;
  }

  public String getRaza() {
    return raza;
  }

  public Comportamiento getComportamiento() {
    return comportamiento;
  }

  public String getID() {
    return ID;
  }

  public void mostrarFicha(){
    log.info("Nombre: " + nombre);
    log.info("Edad: " + edad);
    log.info("Raza: " + raza);
    log.info("Comportamiento: " + comportamiento);
    log.info("ID: " + ID);
  }

  abstract String tipoMascota();
}
