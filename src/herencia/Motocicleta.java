package herencia;

import clases.Motor;
import clases.Vehiculo;

/**
 * Clase derivada ó clase hija ó subclase
 */

//para heredar se utiliza la palabra extends
public class Motocicleta extends Vehiculo {

    //1. atributos:
    boolean baul;

    //2. generar constructor (por lo gral 2. 1 vacío y otro con todos los parámetros)

    public Motocicleta(){}

    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
