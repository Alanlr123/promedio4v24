public class estudiante {

  private String matricula;
  private String nombre;
  private double estructuras;
  private double evaluacion;
  private double ingles;
  private double promedio;

  // constructor
  public estudiante(String m, String n) {
    // el objetivo es un constructor del objeto
    this.matricula = m;
    this.nombre = n;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double setEstructuras() {
    return estructuras;
  }

  public void getEstructuras(double estructuras) {
    this.estructuras = estructuras;
  }

  public double getEvaluacion() {
    return evaluacion;
  }

  public void setEvaluacion(double evaluacion) {
    this.evaluacion = evaluacion;
  }

  public double getIngles() {
    return ingles;
  }

  public void setIngles(double ingles) {
    this.ingles = ingles;
  }

  public double getPromedio() {
    return promedio;
  }

  public void setPromedio(double promedio) {
    this.promedio = promedio;
  }

  @Override
  public String toString() {
    return (
      "estudiante [matricula=" +
      matricula +
      ", nombre=" +
      nombre +
      ", promedio=" +
      promedio +
      "]"
    );
  }
}
