package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteDeGastosTest {
    @Test
    public void testReporteGastosDesayuno(){
        var g1 = new Gasto();
        g1.tipoGasto = TipoDeGasto.DESAYUNO;
        g1.monto =1000;
        var reporte = new ReporteDeGastos();
        assertEquals("Expenses 2026-04-24\n" +
                "Desayuno\t1000\t \n" +
                "Gastos de comida: 1000\n" +
                "Total de gastos: 1000", reporte.imprimir(List.of(g1)));
    }

    @Test
    public void testReporteGastosDesayunoExceso(){
        var g1 = new Gasto();
        g1.tipoGasto = TipoDeGasto.DESAYUNO;
        g1.monto =2000;
        var reporte = new ReporteDeGastos();
        assertEquals("Expenses 2026-04-24\n" +
                "Desayuno\t2000\tX\n" +
                "Gastos de comida: 2000\n" +
                "Total de gastos: 2000", reporte.imprimir(List.of(g1)));
    }

    @Test
    public void testReporteGastosAlquilerAuto(){
        var g1 = new Gasto();
        g1.tipoGasto = TipoDeGasto.ALQUILER_AUTO;
        g1.monto =1500;
        var reporte = new ReporteDeGastos();
        assertEquals("Expenses 2026-04-24\n" +
                "Alquiler de Autos\t1500\t \n" +
                "Gastos de comida: 0\n" +
                "Total de gastos: 1500", reporte.imprimir(List.of(g1)));
    }
}
