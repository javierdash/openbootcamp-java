package sin.interfaz;

import java.util.List;
import java.util.ArrayList;

public class EmpleadoCRUD {

    //estructura de datos
    static List<Empleado> empleados = new ArrayList<>();


    //3.metodos (funciones crud)
    public static void save (Empleado empleado) {
        empleados.add(empleado);
    }

    public static List<Empleado> findAll() {
        return empleados;
    }

}
