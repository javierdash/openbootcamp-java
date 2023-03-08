package com.ejercicios;

import java.util.Scanner;

public class Entrega2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio");
         double precio = scanner.nextDouble();
         double conIva = precio * .21 + precio;
        System.out.println("El precio con IVA es $" + conIva);
    }
}
