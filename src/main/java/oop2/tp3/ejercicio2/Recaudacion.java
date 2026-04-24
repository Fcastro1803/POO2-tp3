package oop2.tp3.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {
    public static List<Map<String, String>> where(Map<String, String> options)
            throws IOException {
        List<String[]> csvData = Csv.readCsv();

        if (options.containsKey("company_name")) {
            List<String[]> results = new ArrayList<String[]>();

            for (String[] fila : csvData) {
                if (fila[1].equals(options.get("company_name"))) {
                    results.add(fila);
                }
            }
            csvData = results;
        }

        if (options.containsKey("city")) {
            List<String[]> results = new ArrayList<String[]>();

            for (String[] fila : csvData) {
                if (fila[4].equals(options.get("city"))) {
                    results.add(fila);
                }
            }
            csvData = results;
        }

        if (options.containsKey("state")) {
            List<String[]> results = new ArrayList<String[]>();

            for (String[] fila : csvData) {
                if (fila[5].equals(options.get("state"))) {
                    results.add(fila);
                }
            }
            csvData = results;
        }

        if (options.containsKey("round")) {
            List<String[]> results = new ArrayList<String[]>();

            for (String[] fila : csvData) {
                if (fila[9].equals(options.get("round"))) {
                    results.add(fila);
                }
            }
            csvData = results;
        }

        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        for (String[] fila : csvData) {
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
            output.add(mapped);
        }
        return output;
    }
}
