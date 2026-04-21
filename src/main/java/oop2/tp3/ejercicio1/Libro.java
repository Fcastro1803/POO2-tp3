package oop2.tp3.ejercicio1;

public abstract class Libro {
    protected String nombre;
    protected int codigoPrecio;

    public Libro(String nombre, int priceCode) {
        this.nombre = nombre;
        this.codigoPrecio = priceCode;
    }

    public int codigoPrecio() {
        return codigoPrecio;
    }

    public String nombre() {
        return nombre;
    }

    abstract double calcularMonto(int diasAlquilados);

    abstract int calcularPuntos(int diasAlquilados);
}