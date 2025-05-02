import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GUI extends JFrame{
    private JComboBox ordenamiento1;
    private JComboBox ordenamiento2;
    private JButton boton1;
    private JButton boton2;
    private JPanel panel1;
    private JPanel panel2;
    private JTextArea textoArchivo1;
    private JScrollPane scroll;

    public GUI() throws FileNotFoundException {
        String[] opciones = new String[] {" ", "Opcion 1", "Opcion 2"};
        String archivo = "C:\\Users\\bombo\\Desktop\\Algoritmos\\practica5_Algoritmos\\src\\weatherHistory.csv";

        panel1 = new JPanel();
        panel2 = new JPanel();

        boton1 = new JButton("Ver grafica");
        boton2 = new JButton("Ver grafica");

        ordenamiento1 = new JComboBox<>(opciones);
        ordenamiento2 = new JComboBox<>(opciones);

        textoArchivo1 = new JTextArea(37, 10);

        scroll = new JScrollPane(textoArchivo1);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] valores = linea.split(",");
                textoArchivo1.append(valores[1] + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        };

        setTitle("Practica 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 9, 0, 5));
        setSize(1453, 723);
        setLocationRelativeTo(null);

        //panel1.setBackground(Color.green);
        boton1.setFocusPainted(false);      //Le quita el cuadrado feo
        panel1.add(boton1);
        panel1.add(ordenamiento1);
        panel1.add(scroll);

        panel2.setBackground(Color.blue);
        boton2.setFocusPainted(false);
        panel2.add(boton2);
        panel2.add(ordenamiento2);

        add(panel1);
        add(panel2);
    }
}
