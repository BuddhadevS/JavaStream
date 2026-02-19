//package lib;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.commons.csv.*;
//
//import java.io.*;
//import java.util.*;
//
//public class JsonToCsvConverter {
//
//    public static void main(String[] args) {
//
//        String jsonFilePath =
//                "P:\\Boot\\SpringStream\\src\\main\\java\\lib\\input.json";
//        // same folder as Java file
//        String csvFilePath = "output.csv";
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        try {
//            // STEP 1: Read JSON file into List of Maps
//            List<Map<String, Object>> data =
//                    objectMapper.readValue(
//                            new File(jsonFilePath),
//                            new TypeReference<List<Map<String, Object>>>() {}
//                    );
//
//            // STEP 2: Extract headers from first JSON object
//            Set<String> headers = data.get(0).keySet();
//
//            // STEP 3: Write CSV file
//            try (Writer writer = new FileWriter(csvFilePath);
//                 CSVPrinter csvPrinter = new CSVPrinter(
//                         writer,
//                         CSVFormat.DEFAULT.withHeader(
//                                 headers.toArray(new String[0])
//                         ))) {
//
//                for (Map<String, Object> row : data) {
//                    csvPrinter.printRecord(row.values());
//                }
//            }
//
//            System.out.println("✅ JSON converted to CSV successfully!");
//            System.out.println("📄 CSV saved at: " + csvFilePath);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//





package lib;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.csv.*;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JsonToCsvConverter {

    public static void main(String[] args) {

        String jsonFilePath =
                "P:\\Boot\\SpringStream\\src\\main\\java\\lib\\input.json";
        //String csvFilePath = "output.csv";

        ObjectMapper objectMapper = new ObjectMapper();


        try {
            // STEP 1: Read JSON file
            List<Map<String, Object>> data =
                    objectMapper.readValue(
                            new File(jsonFilePath),
                            new TypeReference<List<Map<String, Object>>>() {}
                    );

            // STEP 2: Extract headers
            List<String> headers = new ArrayList<>(data.get(0).keySet());

            // ✅ STEP 3: PRINT TO CONSOLE
            System.out.println(String.join(",", headers));

            for (Map<String, Object> row : data) {
                List<String> values = new ArrayList<>();
                for (String header : headers) {
                    values.add(String.valueOf(row.get(header)));
                }
                System.out.println(String.join(",", values));
            }

            System.out.println(" JSON printed to console and saved to CSV!");
            //System.out.println(" CSV path: " + csvFilePath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

