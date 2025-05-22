import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class Graficar extends JFrame{
    private XYSeriesCollection dataset;
    private JFreeChart chart;

    public Graficar(){
        dataset = new XYSeriesCollection();
        chart = ChartFactory.createXYLineChart(
                "Comparacion de Tiempos",
                "Indice",
                "Segundos",
                dataset
        );

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);

        setTitle("Grafico XY");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void agregarLinea(double[] nuevosDatos, String nombreSerie) {
        XYSeries nuevaSerie = new XYSeries(nombreSerie);
        for (int i = 0; i < nuevosDatos.length; i++) {
            nuevaSerie.add(i, nuevosDatos[i]);
        }
        dataset.addSeries(nuevaSerie);
        this.repaint();
    }
}
