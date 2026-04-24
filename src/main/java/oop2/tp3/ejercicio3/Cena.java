package oop2.tp3.ejercicio3;

public class Cena extends Gasto {
    private static final int LIMITE = 5000;

    public Cena(int monto) {
        super(monto);
    }

    @Override
    public String getNombre() {
        return "Cena";
    }

    @Override
    public boolean esComida() {
        return true;
    }

    @Override
    public boolean excedeLimite() {
        return monto > LIMITE;
    }
}
