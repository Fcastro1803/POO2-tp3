package oop2.tp3.ejercicio5;

public class Comedia extends Actuacion{
    public Comedia(String nombreEvento, int numberoEspectadores) {
        super(nombreEvento, numberoEspectadores);
    }

    @Override
    public float calcularCreditos() {
        return Math.max(this.cantEspectadores() - 30, 0) + (float) (double) (this.cantEspectadores() / 5);
    }

    @Override
    public float calcularMonto() {
        float monto = 30000;
        if (this.cantEspectadores() > 20) {
          monto += 10000 + 500 * (this.cantEspectadores() - 20);
        }
        monto += 300 * this.cantEspectadores();

        return monto;
    }
}
