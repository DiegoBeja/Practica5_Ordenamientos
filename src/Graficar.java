import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class Graficar extends JFrame{
    public Graficar(){

    }

    public void graficar(int[] a){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < a.length; i++) {
            dataset.addValue(a[i], "Serie", String.valueOf(i));
        }
        JFreeChart grafica = ChartFactory.createLineChart("Todo", "Hola", "Mundo", dataset);
        ChartPanel panel = new ChartPanel(grafica);
        setContentPane(panel);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
