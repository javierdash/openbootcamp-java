package con.interfaz;

import sin.interfaz.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDExcel();

    public static void main(String[] args) {

    empleadoCRUD.findAll();
    empleadoCRUD.save(new Empleado());
    //empleadoCRUD.delete();

    }
}
