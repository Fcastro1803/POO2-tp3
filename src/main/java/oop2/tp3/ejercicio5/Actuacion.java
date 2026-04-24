package oop2.tp3.ejercicio5;

public abstract class Actuacion {
    private String nombreEvento;
    private int numberoEspectadores;

    public Actuacion(String nombreEvento, int numberoEspectadores) {
        this.nombreEvento = nombreEvento;
        this.numberoEspectadores = numberoEspectadores;
    }

    protected int cantEspectadores() {
        return this.numberoEspectadores;
    }

    public abstract float calcularCreditos(); //{

    public abstract float calcularMonto();

    public String nombreEvento() {
        return nombreEvento;
    }
}
