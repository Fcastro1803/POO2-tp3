package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamiento extends Libro {

    public LibroNuevoLanzamiento(String nombre) {
        super(nombre, 1);
    }

    @Override
    double calcularMonto(int diasAlquilados) {
        double monto = 0;
        monto += diasAlquilados * 3;
        return monto;
    }

    @Override
    int calcularPuntos(int diasAlquilados) {
        int puntosAlquilerFrecuente = 0;
        if ( diasAlquilados > 1) {
            puntosAlquilerFrecuente++;
        }
        puntosAlquilerFrecuente++;
        return puntosAlquilerFrecuente;
    }

}