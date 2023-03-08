package ejercicio4;

public class SmartDevice {

    //1 atributos
    String marca;
    String modelo;
    int precio;
    double tamanoPantalla;
    int duracionBateria;


    //2. constructores
    public SmartDevice() {}

    public SmartDevice(String marca, String modelo, int precio, double tamanoPantalla, int duracionBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tamanoPantalla = tamanoPantalla;
        this.duracionBateria = duracionBateria;
    }

}
