package sin.interfaz;

public class Empleado {

    //1.atributos
    String nombre;
    int sueldo;
    boolean activo;

    //2.constructores
    public Empleado() {}

    public Empleado(String nombre, int sueldo, boolean activo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.activo = activo;
    }

    //3.metodos
    //para poder ver en consola al imprimir y no ver los objetos => generar metodo toString


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", activo=" + activo +
                '}';
    }
}
