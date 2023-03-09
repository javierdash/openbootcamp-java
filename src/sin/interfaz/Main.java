package sin.interfaz;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

    Empleado juanito = new Empleado("Juanito", 20000, true);
    Empleado carlitos = new Empleado("Carlitos", 10000, true);
    Empleado pepe = new Empleado("Pepe", 80000, false);

    //guardar empleados (create)
    empleadoCRUD.save(juanito);
    empleadoCRUD.save(carlitos);
    empleadoCRUD.save(pepe);

    //consultar empleados (leer - read)
    List<Empleado> nomina = empleadoCRUD.findAll();
        System.out.println(nomina);

    }
}
