package oop2.tp3.ejercicio1;

public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public int diasAlquilados() {
        return this.diasAlquilados;
    }

    public CopiaLibro copia() {
        return this.copia;
    }

    public double calcularMonto() {
        double monto = 0;
        return monto = this.copia().libro().calcularMonto(this.diasAlquilados());
    }

    public int calcularPuntosAlquilerFrecuente() {
        int puntosAlquilerFrecuente = 0;
        return puntosAlquilerFrecuente = this.copia().libro().calcularPuntos(this.diasAlquilados());
    }
}
