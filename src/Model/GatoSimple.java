package Model;

public class GatoSimple {

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
        this.nombreGato = GatoSimple.getNombreGato();
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

    public Boolean setSexo(String sexo) {


        this.sexo = sexo;
    }
}
