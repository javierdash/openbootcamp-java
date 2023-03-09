package con.interfaz;

/**
*Las interfaces sólo declaran métodos. NO los implementan
*Dice lo que hay que hacer. No explica dónde ni cómo hacerlo
*/
import sin.interfaz.Empleado;
import java.util.List;

public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);


}
