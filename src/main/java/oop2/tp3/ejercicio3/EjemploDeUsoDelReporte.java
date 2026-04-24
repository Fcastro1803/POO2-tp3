package oop2.tp3.ejercicio3;

import java.util.List;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        List<Gasto> gastos = List.of(
                new Desayuno(1000),    // justo en el límite -> sin marca
                new Cena(6000),        // excede -> marca "X"
                new AlquilerAuto(2000) // no es comida, no tiene límite
        );

        ReporteDeGastos reporte = new ReporteDeGastos();
        System.out.println(reporte.imprimir(gastos));
    }
}
