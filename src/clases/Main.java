package clases;

import herencia.Camion;
import herencia.Coche;
import herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

        //creación de objeto:

        Motor motorRau = new Motor("bi cilindrico", 110, 2);

        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 125.4, 2015, false, 0, motorRau);

        //Motocicleta kawasakiNinja2 = new Motocicleta("kawasaki", "ninja", 250.6, 2020, true, 250, motorKawa, false);


        //System.out.println(fordMondeo.modelo);
        //System.out.println(fordMondeo.motor.modelo);

        //2. HERENCIA
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

//        System.out.println(kawasakiNinja.fabricante);
//
//        System.out.println("fin del programa");

        //3. POLIMORFISMO. distintas formas

        //lo estamos definiendo, no inicializando.
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();

        System.out.println(vehiculo.speed);
        vehiculo.acelerar(50);
        System.out.println(vehiculo.speed);


        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);


        // 4. CLASES ABSTRACTAS. no se pueden instanciar (crear objetos). Solo instancian las clases hijas.

    }
}
