package view;

import Model.GatoSimple;

import Utils.Menus;

import java.util.Scanner;

/*Ejercicio 1
Desarrolla la clase GatoSimple con los atributos: Color, raza y sexo (String), edad (int), hambre
        (Boolean) y peso (double). Los métodos son: Constructor, setters, getters, tieneHambre, come (le
         pasamos un String con el tipo de comida, si no es pescado no come), peleaCon (le pasamos un
objeto tipo GatoSimple, la pelea solo ocurre cuando es entre dos machos). Elabora una clase main
y prueba todos los métodos.*/
public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respuesta;
        char peleamos = 'N';

        GatoSimple gato1 = new GatoSimple();

        System.out.print("¿Como se llama tu gato? ");
        gato1.setNombreGato(sc.nextLine());

        System.out.print("¿De que color es tu gato? ");
        gato1.setColor(sc.nextLine());

        gato1.setRaza();

        gato1.setSexo();

        System.out.print("¿Cuantos años tiene tu gato? ");
        gato1.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.print("¿Cuantos Kilos pesa tu gato? ");
        System.out.print(gato1.setPeso(Double.parseDouble(sc.nextLine()))
                        ? "Peso introducido"
                        : "Datos incorrectos");

        System.out.println();

        Menus.MenuComida(gato1);

        Menus.MenuGatos(gato1);




    }
}
