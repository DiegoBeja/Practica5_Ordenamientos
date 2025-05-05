import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GUI extends JFrame{
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton botonOrdenamiento;
    private JButton botonOrdenamiento2;
    private JButton botonOrdenamiento3;
    private JButton botonOrdenamiento4;
    private JButton botonOrdenamiento5;
    private JButton botonOrdenamiento6;
    private JButton botonOrdenamiento7;
    private JButton botonOrdenamiento8;
    private JButton botonOrdenamiento9;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;
    private JTextArea textoArchivo1;
    private JTextArea textoArchivo2;
    private JTextArea textoArchivo3;
    private JTextArea textoArchivo4;
    private JTextArea textoArchivo5;
    private JTextArea textoArchivo6;
    private JTextArea textoArchivo7;
    private JTextArea textoArchivo8;
    private JTextArea textoArchivo9;
    private JScrollPane scroll;
    private JScrollPane scroll2;
    private JScrollPane scroll3;
    private JScrollPane scroll4;
    private JScrollPane scroll5;
    private JScrollPane scroll6;
    private JScrollPane scroll7;
    private JScrollPane scroll8;
    private JScrollPane scroll9;
    private JList<String> listaOpciones;
    private JList<String> lista;
    private JList<String> lista2;
    private JList<String> lista3;
    private JList<String> lista4;
    private JList<String> lista5;
    private JList<String> lista6;
    private JList<String> lista7;
    private JList<String> lista8;
    private JList<String> lista9;

    public GUI() throws FileNotFoundException {
        String[] opciones = new String[] {"Quick Sort", "Merge Sort", "Shell Sort", "Seleccion Directa", "Radix Sort", "Sort", "Parallel Sort"};
        lista = new JList<>(opciones);
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll = new JScrollPane(lista);
        scrolll.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup1 = new JPopupMenu();
        popup1.add(scrolll);

        lista2 = new JList<>(opciones);
        lista2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll2 = new JScrollPane(lista2);
        scrolll2.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup2 = new JPopupMenu();
        popup2.add(scrolll2);

        lista3 = new JList<>(opciones);
        lista3.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll3 = new JScrollPane(lista3);
        scrolll3.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup3 = new JPopupMenu();
        popup3.add(scrolll3);

        lista4 = new JList<>(opciones);
        lista4.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll4 = new JScrollPane(lista4);
        scrolll4.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup4 = new JPopupMenu();
        popup4.add(scrolll4);

        lista5 = new JList<>(opciones);
        lista5.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll5 = new JScrollPane(lista5);
        scrolll5.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup5 = new JPopupMenu();
        popup5.add(scrolll5);

        lista6 = new JList<>(opciones);
        lista6.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll6 = new JScrollPane(lista6);
        scrolll6.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup6 = new JPopupMenu();
        popup6.add(scrolll6);

        lista7 = new JList<>(opciones);
        lista7.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll7 = new JScrollPane(lista7);
        scrolll7.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup7 = new JPopupMenu();
        popup7.add(scrolll7);

        lista8 = new JList<>(opciones);
        lista8.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll8 = new JScrollPane(lista8);
        scrolll8.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup8 = new JPopupMenu();
        popup8.add(scrolll8);

        lista9 = new JList<>(opciones);
        lista9.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll9 = new JScrollPane(lista9);
        scrolll9.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup9 = new JPopupMenu();
        popup9.add(scrolll9);

        botonOrdenamiento = new JButton("Ordenamientos");
        botonOrdenamiento.addActionListener(e -> popup1.show(botonOrdenamiento, 0, botonOrdenamiento.getHeight()));

        botonOrdenamiento2 = new JButton("Ordenamientos");
        botonOrdenamiento2.addActionListener(e -> popup2.show(botonOrdenamiento2, 0, botonOrdenamiento2.getHeight()));

        botonOrdenamiento3 = new JButton("Ordenamientos");
        botonOrdenamiento3.addActionListener(e -> popup3.show(botonOrdenamiento2, 0, botonOrdenamiento3.getHeight()));

        botonOrdenamiento4 = new JButton("Ordenamientos");
        botonOrdenamiento4.addActionListener(e -> popup4.show(botonOrdenamiento4, 0, botonOrdenamiento4.getHeight()));

        botonOrdenamiento5 = new JButton("Ordenamientos");
        botonOrdenamiento5.addActionListener(e -> popup5.show(botonOrdenamiento5, 0, botonOrdenamiento5.getHeight()));

        botonOrdenamiento6 = new JButton("Ordenamientos");
        botonOrdenamiento6.addActionListener(e -> popup6.show(botonOrdenamiento6, 0, botonOrdenamiento6.getHeight()));

        botonOrdenamiento7 = new JButton("Ordenamientos");
        botonOrdenamiento7.addActionListener(e -> popup7.show(botonOrdenamiento7, 0, botonOrdenamiento7.getHeight()));

        botonOrdenamiento8 = new JButton("Ordenamientos");
        botonOrdenamiento8.addActionListener(e -> popup8.show(botonOrdenamiento8, 0, botonOrdenamiento8.getHeight()));

        botonOrdenamiento9 = new JButton("Ordenamientos");
        botonOrdenamiento9.addActionListener(e -> popup9.show(botonOrdenamiento9, 0, botonOrdenamiento9.getHeight()));

        lista.addListSelectionListener(e -> {
            if(!e.getValueIsAdjusting()){
                String opcionSeleccionada = lista.getSelectedValue();
                System.out.println(opcionSeleccionada);
            }
        });
        lista2.addListSelectionListener(e -> {
            if(!e.getValueIsAdjusting()){
                String opcionSeleccionada = lista2.getSelectedValue();
                System.out.println(opcionSeleccionada);
            }
        });

        String archivo = "C:\\Users\\bombo\\Desktop\\Algoritmos\\practica5_Algoritmos\\src\\weatherHistory.csv";

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();

        boton1 = new JButton("Ver grafica");
        boton2 = new JButton("Ver grafica");
        boton3 = new JButton("Ver grafica");
        boton4 = new JButton("Ver grafica");
        boton5 = new JButton("Ver grafica");
        boton6 = new JButton("Ver grafica");
        boton7 = new JButton("Ver grafica");
        boton8 = new JButton("Ver grafica");
        boton9 = new JButton("Ver grafica");

        textoArchivo1 = new JTextArea(37, 10);
        textoArchivo2 = new JTextArea(37, 10);
        textoArchivo3 = new JTextArea(37, 10);
        textoArchivo4 = new JTextArea(37, 10);
        textoArchivo5 = new JTextArea(37, 10);
        textoArchivo6 = new JTextArea(37, 10);
        textoArchivo7 = new JTextArea(37, 10);
        textoArchivo8 = new JTextArea(37, 10);
        textoArchivo9 = new JTextArea(37, 10);

        scroll = new JScrollPane(textoArchivo1);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll2 = new JScrollPane(textoArchivo2);
        scroll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll3 = new JScrollPane(textoArchivo3);
        scroll3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll4 = new JScrollPane(textoArchivo4);
        scroll4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll5 = new JScrollPane(textoArchivo5);
        scroll5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll5.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll6 = new JScrollPane(textoArchivo6);
        scroll6.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll6.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll7 = new JScrollPane(textoArchivo7);
        scroll7.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll7.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll8 = new JScrollPane(textoArchivo8);
        scroll8.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll8.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll9 = new JScrollPane(textoArchivo9);
        scroll9.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll9.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        List<String[]> filas = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] valores = linea.split(",");
                filas.add(valores);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        };

        for(String[] i: filas){
            textoArchivo1.append(i[0] + "\n");
            textoArchivo2.append(i[1] + "\n");
            textoArchivo3.append(i[2] + "\n");
            textoArchivo4.append(i[3] + "\n");
            textoArchivo5.append(i[4] + "\n");
            textoArchivo6.append(i[5] + "\n");
            textoArchivo7.append(i[6] + "\n");
            textoArchivo8.append(i[7] + "\n");
            textoArchivo9.append(i[8] + "\n");
        }

        setTitle("Practica 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 9, 0, 5));
        setSize(1453, 723);
        setLocationRelativeTo(null);

        boton1.setFocusPainted(false);      //Le quita el cuadrado feo
        panel1.add(boton1);
        panel1.add(botonOrdenamiento);
        panel1.add(scroll);

        boton2.setFocusPainted(false);
        panel2.add(boton2);
        panel2.add(botonOrdenamiento2);
        panel2.add(scroll2);

        boton3.setFocusPainted(false);
        panel3.add(boton3);
        panel3.add(botonOrdenamiento3);
        panel3.add(scroll3);

        boton4.setFocusPainted(false);
        panel4.add(boton4);
        panel4.add(botonOrdenamiento4);
        panel4.add(scroll4);

        boton5.setFocusPainted(false);
        panel5.add(boton5);
        panel5.add(botonOrdenamiento5);
        panel5.add(scroll5);

        boton6.setFocusPainted(false);
        panel6.add(boton6);
        panel6.add(botonOrdenamiento6);
        panel6.add(scroll6);

        boton7.setFocusPainted(false);
        panel7.add(boton7);
        panel7.add(botonOrdenamiento7);
        panel7.add(scroll7);

        boton8.setFocusPainted(false);
        panel8.add(boton8);
        panel8.add(botonOrdenamiento8);
        panel8.add(scroll8);

        boton9.setFocusPainted(false);
        panel9.add(boton9);
        panel9.add(botonOrdenamiento9);
        panel9.add(scroll9);

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);
        add(panel7);
        add(panel8);
        add(panel9);
    }

}
