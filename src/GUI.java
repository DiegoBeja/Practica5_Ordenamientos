import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class GUI extends JFrame {
    private Graficar graficaDeTodo;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton boton10;
    private JButton boton11;
    private JButton boton12;
    private JButton botonOrdenamiento;
    private JButton botonOrdenamiento2;
    private JButton botonOrdenamiento3;
    private JButton botonOrdenamiento4;
    private JButton botonOrdenamiento5;
    private JButton botonOrdenamiento6;
    private JButton botonOrdenamiento7;
    private JButton botonOrdenamiento8;
    private JButton botonOrdenamiento9;
    private JButton botonOrdenamiento10;
    private JButton botonOrdenamiento11;
    private JButton botonOrdenamiento12;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;
    private JPanel panel10;
    private JPanel panel11;
    private JPanel panel12;
    private JTextArea textoArchivo1;
    private JTextArea textoArchivo2;
    private JTextArea textoArchivo3;
    private JTextArea textoArchivo4;
    private JTextArea textoArchivo5;
    private JTextArea textoArchivo6;
    private JTextArea textoArchivo7;
    private JTextArea textoArchivo8;
    private JTextArea textoArchivo9;
    private JTextArea textoArchivo10;
    private JTextArea textoArchivo11;
    private JTextArea textoArchivo12;
    private JScrollPane scroll;
    private JScrollPane scroll2;
    private JScrollPane scroll3;
    private JScrollPane scroll4;
    private JScrollPane scroll5;
    private JScrollPane scroll6;
    private JScrollPane scroll7;
    private JScrollPane scroll8;
    private JScrollPane scroll9;
    private JScrollPane scroll10;
    private JScrollPane scroll11;
    private JScrollPane scroll12;
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
    private JList<String> lista10;
    private JList<String> lista11;
    private JList<String> lista12;
    private Ordenamientos x;

    public GUI() throws FileNotFoundException {
        x = new Ordenamientos();

        String[] opciones = new String[]{"Quick Sort", "Merge Sort", "Shell Sort", "Seleccion Directa", "Radix Sort", "Sort", "Parallel Sort"};
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

        lista10 = new JList<>(opciones);
        lista10.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll10 = new JScrollPane(lista10);
        scrolll10.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup10 = new JPopupMenu();
        popup10.add(scrolll10);

        lista11 = new JList<>(opciones);
        lista11.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll11 = new JScrollPane(lista11);
        scrolll11.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup11 = new JPopupMenu();
        popup11.add(scrolll11);

        lista12 = new JList<>(opciones);
        lista12.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrolll12 = new JScrollPane(lista12);
        scrolll12.setPreferredSize(new Dimension(150, 120));
        JPopupMenu popup12 = new JPopupMenu();
        popup12.add(scrolll12);

        botonOrdenamiento = new JButton("Ordenamientos");
        botonOrdenamiento.addActionListener(e -> popup1.show(botonOrdenamiento, 0, botonOrdenamiento.getHeight()));

        botonOrdenamiento2 = new JButton("Ordenamientos");
        botonOrdenamiento2.addActionListener(e -> popup2.show(botonOrdenamiento2, 0, botonOrdenamiento2.getHeight()));

        botonOrdenamiento3 = new JButton("Ordenamientos");
        botonOrdenamiento3.addActionListener(e -> popup3.show(botonOrdenamiento3, 0, botonOrdenamiento3.getHeight()));

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

        botonOrdenamiento10 = new JButton("Ordenamientos");
        botonOrdenamiento10.addActionListener(e -> popup10.show(botonOrdenamiento10, 0, botonOrdenamiento10.getHeight()));

        botonOrdenamiento11 = new JButton("Ordenamientos");
        botonOrdenamiento11.addActionListener(e -> popup11.show(botonOrdenamiento11, 0, botonOrdenamiento11.getHeight()));

        botonOrdenamiento12 = new JButton("Ordenamientos");
        botonOrdenamiento12.addActionListener(e -> popup12.show(botonOrdenamiento12, 0, botonOrdenamiento12.getHeight()));

        String archivo = "C:\\Users\\bombo\\OneDrive\\Desktop\\Algoritmos\\Practica5_Ordenamientos\\src\\weatherHistory.csv";

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();
        panel10 = new JPanel();
        panel11 = new JPanel();
        panel12 = new JPanel();

        boton1 = new JButton("Ver grafica");
        boton2 = new JButton("Ver grafica");
        boton3 = new JButton("Ver grafica");
        boton4 = new JButton("Ver grafica");
        boton5 = new JButton("Ver grafica");
        boton6 = new JButton("Ver grafica");
        boton7 = new JButton("Ver grafica");
        boton8 = new JButton("Ver grafica");
        boton9 = new JButton("Ver grafica");
        boton10 = new JButton("Ver grafica");
        boton11 = new JButton("Ver grafica");
        boton12 = new JButton("Ver grafica");

        textoArchivo1 = new JTextArea(37, 10);
        textoArchivo1.setEditable(false);
        textoArchivo2 = new JTextArea(37, 10);
        textoArchivo2.setEditable(false);
        textoArchivo3 = new JTextArea(37, 10);
        textoArchivo3.setEditable(false);
        textoArchivo4 = new JTextArea(37, 10);
        textoArchivo4.setEditable(false);
        textoArchivo5 = new JTextArea(37, 10);
        textoArchivo5.setEditable(false);
        textoArchivo6 = new JTextArea(37, 10);
        textoArchivo6.setEditable(false);
        textoArchivo7 = new JTextArea(37, 10);
        textoArchivo7.setEditable(false);
        textoArchivo8 = new JTextArea(37, 10);
        textoArchivo8.setEditable(false);
        textoArchivo9 = new JTextArea(37, 10);
        textoArchivo9.setEditable(false);
        textoArchivo10 = new JTextArea(37, 10);
        textoArchivo10.setEditable(false);
        textoArchivo11 = new JTextArea(37, 10);
        textoArchivo11.setEditable(false);
        textoArchivo12 = new JTextArea(37, 10);
        textoArchivo12.setEditable(false);

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
        scroll5 = new JScrollPane(textoArchivo5);
        scroll5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll6 = new JScrollPane(textoArchivo6);
        scroll6.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll6.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll7 = new JScrollPane(textoArchivo7);
        scroll7.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll8 = new JScrollPane(textoArchivo8);
        scroll8.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll8.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll9 = new JScrollPane(textoArchivo9);
        scroll9.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll10 = new JScrollPane(textoArchivo10);
        scroll10.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll11 = new JScrollPane(textoArchivo11);
        scroll11.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll12 = new JScrollPane(textoArchivo12);
        scroll12.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        List<String[]> filas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(",");
                //filas.agregarDato(new Fila(valores[0], valores[1], valores[2], Double.parseDouble(valores[3]), Double.parseDouble(valores[4]), Double.parseDouble(valores[5]), Double.parseDouble(valores[6]), Double.parseDouble(valores[7]), Double.parseDouble(valores[8]), Double.parseDouble(valores[9]), Double.parseDouble(valores[10]), valores[11]););
                filas.add(valores);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (String[] i : filas) {
            textoArchivo1.append(i[0] + "\n");
            textoArchivo2.append(i[1] + "\n");
            textoArchivo3.append(i[2] + "\n");
            textoArchivo4.append(i[3] + "\n");
            textoArchivo5.append(i[4] + "\n");
            textoArchivo6.append(i[5] + "\n");
            textoArchivo7.append(i[6] + "\n");
            textoArchivo8.append(i[7] + "\n");
            textoArchivo9.append(i[8] + "\n");
            textoArchivo10.append(i[9] + "\n");
            textoArchivo11.append(i[10] + "\n");
            textoArchivo12.append(i[11] + "\n");
        }

        ArrayList<String> opcionesSeleccionadasOrde1 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde2 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde3 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde4 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde5 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde6 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde7 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde8 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde9 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde10 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde11 = new ArrayList<>();
        ArrayList<String> opcionesSeleccionadasOrde12 = new ArrayList<>();

        lista.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde1.clear();

                int[] selectedIndices = lista.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde1.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde1);
            }
        });

        lista2.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde2.clear();

                int[] selectedIndices = lista2.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde2.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde2);
            }
        });

        lista3.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde3.clear();

                int[] selectedIndices = lista3.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde3.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde3);
            }
        });

        lista4.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde4.clear();

                int[] selectedIndices = lista4.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde4.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde4);
            }
        });

        lista5.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde5.clear();

                int[] selectedIndices = lista5.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde5.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde5);
            }
        });

        lista6.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde6.clear();

                int[] selectedIndices = lista6.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde6.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde6);
            }
        });

        lista7.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde7.clear();

                int[] selectedIndices = lista7.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde7.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde7);
            }
        });

        lista8.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde8.clear();

                int[] selectedIndices = lista8.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde8.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde8);
            }
        });

        lista9.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde9.clear();

                int[] selectedIndices = lista9.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde9.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde9);
            }
        });

        lista10.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde10.clear();

                int[] selectedIndices = lista10.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde10.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde10);
            }
        });

        lista11.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde11.clear();

                int[] selectedIndices = lista11.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde11.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde11);
            }
        });

        lista12.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                opcionesSeleccionadasOrde12.clear();

                int[] selectedIndices = lista12.getSelectedIndices();

                for (int index : selectedIndices) {
                    opcionesSeleccionadasOrde12.add(opciones[index]);
                    System.out.println("Agregado: " + opciones[index]);
                }

                System.out.println("Opciones seleccionadas: " + opcionesSeleccionadasOrde12);
            }
        });

        boton1.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde1) {
                ordenarDatosString(filas, opcionSeleccionada, 0, x, textoArchivo1);
            }
        });

        boton2.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde2) {
                ordenarDatosString(filas, opcionSeleccionada, 1, x, textoArchivo2);
            }
        });

        boton3.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde3) {
                ordenarDatosString(filas, opcionSeleccionada, 2, x, textoArchivo3);
            }
        });

        boton4.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde4) {
                ordenarDatos(filas, opcionSeleccionada, 3, x, textoArchivo4);
            }
        });

        boton5.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde5) {
                ordenarDatos(filas, opcionSeleccionada, 4, x, textoArchivo5);
            }
        });

        boton6.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde6) {
                ordenarDatos(filas, opcionSeleccionada, 5, x, textoArchivo6);
            }
        });

        boton7.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde7) {
                ordenarDatos(filas, opcionSeleccionada, 6, x, textoArchivo7);
            }
        });

        boton8.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde8) {
                ordenarDatosString(filas, opcionSeleccionada, 7, x, textoArchivo8);
            }
        });

        boton9.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde9) {
                ordenarDatos(filas, opcionSeleccionada, 8, x, textoArchivo9);
            }
        });

        boton10.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde10) {
                ordenarDatos(filas, opcionSeleccionada, 9, x, textoArchivo10);
            }
        });

        boton11.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde11) {
                ordenarDatos(filas, opcionSeleccionada, 10, x, textoArchivo11);
            }
        });

        boton12.addActionListener(e -> {
            graficaDeTodo = new Graficar();
            for (String opcionSeleccionada : opcionesSeleccionadasOrde12) {
                ordenarDatosString(filas, opcionSeleccionada, 11, x, textoArchivo12);
            }
        });

        setTitle("Practica 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 12, 0, 5));
        setSize(1453, 723);
        setLocationRelativeTo(null);

        boton1.setFocusPainted(false);
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

        boton10.setFocusPainted(false);
        panel10.add(boton10);
        panel10.add(botonOrdenamiento10);
        panel10.add(scroll10);

        boton11.setFocusPainted(false);
        panel11.add(boton11);
        panel11.add(botonOrdenamiento11);
        panel11.add(scroll11);

        boton12.setFocusPainted(false);
        panel12.add(boton12);
        panel12.add(botonOrdenamiento12);
        panel12.add(scroll12);

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);
        add(panel7);
        add(panel8);
        add(panel9);
        add(panel10);
        add(panel11);
        add(panel12);
    }

    public void ordenarDatos(List<String[]> lista, String algoritmo, int columna, Ordenamientos x, JTextArea texto) {
        texto.setText("");

        switch (algoritmo) {
            case "Quick Sort":
            case "Merge Sort":
            case "Shell Sort":
            case "Seleccion Directa": {
                String[] datos1 = lista.stream().map(fila -> fila[columna]).toArray(String[]::new);
                Double[] datos = lista.stream().map(fila -> Double.parseDouble(fila[columna])).toArray(Double[]::new);
                switch (algoritmo){
                    case "Quick Sort":
                        long tiempoInicial1 = System.nanoTime();
                        x.recursivo(datos, 0, datos.length);
                        long tiempoFinal1 = System.nanoTime();
                        double tiempoEjecucion1 = (tiempoFinal1 - tiempoInicial1) / 1000000000.0;
                        System.out.println(tiempoEjecucion1);
                        double[] tiempoGraficar = new double[3];
                        tiempoGraficar[0] = 0.0;
                        tiempoGraficar[1] = tiempoEjecucion1;
                        tiempoGraficar[2] = tiempoEjecucion1;
                        graficaDeTodo.agregarLinea(tiempoGraficar, "Tiempo Quick Sort");
                        break;
                    case "Merge Sort":
                        long tiempoInicial2 = System.nanoTime();
                        x.sort(datos, 0, datos.length - 1);
                        long tiempoFinal2 = System.nanoTime();
                        double tiempoEjecucion2 = (tiempoFinal2 - tiempoInicial2) / 1000000000.0;
                        System.out.println(tiempoEjecucion2);
                        double[] tiempoGraficar2 = new double[3];
                        tiempoGraficar2[0] = 0.0;
                        tiempoGraficar2[1] = tiempoEjecucion2;
                        tiempoGraficar2[2] = tiempoEjecucion2;
                        graficaDeTodo.agregarLinea(tiempoGraficar2, "Tiempo Merge Sort");
                        break;
                    case "Shell Sort":
                        long tiempoInicial3 = System.nanoTime();
                        x.shell(datos, datos.length);
                        long tiempoFinal3 = System.nanoTime();
                        double tiempoEjecucion3 = (tiempoFinal3 - tiempoInicial3) / 1000000000.0;
                        System.out.println(tiempoEjecucion3);
                        double[] tiempoGraficar3 = new double[3];
                        tiempoGraficar3[0] = 0.0;
                        tiempoGraficar3[1] = tiempoEjecucion3;
                        tiempoGraficar3[2] = tiempoEjecucion3;
                        graficaDeTodo.agregarLinea(tiempoGraficar3, "Tiempo Shell Sort");
                        break;
                    case "Seleccion Directa":
                        long tiempoInicial4 = System.nanoTime();
                        x.seleccion(datos, datos.length);
                        long tiempoFinal4 = System.nanoTime();
                        double tiempoEjecucion4 = (tiempoFinal4 - tiempoInicial4) / 1000000000.0;
                        System.out.println(tiempoEjecucion4);
                        double[] tiempoGraficar4 = new double[3];
                        tiempoGraficar4[0] = 0.0;
                        tiempoGraficar4[1] = tiempoEjecucion4;
                        tiempoGraficar4[2] = tiempoEjecucion4;
                        graficaDeTodo.agregarLinea(tiempoGraficar4, "Tiempo Seleccion Directa");
                        break;
                }
                for (Double dato : datos) {
                    texto.append(dato.toString() + "\n");
                }
                break;
            }
            case "Radix Sort":
            case "Parallel Sort": {
                String[] datos = lista.stream().map(fila ->fila[columna]).toArray(String[]::new);
                if (algoritmo.equals("Radix Sort")) {
                    long tiempoInicial5 = System.nanoTime();
                    x.radixSortStrings(datos, datos.length);
                    long tiempoFinal5 = System.nanoTime();
                    double tiempoEjecucion5 = (tiempoFinal5 - tiempoInicial5) / 1000000000.0;
                    System.out.println(tiempoEjecucion5);
                    double[] tiempoGraficar5 = new double[3];
                    tiempoGraficar5[0] = 0.0;
                    tiempoGraficar5[1] = tiempoEjecucion5;
                    tiempoGraficar5[2] = tiempoEjecucion5;
                    graficaDeTodo.agregarLinea(tiempoGraficar5, "Tiempo Radix Sort");
                } else {
                    long tiempoInicial6 = System.nanoTime();
                    Arrays.parallelSort(datos);
                    long tiempoFinal6 = System.nanoTime();
                    double tiempoEjecucion6 = (tiempoFinal6 - tiempoInicial6) / 1000000000.0;
                    System.out.println(tiempoEjecucion6);
                    double[] tiempoGraficar6 = new double[3];
                    tiempoGraficar6[0] = 0.0;
                    tiempoGraficar6[1] = tiempoEjecucion6;
                    tiempoGraficar6[2] = tiempoEjecucion6;
                    graficaDeTodo.agregarLinea(tiempoGraficar6, "Tiempo Parallel Sort");
                }
                for(String dato : datos){
                    texto.append(dato + "\n");
                }
                break;
            }
            case "Sort": {
                List<String[]> filasOrdenadas = new ArrayList<>(lista);
                long tiempoInicial7 = System.nanoTime();
                filasOrdenadas.sort(Comparator.comparing(a -> a[columna]));
                long tiempoFinal7 = System.nanoTime();
                double tiempoEjecucion7 = (tiempoFinal7 - tiempoInicial7) / 1000000000.0;
                System.out.println(tiempoEjecucion7);
                double[] tiempoGraficar7 = new double[3];
                tiempoGraficar7[0] = 0.0;
                tiempoGraficar7[1] = tiempoEjecucion7;
                tiempoGraficar7[2] = tiempoEjecucion7;
                graficaDeTodo.agregarLinea(tiempoGraficar7, "Tiempo Sort");
                for (String[] fila : filasOrdenadas) {
                    texto.append(fila[columna] + "\n");
                }
                break;
            }
        }
    }

    public void ordenarDatosString(List<String[]> lista, String algoritmo, int columna, Ordenamientos x, JTextArea texto) {
        texto.setText("");

        switch (algoritmo) {
            case "Quick Sort":
            case "Merge Sort":
            case "Shell Sort":
            case "Seleccion Directa": {
                String[] datos = lista.stream().map(fila -> fila[columna]).toArray(String[]::new);
                switch (algoritmo){
                    case "Quick Sort":
                        long tiempoInicial1 = System.nanoTime();
                        x.recursivo(datos, 0, datos.length);
                        long tiempoFinal1 = System.nanoTime();
                        double tiempoEjecucion1 = (tiempoFinal1 - tiempoInicial1) / 1000000000.0;
                        System.out.println(tiempoEjecucion1);
                        double[] tiempoGraficar = new double[3];
                        tiempoGraficar[0] = 0.0;
                        tiempoGraficar[1] = tiempoEjecucion1;
                        tiempoGraficar[2] = tiempoEjecucion1;
                        graficaDeTodo.agregarLinea(tiempoGraficar, "Tiempo Quick Sort");
                        break;
                    case "Merge Sort":
                        long tiempoInicial2 = System.nanoTime();
                        x.sort(datos, 0, datos.length - 1);
                        long tiempoFinal2 = System.nanoTime();
                        double tiempoEjecucion2 = (tiempoFinal2 - tiempoInicial2) / 1000000000.0;
                        System.out.println(tiempoEjecucion2);
                        double[] tiempoGraficar2 = new double[3];
                        tiempoGraficar2[0] = 0.0;
                        tiempoGraficar2[1] = tiempoEjecucion2;
                        tiempoGraficar2[2] = tiempoEjecucion2;
                        graficaDeTodo.agregarLinea(tiempoGraficar2, "Tiempo Merge Sort");
                        break;
                    case "Shell Sort":
                        long tiempoInicial3 = System.nanoTime();
                        x.shell(datos, datos.length);
                        long tiempoFinal3 = System.nanoTime();
                        double tiempoEjecucion3 = (tiempoFinal3 - tiempoInicial3) / 1000000000.0;
                        System.out.println(tiempoEjecucion3);
                        double[] tiempoGraficar3 = new double[3];
                        tiempoGraficar3[0] = 0.0;
                        tiempoGraficar3[1] = tiempoEjecucion3;
                        tiempoGraficar3[2] = tiempoEjecucion3;
                        graficaDeTodo.agregarLinea(tiempoGraficar3, "Tiempo Shell Sort");
                        break;
                    case "Seleccion Directa":
                        long tiempoInicial4 = System.nanoTime();
                        x.seleccion(datos, datos.length);
                        long tiempoFinal4 = System.nanoTime();
                        double tiempoEjecucion4 = (tiempoFinal4 - tiempoInicial4) / 1000000000.0;
                        System.out.println(tiempoEjecucion4);
                        double[] tiempoGraficar4 = new double[3];
                        tiempoGraficar4[0] = 0.0;
                        tiempoGraficar4[1] = tiempoEjecucion4;
                        tiempoGraficar4[2] = tiempoEjecucion4;
                        graficaDeTodo.agregarLinea(tiempoGraficar4, "Tiempo Seleccion Directa");
                        break;
                }
                for (String dato : datos) {
                    texto.append(dato + "\n");
                }
                break;
            }
            case "Radix Sort":
            case "Parallel Sort": {
                String[] datos = lista.stream().map(fila ->fila[columna]).toArray(String[]::new);
                if (algoritmo.equals("Radix Sort")) {
                    long tiempoInicial5 = System.nanoTime();
                    x.radixSortStrings(datos, datos.length);
                    long tiempoFinal5 = System.nanoTime();
                    double tiempoEjecucion5 = (tiempoFinal5 - tiempoInicial5) / 1000000000.0;
                    System.out.println(tiempoEjecucion5);
                    double[] tiempoGraficar5 = new double[3];
                    tiempoGraficar5[0] = 0.0;
                    tiempoGraficar5[1] = tiempoEjecucion5;
                    tiempoGraficar5[2] = tiempoEjecucion5;
                    graficaDeTodo.agregarLinea(tiempoGraficar5, "Tiempo Radix Sort");
                } else {
                    long tiempoInicial6 = System.nanoTime();
                    Arrays.parallelSort(datos);
                    long tiempoFinal6 = System.nanoTime();
                    double tiempoEjecucion6 = (tiempoFinal6 - tiempoInicial6) / 1000000000.0;
                    System.out.println(tiempoEjecucion6);
                    double[] tiempoGraficar6 = new double[3];
                    tiempoGraficar6[0] = 0.0;
                    tiempoGraficar6[1] = tiempoEjecucion6;
                    tiempoGraficar6[2] = tiempoEjecucion6;
                    graficaDeTodo.agregarLinea(tiempoGraficar6, "Tiempo Parallel Sort");
                }
                for(String dato : datos){
                    texto.append(dato + "\n");
                }
                break;
            }
            case "Sort": {
                List<String[]> filasOrdenadas = new ArrayList<>(lista);
                long tiempoInicial7 = System.nanoTime();
                filasOrdenadas.sort(Comparator.comparing(a -> a[columna]));
                long tiempoFinal7 = System.nanoTime();
                double tiempoEjecucion7 = (tiempoFinal7 - tiempoInicial7) / 1000000000.0;
                System.out.println(tiempoEjecucion7);
                double[] tiempoGraficar7 = new double[3];
                tiempoGraficar7[0] = 0.0;
                tiempoGraficar7[1] = tiempoEjecucion7;
                tiempoGraficar7[2] = tiempoEjecucion7;
                graficaDeTodo.agregarLinea(tiempoGraficar7, "Tiempo Sort");
                for (String[] fila : filasOrdenadas) {
                    texto.append(fila[columna] + "\n");
                }
                break;
            }
        }
    }
}