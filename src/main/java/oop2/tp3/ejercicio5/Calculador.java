package oop2.tp3.ejercicio5;

public class Calculador {

    public String reporte(Factura factura) {
        float totalAmount = 0;
        float creditos = 0;
        var result = "Facturación para " + factura.nombreCliente() + "\n";
        var actuaciones = factura.actuaciones();
        for (var actuacion : actuaciones) {
            float monto = actuacion.calcularMonto();
            creditos += actuacion.calcularCreditos();
            result += actuacion.nombreEvento() + ": " + monto + ". Asientos: " + actuacion.cantEspectadores() + "\n";
            totalAmount += monto;
            //            var tipo = eventos.stream()
//                    .filter(e -> e.nombreEvento().equals(actuacion.nombreEvento()))
//                    .findFirst()
//                    .orElseThrow(() -> new RuntimeException("Evento no encontrado"))
//                    .tipo();
//
//            switch (tipo) {
//                case "Drama":
//                    monto = 40000;
//                    if (actuacion.numberoEspectadores() > 30) {
//                        monto += 1000 * (actuacion.numberoEspectadores() - 30);
//                    }
//                    break;
//                case "Comedia":
//                    monto = 30000;
//                    if (actuacion.numberoEspectadores() > 20) {
//                        monto += 10000 + 500 * (actuacion.numberoEspectadores() - 20);
//                    }
//                    monto += 300 * actuacion.numberoEspectadores();
//                    break;
//                default:
//                    throw new RuntimeException("Tipo de evento no conocido");
//            }
//            // creditos a ganar
//            creditos += Math.max(actuacion.numberoEspectadores() - 30, 0);
//            // creditos extras para comedia
//            if ("Comedia".equals(tipo)) {
//                creditos += Math.floor(actuacion.numberoEspectadores() / 5);
//            }
//            result += actuacion.nombreEvento() + ": " + monto + ". Asientos: " + actuacion.cantEspectadores() + "\n";
//            totalAmount += monto;
        }
        result += "Monto ganado: " + totalAmount + "\n";
        result += "Créditos ganados: " + creditos + "\n";

        return result;
    }
}
