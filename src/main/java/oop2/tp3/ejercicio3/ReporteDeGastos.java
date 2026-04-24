package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

enum TipoDeGasto {
    CENA, DESAYUNO, ALQUILER_AUTO
}

class Gasto {
    TipoDeGasto tipoGasto;
    int monto;
}

public class ReporteDeGastos {
    public String imprimir(List<Gasto> gastos) {
        int total = 0;
        int gastosDeComida = 0;

        // Busque para poder hacer el reporte con string y encontre esta clase mutable:
        // https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
        StringBuilder reporte = new StringBuilder();

        reporte.append("Expenses ").append(LocalDate.now()).append("\n");

        for (Gasto gasto : gastos) {
            if (gasto.tipoGasto == TipoDeGasto.CENA || gasto.tipoGasto == TipoDeGasto.DESAYUNO) {
                gastosDeComida += gasto.monto;
            }

            String nombreGasto = "";
            switch (gasto.tipoGasto) {
                case CENA:
                    nombreGasto = "Cena";
                    break;
                case DESAYUNO:
                    nombreGasto = "Desayuno";
                    break;
                case ALQUILER_AUTO:
                    nombreGasto = "Alquiler de Autos";
                    break;
            }

            String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA && gasto.monto > 5000
                    || gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto > 1000 ? "X" : " ";

            reporte.append(nombreGasto).append("\t").append(gasto.monto).append("\t").append(marcaExcesoComidas).append("\n");

            total += gasto.monto;
        }

        reporte.append("Gastos de comida: ").append(gastosDeComida).append("\n");
        reporte.append("Total de gastos: ").append(total);

        return reporte.toString();
    }
}
