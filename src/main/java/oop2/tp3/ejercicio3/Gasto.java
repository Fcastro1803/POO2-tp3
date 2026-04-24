package oop2.tp3.ejercicio3;

public abstract class Gasto {
    protected int monto;

    public Gasto(int monto) {
        this.monto = monto;
    }

    public int getMonto() {
        return monto;
    }

    public abstract String getNombre();

    public abstract boolean esComida();

    public boolean excedeLimite() {
        return false;
    }

    public String marcaExceso() {
        return excedeLimite() ? "X" : " ";
    }
}
