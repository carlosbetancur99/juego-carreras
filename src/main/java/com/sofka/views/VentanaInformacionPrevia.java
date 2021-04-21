package com.sofka.views;

import com.sofka.models.Carro;
import com.sofka.models.Conductor;
import com.sofka.models.Pista;
import com.sofka.usecase.GenerarPistaUseCase;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VentanaInformacionPrevia extends javax.swing.JFrame {

     private Pista pista;
     private DefaultTableModel diseñoTable;
     private List<Carro> carro = new ArrayList<>();
    
    public VentanaInformacionPrevia(Integer carriles) {

        initComponents();
        this.crearTabla();
        this.agregraDatos();
       //mostrar la pista y sus carriles
       pista = GenerarPistaUseCase.generarPista(carriles);        
       lblNombrePista.setText(pista.getNombrePista());   
       lblNumCarriles.setText(String.valueOf(pista.getCarriles().size()));
       lblDistancia.setText(pista.getLONGITUD_KM().toString() );
 
        
    }
    
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblNombrePista = new javax.swing.JLabel();
        lblNumCarriles = new javax.swing.JLabel();
        lblDistancia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInformacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Informacion de la Carrera");

        jLabel5.setText("Nombre de la pista");

        jLabel6.setText("Numero carriles");

        jLabel7.setText("Distancia Km");

        jButton1.setText("Iniciar Carrera");

        lblNombrePista.setText("jLabel1");

        lblNumCarriles.setText("jLabel1");

        lblDistancia.setText("jLabel1");

        tableInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableInformacion.setEnabled(false);
        jScrollPane1.setViewportView(tableInformacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(lblNombrePista))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lblNumCarriles))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDistancia)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePista)
                    .addComponent(lblNumCarriles)
                    .addComponent(lblDistancia))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void crearTabla(){
        this.diseñoTable = new DefaultTableModel(){
             @Override
            public boolean isCellEditable(int rows, int colunms){
                return false;
            }
        };
        
        String [] tablaTitulos = new String[]{"Jugador", "Carro", "Carril"};
        this.diseñoTable.setColumnIdentifiers(tablaTitulos);
        this.tableInformacion.setModel(diseñoTable);
        this.tableInformacion.setForeground(new Color(3,69,102));
        
    }
    
    public void agregraDatos(){
        
            

            for (int i = 1; i <= 4; i++) {
                VentanaDialogRegistro ventanadialogRegistro = new VentanaDialogRegistro(this, true,i);
                ventanadialogRegistro.setVisible(Boolean.TRUE);
                this.setVisible(Boolean.FALSE);
                

                carro.add(new Carro(
                        ventanadialogRegistro.getNombreCarro(),
                        ventanadialogRegistro.getMarcaCarro(),
                        new Conductor(ventanadialogRegistro.getNombreJugador())));
              
            }
            
            
            
            String algo = carro.get(0).toString();
            System.out.println(algo);
            
            //carro.forEach((n)-> System.out.println(n));
   
            for(Carro carros : carro){
               this.diseñoTable.addRow(new Object[]{
                 
               });
                
            }
           
            
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblNombrePista;
    private javax.swing.JLabel lblNumCarriles;
    private javax.swing.JTable tableInformacion;
    // End of variables declaration//GEN-END:variables
}
