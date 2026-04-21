package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculoPagoTest {
    @Test
    public void testCalculoDeudaYPuntosUnLibroRegularDosDias() {
        Libro libro = new LibroRegular("Libro Regular");
        CopiaLibro copia = new CopiaLibro(libro);
        Alquiler alquiler = new Alquiler(copia, 2);
        Cliente cliente = new Cliente("Cliente");
        cliente.alquilar(alquiler);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(2.0, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    public void testCalculoDeudaYPuntosUnLibroRegularTresDias() {
        Libro libro = new LibroRegular("Libro Regular");
        CopiaLibro copia = new CopiaLibro(libro);
        Alquiler alquiler = new Alquiler(copia, 3);
        Cliente cliente = new Cliente("Cliente");
        cliente.alquilar(alquiler);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(3.5, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    public void testCalculoDeudaYPuntosUnNuevoLanzamientoUnDia() {
        Libro libro = new LibroNuevoLanzamiento("Nuevo Lanzamiento");
        CopiaLibro copia = new CopiaLibro(libro);
        Alquiler alquiler = new Alquiler(copia, 1);
        Cliente cliente = new Cliente("Cliente");
        cliente.alquilar(alquiler);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(3.0, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    public void testCalculoDeudaYPuntosUnNuevoLanzamientoDosDias() {
        Libro libro = new LibroNuevoLanzamiento("Nuevo Lanzamiento");
        CopiaLibro copia = new CopiaLibro(libro);
        Alquiler alquiler = new Alquiler(copia, 2);
        Cliente cliente = new Cliente("Cliente");
        cliente.alquilar(alquiler);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(6.0, resultado[0]);
        assertEquals(2, resultado[1]);
    }

    @Test
    public void testCalculoDeudaYPuntosUnLibroInfantilTresDias() {
        Libro libro = new LibroInfantil("Libro Infantil");
        CopiaLibro copia = new CopiaLibro(libro);
        Alquiler alquiler = new Alquiler(copia, 3);
        Cliente cliente = new Cliente("Cliente");
        cliente.alquilar(alquiler);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(1.5, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    public void testCalculoDeudaYPuntosUnLibroInfantilCuatroDias() {
        Libro libro = new LibroInfantil("Libro Infantil");
        CopiaLibro copia = new CopiaLibro(libro);
        Alquiler alquiler = new Alquiler(copia, 4);
        Cliente cliente = new Cliente("Cliente");
        cliente.alquilar(alquiler);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(3.0, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    public void testCalculoDeudaYPuntosVariosLibros() {
        Libro regular = new LibroRegular("Regular");
        Libro nuevo = new LibroNuevoLanzamiento("Nuevo");
        Libro infantil = new LibroInfantil("Infantil");
        CopiaLibro copiaRegular = new CopiaLibro(regular);
        CopiaLibro copiaNuevo = new CopiaLibro(nuevo);
        CopiaLibro copiaInfantil = new CopiaLibro(infantil);
        Alquiler alquilerRegular = new Alquiler(copiaRegular, 3);
        Alquiler alquilerNuevo = new Alquiler(copiaNuevo, 2);
        Alquiler alquilerInfantil = new Alquiler(copiaInfantil, 4);
        Cliente cliente = new Cliente("Cliente");
        cliente.alquilar(alquilerRegular);
        cliente.alquilar(alquilerNuevo);
        cliente.alquilar(alquilerInfantil);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        // 3.5 + 6 + 3 = 12.5
        assertEquals(12.5, resultado[0]);
        // 1 + 2 + 1 = 4
        assertEquals(4, resultado[1]);
    }
}
