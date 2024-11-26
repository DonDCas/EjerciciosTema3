package Model;

import Utils.Menus;
import Model.AbrirYouTube;

import java.util.Scanner;

public class GatoSimple {
    Scanner sc = new Scanner(System.in);
    //Atributos

    private String nombreGato, color, raza, sexo;
    private int edad;
    private boolean hambre = true;
    private double peso;

    //Getter

    public String getNombreGato() {
        return nombreGato;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isHambre() {
        return hambre;
    }

    public double getPeso() {
        return peso;
    }

    //Constructor
    public GatoSimple(){    }

    public GatoSimple(String nombreGato, String color, String raza, String sexo, int edad, boolean hambre, double peso) {
        this.nombreGato = nombreGato;
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.hambre = hambre;
        this.peso = peso;
    }


    //Setter


    public void setNombreGato(String nombreGato) {
        this.nombreGato = nombreGato;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza() {
        int respuesta;
        respuesta = Menus.MenuRaza();
        if (respuesta == 1) this.raza = "Egipcio";
        if (respuesta == 2) this.raza = "Siames";
        if (respuesta == 3) this.raza = "Europeo";
        if (respuesta == 4) this.raza = "Callejero y Viajero";
    }

    public void setSexo() {
        boolean validoSexo = false;
        do {
            System.out.print("El gato es macho o hembra? (Macho(M)/Hembra(H))");
            sexo = sc.nextLine();
            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Macho")){
                validoSexo = true;
                this.sexo = "Macho";
            }
            if (sexo.equalsIgnoreCase(("H")) || sexo.equalsIgnoreCase("Hembra")){
                validoSexo = true;
                this.sexo = "Hembra";
            }
        } while (!validoSexo);

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHambre(boolean hambre) {
        this.hambre = hambre;
    }

    public boolean setPeso(double peso) {
        if (peso < 0) return false;
        this.peso = peso;
        return true;
    }

    public boolean peleaCon(GatoSimple gato1) {
        if (gato1.getSexo()!= sexo){
            System.out.println("Los gatos son de diferente sexo asi que no se pelean");
            System.out.println("pero");
            sc.nextLine();
            AbrirYouTube.main();
        }else {
            if (gato1.getPeso() > peso ) return true;
        }
        return false;

    }
    public boolean tieneHambre(String respuesta) {
        if (respuesta.equalsIgnoreCase("pescado")) {
            this.hambre = false;
            return true;
        }
        return false;
    }
    public boolean comprobarSexoGato() {
        if (sexo.equalsIgnoreCase("Hembra"))return true;
        return false;
    }

    @Override
    public String toString() {
        return "\n" +
                "NOMBRE :" + nombreGato + "\n" +
                "Su color es: " + color + "\n" +
                "Es de la raza: " + raza + "\n" +
                "Del sexo: " + sexo + "\n" +
                "Tiene una edad de: " + edad + " años \n" +
                "Y pesa: " + peso + " Kilos\n";
    }

}
