import java.util.List;

public class GeneradorReporte {
    public String construirCsv(List<String> filas) {
        String resultado = "";
        for (int i = 0; i < filas.size(); i++) {
            resultado = resultado + filas.get(i) + "\n";
        }
        return resultado;
    }
}
