package oop2.tp3.ejercicio3;

public class Desayuno extends Gasto {
    private static final int LIMITE = 1000;

    public Desayuno(int monto) {
        super(monto);
    }

    @Override
    public String getNombre() {
        return "Desayuno";
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
