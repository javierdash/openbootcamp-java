package clases;

import herencia.Motocicleta;

/**
 * Clase base ó superClase ó clase padre
 */

public class Vehiculo {

    //1. atributos  (le ponemos protected o public para que puedan usarse en herencia)
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;


    //2. constructores
    public Vehiculo () {}

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }


    //3. metodos. Creando una función:
    int acelerar(int kilometros) {
        return speed = speed + kilometros;
    }



}
