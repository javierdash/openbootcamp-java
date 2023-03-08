package ejercicio4;

public class Main {
    public static void main(String[] args) {

        SmartWatch appleWatch = new SmartWatch();
        appleWatch.marca = "Apple";
        appleWatch.modelo = "smart2";
        appleWatch.duracionBateria = 5;
        appleWatch.precio = 5000;

        SmartPhone iphone = new SmartPhone();
        iphone.marca = "Iphone";
        iphone.precio = 590000;

        System.out.println(appleWatch.marca);
        System.out.println(iphone.precio);


    }
}
