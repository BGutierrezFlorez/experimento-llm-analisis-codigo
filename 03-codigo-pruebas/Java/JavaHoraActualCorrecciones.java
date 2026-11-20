
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class JavaHoraActualCorrecciones {

    public static void main(String[] args) {

        String fechaActual = " 2026-11-20 ";

        System.out.println("Fecha original: " + fechaActual);

        try {
            // 1. Eliminar espacios y convertir String a LocalDate
            LocalDate fechaParaConvertir =
                    LocalDate.parse(fechaActual.trim());

            // 2. Definir el formato de salida
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // 3. Formatear la fecha
            String fechaFormateada =
                    fechaParaConvertir.format(formatter);

            // 4. Mostrar el resultado
            System.out.println("Fecha formateada: " + fechaFormateada);

        } catch (DateTimeParseException e) {
            System.out.println("Error: la fecha tiene un formato inválido.");
        }
    }
}
