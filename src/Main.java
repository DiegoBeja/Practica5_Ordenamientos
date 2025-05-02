import javax.swing.*;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int[] a = {1,2,6,10,20,41,1,52,22};
        int n = a.length;

//        SwingUtilities.invokeLater(() -> {
//            Graficar g = new Graficar();
//            g.graficar(a);
//            g.setVisible(true);
//        });

        new GUI().setVisible(true);
    }
}