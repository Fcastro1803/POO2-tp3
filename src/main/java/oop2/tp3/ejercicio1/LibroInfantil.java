package oop2.tp3.ejercicio1;

public class LibroInfantil extends Libro {

    public LibroInfantil(String nombre) {
        super(nombre, 2);

    }

    @Override
    double calcularMonto(int diasAlquilados) {
        double monto = 0;
        monto += 1.5;
        if (diasAlquilados > 3)
            monto += (diasAlquilados - 3) * 1.5;
        return monto;
    }

    @Override
    int calcularPuntos(int diasAlquilados) {
        int puntosAlquilerFrecuente = 0;
        puntosAlquilerFrecuente++;
        return puntosAlquilerFrecuente;
    }

}