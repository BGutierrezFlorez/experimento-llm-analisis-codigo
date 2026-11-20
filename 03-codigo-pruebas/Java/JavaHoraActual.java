import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaHoraActual {
    public static void main(String[] args) {
        String fechaActual = " 2026-11-20 ";
        System.out.println("fechaActual" + fechaActual);
        LocalDate fechaParaConvertir = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formateString = fechaActual.format(String.valueOf(formatter));
        System.out.println("fecha formateada" + formateString);
    }
}