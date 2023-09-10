package Pantallas;


import Clases.Persona;
import java.util.Random;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class VentanaContactosRegistrados extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private final List<Persona> listaPersonas = new ArrayList<>();
    private final DefaultTableModel tblModel;
    private final Random random = new Random();

 
    public VentanaContactosRegistrados() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registros guardados");
        cargarModelo();
         tblModel = (DefaultTableModel) tablaRegistros.getModel();
         
         

         
         
         
         
       


         
        Persona persona1 = new Persona("Hector", "Bad Bunny", "31157344", "Amorfoda", "Calladita", "Efecto", "Negro", "1");
        Persona persona2 = new Persona("Maria", "Shakira", "42218956", "Waka Waka", "La Tortura", "Hips Don't Lie", "Amarillo", "2");
        Persona persona3 = new Persona("Carlos", "The Beatles", "53327478", "Hey Jude", "Let It Be", "Blackbird", "Azul", "3");
        Persona persona4 = new Persona("Luisa", "Adele", "64430988", "Someone Like You", "Rolling in the Deep", "Hello", "Verde", "4");
        Persona persona5 = new Persona("Pedro", "Eminem", "75543590", "Lose Yourself", "Stan", "Love the Way", "Blaco", "5");
        Persona persona6 = new Persona("Ana", "Beyoncé", "86653412", "Single Ladies", "Halo", "Crazy in Love", "Rosa", "6");
        Persona persona7 = new Persona("Miguel", "Michael Jackson", "97765432", "Billie Jean", "Thriller", "Beat It", "Morado", "7");
        Persona persona8 = new Persona("Sofía", "Taylor Swift", "08876543", "Love Story", "Blank Space", "Shake It Off", "Gris", "8");
        Persona persona9 = new Persona("Javier", "Queen", "09987654", "Bohemian Rhapsody", "Another One Bites the Dust", "We Will Rock You", "Azul Claro", "9");
        Persona persona10 = new Persona("Isabella", "Ariana Grande", "10109876", "Thank U, Next", "7 Rings", "No Tears Left to Cry", "Turquesa", "10");
        Persona persona11 = new Persona("Diego", "Bruno Mars", "11234567", "Uptown Funk", "Just the Way You Are", "Locked Out of Heaven", "Rojo Oscuro", "11");
        Persona persona12 = new Persona("Laura", "Rihanna", "12345678", "Umbrella", "Diamonds", "We Found Love", "Amarillo Claro", "12");
        Persona persona13 = new Persona("Andrés", "Coldplay", "23456789", "Viva la Vida", "Fix You", "Yellow", "Verde Claro", "13");
        Persona persona14 = new Persona("Valentina", "Ed Sheeran", "34567890", "Shape of You", "Thinking Out Loud", "Photograph", "Naranja Claro", "14");
        Persona persona15 = new Persona("Alejandro", "Justin Bieber", "45678901", "Sorry", "Love Yourself", "Baby", "Rosa", "15");
        Persona persona16 = new Persona("Camila", "Katy Perry", "56789012", "Firework", "Roar", "Teenage Dream", "Azul Marino", "16");
        Persona persona17 = new Persona("Lucas", "Elton John", "67890123", "Rocket Man", "Your Song", "Tiny Dancer", "Violeta", "17");
        Persona persona18 = new Persona("Paula", "Whitney Houston", "78901234", "I Will Always Love You", "Greatest Love of All", "I Wanna Dance with Somebody", "Rosa Oscuro", "18");
        Persona persona19 = new Persona("Daniel", "Elvis Presley", "89012345", "Can't Help Falling in Love", "Jailhouse Rock", "Love Me Tender", "Azul Real", "19");
        Persona persona20 = new Persona("Valeria", "Madonna", "90123456", "Like a Prayer", "Material Girl", "Vogue", "Plateado", "20");
        Persona persona21 = new Persona("Gustavo", "Prince", "01234567", "Purple Rain", "When Doves Cry", "Kiss", "Lila", "21");
        Persona persona22 = new Persona("Carmen", "U2", "12345678", "With or Without You", "Beautiful Day", "Sunday Bloody Sunday", "Dorado", "22");
        Persona persona23 = new Persona("Carlos", "Pink Floyd", "23456789", "Comfortably Numb", "Wish You Were Here", "Another Brick in the Wall", "Gris Oscuro", "23");
        Persona persona24 = new Persona("Elena", "Bruce Springsteen", "34567890", "Born to Run", "Dancing in the Dark", "The River", "Rojo Claro", "24");
        Persona persona25 = new Persona("Pablo", "Bee Gees", "45678901", "Stayin' Alive", "How Deep Is Your Love", "Night Fever", "Amarillo Oscuro", "25");
        Persona persona26 = new Persona("Alicia", "David Bowie", "56789012", "Heroes", "Space Oddity", "Let's Dance", "Azul Claro", "26");
        Persona persona27 = new Persona("Raúl", "The Rolling Stones", "67890123", "Paint It Black", "Angie", "Sympathy for the Devil", "Verde Oscuro", "27");
        Persona persona28 = new Persona("Marta", "Bob Dylan", "78901234", "Like a Rolling Stone", "Blowin' in the Wind", "The Times They Are A-Changin'", "Naranja Oscuro", "28");
        Persona persona29 = new Persona("Felipe", "Bob Marley", "89012345", "No Woman, No Cry", "Three Little Birds", "Redemption Song", "Marrón", "29");
        Persona persona30 = new Persona("Marina", "Nirvana", "90123456", "Smells Like Teen Spirit", "Come as You Are", "Lithium", "Gris Claro", "30");
        Persona persona31 = new Persona("Eduardo", "Radiohead", "01234567", "Creep", "Karma Police", "No Surprises", "Rosa Claro", "31");
        Persona persona32 = new Persona("Carolina", "Led Zeppelin", "12345678", "Stairway to Heaven", "Whole Lotta Love", "Immigrant Song", "Azul Eléctrico", "32");
        Persona persona33 = new Persona("Juan", "Metallica", "23456789", "Enter Sandman", "Nothing Else Matters", "Master of Puppets", "Plateado Oscuro", "33");
        Persona persona34 = new Persona("Isabel", "Guns N' Roses", "34567890", "Sweet Child o' Mine", "November Rain", "Welcome to the Jungle", "Rojo Intenso", "34");
        Persona persona35 = new Persona("Andrea", "The Eagles", "45678901", "Hotel California", "Take It Easy", "Desperado", "Amarillo Intenso", "35");
        Persona persona36 = new Persona("Fernando", "Pink", "56789012", "What About Us", "Just Give Me a Reason", "So What", "Rosa Intenso", "36");
        Persona persona37 = new Persona("Laura", "The Who", "67890123", "Baba O'Riley", "My Generation", "Pinball Wizard", "Verde Intenso", "37");
        Persona persona38 = new Persona("Antonio", "Red Hot Chili Peppers", "78901234", "Under the Bridge", "Californication", "Scar Tissue", "Naranja Intenso", "38");
        Persona persona39 = new Persona("Sara", "Elvis Costello", "89012345", "Alison", "Everyday I Write the Book", "Oliver's Army", "Magenta", "39");
        Persona persona40 = new Persona("Diego", "Stevie Wonder", "90123456", "Superstition", "Isn't She Lovely", "I Just Called to Say I Love You", "Amarillo Brillante", "40");
        Persona persona41 = new Persona("Mónica", "John Lennon", "12345678", "Imagine", "Woman", "Give Peace a Chance", "Azul Profundo", "41");
        Persona persona42 = new Persona("Javier", "The Police", "23456789", "Every Breath You Take", "Roxanne", "Message in a Bottle", "Verde Esmeralda", "42");
        Persona persona43 = new Persona("Lucía", "Bryan Adams", "34567890", "Summer of '69", "Everything I Do", "Heaven", "Rosa Suave", "43");
        Persona persona44 = new Persona("Felipe", "The Doors", "45678901", "Light My Fire", "Riders on the Storm", "Break On Through", "Azul Brillante", "44");
        Persona persona45 = new Persona("Valentina", "The Supremes", "56789012", "Baby Love", "Stop! In the Name of Love", "You Can't Hurry Love", "Rojo Profundo", "45");
        Persona persona46 = new Persona("Camilo", "Janet Jackson", "67890123", "Together Again", "That's the Way Love Goes", "Nasty", "Amarillo Suave", "46");
        Persona persona47 = new Persona("Lorena", "Bee Gees", "78901234", "How Deep Is Your Love", "Stayin' Alive", "Night Fever", "Verde Brillante", "47");
        Persona persona48 = new Persona("Pablo", "Elvis Presley", "89012345", "Can't Help Falling in Love", "Love Me Tender", "Jailhouse Rock", "Azul Real", "48");
        Persona persona49 = new Persona("Claudia", "ABBA", "90123456", "Dancing Queen", "Mamma Mia", "Take a Chance on Me", "Rosa Pálido", "49");
        Persona persona50 = new Persona("Marcos", "Elton John", "01234567", "Your Song", "Rocket Man", "Tiny Dancer", "Amarillo Pastel", "50");

        // Agregar las personas a la lista
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        listaPersonas.add(persona6);
        listaPersonas.add(persona7);
        listaPersonas.add(persona8);
        listaPersonas.add(persona9);
        listaPersonas.add(persona10);
        listaPersonas.add(persona11);
        listaPersonas.add(persona12);
        listaPersonas.add(persona13);
        listaPersonas.add(persona14);
        listaPersonas.add(persona15);
        listaPersonas.add(persona16);
        listaPersonas.add(persona17);
        listaPersonas.add(persona18);
        listaPersonas.add(persona19);
        listaPersonas.add(persona20);
        listaPersonas.add(persona21);
        listaPersonas.add(persona22);
        listaPersonas.add(persona23);
        listaPersonas.add(persona24);
        listaPersonas.add(persona25);
        listaPersonas.add(persona26);
        listaPersonas.add(persona27);
        listaPersonas.add(persona28);
        listaPersonas.add(persona29);
        listaPersonas.add(persona30);
        listaPersonas.add(persona31);
        listaPersonas.add(persona32);
        listaPersonas.add(persona33);
        listaPersonas.add(persona34);
        listaPersonas.add(persona35);
        listaPersonas.add(persona36);
        listaPersonas.add(persona37);
        listaPersonas.add(persona38);
        listaPersonas.add(persona39);
        listaPersonas.add(persona40);
        listaPersonas.add(persona41);
        listaPersonas.add(persona42);
        listaPersonas.add(persona43);
        listaPersonas.add(persona44);
        listaPersonas.add(persona45);
        listaPersonas.add(persona46);
        listaPersonas.add(persona47);
        listaPersonas.add(persona48);
        listaPersonas.add(persona49);
        listaPersonas.add(persona50);

        cargarTabla();

    }

    private void cargarTabla() {
        
        while (tblModel.getRowCount() > 0) {
        tblModel.removeRow(0);
    }
        for (Persona persona : listaPersonas) {
            modelo.addRow(new String[]{persona.getNombre(), persona.getArstirta(), persona.getTelefono(), persona.getCanciones1(), persona.getCanciones2(), persona.getCanciones3(), persona.getColor(), persona.getBoleta()});

        }

    }

    private void cargarModelo() {
        try {

            modelo.addColumn("Nombre");
            modelo.addColumn("Artitas");
            modelo.addColumn("Telefono");
            modelo.addColumn("Canciones1");
            modelo.addColumn("Canciones2");
            modelo.addColumn("Canciones3");
            modelo.addColumn("Color");
            modelo.addColumn("N°Boleta");
            tablaRegistros.setModel(modelo);
            cargarArchivo();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void cargarArchivo() throws IOException {
        String fila[];

        try {

            FileReader archivo = new FileReader("AgendaContactos.txt");
            BufferedReader lectura = new BufferedReader(archivo);

            String linea = lectura.readLine();

            while (linea != null) {
                fila = linea.split("%");
                modelo.addRow(fila);
                linea = lectura.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        LISTAREGISTRADOS = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();
        botonAtras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Actulizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jxtFiltro = new javax.swing.JTextField();
        ClikSorteo = new javax.swing.JButton();
        Sorteo = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LISTAREGISTRADOS.setBackground(new java.awt.Color(255, 102, 0));
        LISTAREGISTRADOS.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("Ganador");

        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Artista", "Canciones", "Boleta", "Color"
            }
        ));
        jScrollPane1.setViewportView(tablaRegistros);

        botonAtras.setText("Atras");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Actulizar.setText("Actulizar");
        Actulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActulizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar");

        jxtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxtFiltroActionPerformed(evt);
            }
        });
        jxtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jxtFiltroKeyTyped(evt);
            }
        });

        ClikSorteo.setText("Realizar Sorteo");
        ClikSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClikSorteoActionPerformed(evt);
            }
        });

        Sorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SorteoActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel4.setText("Registros guardados");

        jLabel5.setText("Color :");

        jLabel6.setText("Nombre:");

        jLabel7.setText("N° Boleta :");

        jLabel8.setText("Telefono:");

        jButton1.setText("Nuevo Usurio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LISTAREGISTRADOSLayout = new javax.swing.GroupLayout(LISTAREGISTRADOS);
        LISTAREGISTRADOS.setLayout(LISTAREGISTRADOSLayout);
        LISTAREGISTRADOSLayout.setHorizontalGroup(
            LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LISTAREGISTRADOSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LISTAREGISTRADOSLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3)
                            .addComponent(Sorteo)
                            .addComponent(jTextField2))
                        .addGap(1272, 1272, 1272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LISTAREGISTRADOSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LISTAREGISTRADOSLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(150, 150, 150))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LISTAREGISTRADOSLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ClikSorteo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Modificar)
                        .addGap(18, 18, 18)
                        .addComponent(Actulizar)
                        .addGap(257, 257, 257))))
            .addGroup(LISTAREGISTRADOSLayout.createSequentialGroup()
                .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LISTAREGISTRADOSLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LISTAREGISTRADOSLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LISTAREGISTRADOSLayout.createSequentialGroup()
                        .addGap(697, 697, 697)
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LISTAREGISTRADOSLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 257, Short.MAX_VALUE))
        );
        LISTAREGISTRADOSLayout.setVerticalGroup(
            LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LISTAREGISTRADOSLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClikSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Actulizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(LISTAREGISTRADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LISTAREGISTRADOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LISTAREGISTRADOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
       Lovi Lv = new Lovi() ;
       Lv.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Lovi lv = new Lovi();
        lv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if (tablaRegistros.getSelectedRowCount() != 1) {
            return;
        }
        int fila = tablaRegistros.getSelectedRow();
        tblModel.removeRow(fila);


    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed


    }//GEN-LAST:event_ModificarActionPerformed

    private void ActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActulizarActionPerformed

       // Limpiar los campos de texto
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    Sorteo.setText("");

    
    tablaRegistros.clearSelection();


    }//GEN-LAST:event_ActulizarActionPerformed
     

    private void jxtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jxtFiltroKeyTyped
   
    }



