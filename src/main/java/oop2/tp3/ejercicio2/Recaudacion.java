package oop2.tp3.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {
    private List<String[]> csvData;

    public Recaudacion() throws IOException {
        this.csvData = Csv.readCsv();
    }

    public List<Map<String, String>> where(Map<String, String> options) {
        filtrarPor(options, "company_name", 1);
        filtrarPor(options, "city", 4);
        filtrarPor(options, "state", 5);
        filtrarPor(options, "round", 9);
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();
        for (String[] fila : csvData) {
            output.add(mapearFila(fila));
        }
        return output;
    }

    private static Map<String, String> mapearFila(String[] fila) {
        Map<String, String> mapped = new HashMap<String, String>();
        mapped.put("permalink", fila[0]);
        mapped.put("company_name", fila[1]);
        mapped.put("number_employees", fila[2]);
        mapped.put("category", fila[3]);
        mapped.put("city", fila[4]);
        mapped.put("state", fila[5]);
        mapped.put("funded_date", fila[6]);
        mapped.put("raised_amount", fila[7]);
        mapped.put("raised_currency", fila[8]);
        mapped.put("round", fila[9]);
        return mapped;
    }

    private void filtrarPor(Map<String, String> options, String company_name, int x) {
        if (options.containsKey(company_name)) {
            List<String[]> results = new ArrayList<String[]>();

            for (String[] fila : csvData) {
                if (fila[x].equals(options.get(company_name))) {
                    results.add(fila);
                }
            }
            csvData = results;
        }
    }
}
