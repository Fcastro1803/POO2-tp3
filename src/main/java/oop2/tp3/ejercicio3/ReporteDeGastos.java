package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;


public class ReporteDeGastos {
    public String imprimir(List<Gasto> gastos) {
        int total = 0;
        int gastosDeComida = 0;

        StringBuilder reporte = new StringBuilder();
        reporte.append("Expenses ").append(LocalDate.now()).append("\n");

        for (Gasto gasto : gastos) {
            if (gasto.esComida()) {
                gastosDeComida += gasto.getMonto();
            }

            String nombreGasto = gasto.getNombre();

            String marcaExceso = gasto.marcaExceso();

            reporte.append(nombreGasto).append("\t")
                    .append(gasto.getMonto()).append("\t")
                    .append(marcaExceso).append("\n");

            total += gasto.getMonto();
        }

        reporte.append("Gastos de comida: ").append(gastosDeComida).append("\n");
        reporte.append("Total de gastos: ").append(total);

        return reporte.toString();
    }
}