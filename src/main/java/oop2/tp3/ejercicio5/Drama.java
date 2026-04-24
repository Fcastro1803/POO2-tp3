package oop2.tp3.ejercicio5;

public class Drama extends Actuacion{
    public Drama(String nombreEvento, int numberoEspectadores) {
        super(nombreEvento, numberoEspectadores);
    }

    @Override
    public float calcularCreditos() {
        return Math.max(this.cantEspectadores() - 30, 0);
    }

    @Override
    public float calcularMonto() {
        float monto = 40000;
        if (this.cantEspectadores() > 30) {
          monto += 1000 * (this.cantEspectadores() - 30);
        }
        return monto;
    }
}
