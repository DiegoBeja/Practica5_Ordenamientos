import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Filas {
    private ArrayList<Fila> filasDatos;

    public Filas(){
        filasDatos = new ArrayList<>();
    }

    public void agregarDato(Fila filaNueva){
        filasDatos.add(filaNueva);
    }

    public void ordenarPorColumnaAscendente(int currentColumn) {
        Comparator<Fila> comparator = getAscendingComparator(currentColumn);
        if (comparator != null) {
            Collections.sort(filasDatos, comparator);
        } else {
            System.out.println("Columna inválida");
        }
    }

    public Comparator<Fila> getAscendingComparator(int currentColumn){
        switch(currentColumn){
            case 0:
                return Comparator.comparing(Fila::getDate);
            case 1:
                return Comparator.comparing(Fila::getSummary);
            case 2:
                return Comparator.comparing(Fila::getPrecipType);
            case 3:
                return Comparator.comparingDouble(Fila::getTemperature);
            case 4:
                return Comparator.comparingDouble(Fila::getApparentTemperature);
            case 5:
                return Comparator.comparingDouble(Fila::getHumidity);
            case 6:
                return Comparator.comparingDouble(Fila::getWindSpeed);
            case 7:
                return Comparator.comparingDouble(Fila::getWindBearing);
            case 8:
                return Comparator.comparingDouble(Fila::getVisibility);
            case 9:
                return Comparator.comparingDouble(Fila::getLoudCover);
            case 10:
                return Comparator.comparingDouble(Fila::getPressure);
            case 11:
                return Comparator.comparing(Fila::getDailySummary);
        }
        return null;
    }
}