public void VentanaContactosRegistrados() {
    // ... (rest of your code)

    // Create and set the TableRowSorter
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblModel);
    tablaRegistros.setRowSorter(trs);

                
    }//GEN-LAST:event_jxtFiltroKeyTyped

    private void jxtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxtFiltroActionPerformed

 
        
         String filtro = jxtFiltro.getText().toLowerCase(); 

    TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(modelo);
    tablaRegistros.setRowSorter(rowSorter);

    if (filtro.trim().length() == 0) {
      
        rowSorter.setRowFilter(null);
    } else {
    
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + filtro)); 
    }

        
        
      
        
        
        

    }//GEN-LAST:event_jxtFiltroActionPerformed

    private void ClikSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClikSorteoActionPerformed
      
                                    
    
    int indiceAleatorio = random.nextInt(listaPersonas.size());

    
    Persona personaAleatoria = listaPersonas.get(indiceAleatorio);
    jTextField1.setText(personaAleatoria.getNombre());
       jTextField3.setText(personaAleatoria.getColor());

   Sorteo.setText(personaAleatoria.getBoleta());
   jTextField2.setText(personaAleatoria.getTelefono());
   
   


        
        
        
    }//GEN-LAST:event_ClikSorteoActionPerformed

    private void SorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SorteoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SorteoActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaRegistros registros = new VentanaRegistros();
        registros.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaContactosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaContactosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaContactosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaContactosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaContactosRegistrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actulizar;
    private javax.swing.JButton ClikSorteo;
    private javax.swing.JButton Eliminar;
    private javax.swing.JPanel LISTAREGISTRADOS;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Sorteo;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jxtFiltro;
    private javax.swing.JTable tablaRegistros;
    // End of variables declaration//GEN-END:variables
}
