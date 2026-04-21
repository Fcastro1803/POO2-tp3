package oop2.tp3.ejercicio1;

public class LibroRegular extends Libro {

    public LibroRegular(String nombre) {
        super(nombre, 0);
    }

    @Override
    double calcularMonto(int diasAlquilados) {
        double monto = 0;
        monto += 2;
        if (diasAlquilados > 2)
            monto += (diasAlquilados - 2) * 1.5;
        return monto;
    }

    @Override
    int calcularPuntos(int diasAlquilados) {
        int puntosAlquilerFrecuente = 0;
        puntosAlquilerFrecuente++;
        return puntosAlquilerFrecuente;
    }


}