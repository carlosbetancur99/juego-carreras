package com.sofka.views;

import com.sofka.models.Carril;
import com.sofka.models.Carro;
import com.sofka.models.Conductor;
import com.sofka.models.Pista;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;

public class VentanaJuego extends javax.swing.JFrame {

    private Pista pista;
    private Carril carrilActual;
    private Carro carroActual;
    private DefaultTableModel diseñoTable;
    private Integer numero = 0;
    private Conductor conductorActual;

    public VentanaJuego(Pista pPista) {
        initComponents();
        this.crearTabla();
        this.pista = pPista;        
        conductorActual = elegirPrimerConductor(pPista);        
    }

    private void crearTabla() {
        this.diseñoTable = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rows, int colunms) {
                return false;
            }
        };

        String[] tablaTitulos = new String[]{"Carro", "Distancia recorrida"};
        this.diseñoTable.setColumnIdentifiers(tablaTitulos);
        this.tableJuego.setModel(diseñoTable);

    }
    
    private Conductor elegirPrimerConductor(Pista pPista){
        return pPista.getCarriles()
                .stream()
                .findFirst()
                .map(carril -> {
                    conductorActual = carril.getCarro().getConductor();
                    carrilActual = carril;
                    lblNombreJugador.setText(conductorActual.getNombre());                    
                    lblCarrilJugador.setText(carril.getNumeroCarril().toString());                    
                    conductorActual.setTurno(Boolean.TRUE);                      
                    carrilActual.getCarro().setConductor(conductorActual); 
                    actualizarPistaCarril();
                    return conductorActual;
                        })
                .orElse(null);
    }
    
    private void actualizarPistaCarril(){
        for (int i = 0; i < pista.getCarriles().size(); i++) {            
            Carril jh = pista.getCarriles().get(i);            
            if(jh.getNumeroCarril().equals(carrilActual.getNumeroCarril())){
                pista.getCarriles().set(i, carrilActual);
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLanzarDado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJuego = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblNombreJugador = new javax.swing.JLabel();
        lblCarrilJugador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblValorDado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDistanciaARecorrer = new javax.swing.JLabel();
        lblDistanciaARecorrer1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLanzarDado.setText("Lanzar Dado");
        btnLanzarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarDadoActionPerformed(evt);
            }
        });

        tableJuego.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableJuego);

        jLabel1.setText("Ganadores");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("3");

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setText("1");

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton3.setText("2");

        jLabel2.setText("Nombre Jugador");

        lblNombreJugador.setText("Valor:");

        lblCarrilJugador.setText("Nombre Jugador");

        jLabel3.setText("Carril Jugador");

        jLabel4.setText("Valor:");

        lblValorDado.setText("Valor:");

        jLabel5.setText("Distancia a Recorrer:");

        lblDistanciaARecorrer.setText("0");

        lblDistanciaARecorrer1.setText("Mts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblNombreJugador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblCarrilJugador))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLanzarDado)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblValorDado)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblDistanciaARecorrer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDistanciaARecorrer1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLanzarDado)
                    .addComponent(lblValorDado)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDistanciaARecorrer)
                        .addComponent(jLabel5)
                        .addComponent(lblDistanciaARecorrer1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarrilJugador)
                            .addComponent(lblNombreJugador))))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 141, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLanzarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarDadoActionPerformed

        Integer valorDado = conductorActual.getDado().lanzar();
        Integer distancia = valorDado * 100;
        lblValorDado.setText(valorDado.toString());
        lblDistanciaARecorrer.setText(distancia.toString());
        
        
        
        
//        this.diseñoTable.addRow(new Object[]{
//            pista.getCarriles().get(numero).getCarro().getNombre(), 5
//        });
//
//        this.generarPodio();

    }//GEN-LAST:event_btnLanzarDadoActionPerformed

    private void generarPodio() {
        

      


                
       

        
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLanzarDado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCarrilJugador;
    private javax.swing.JLabel lblDistanciaARecorrer;
    private javax.swing.JLabel lblDistanciaARecorrer1;
    private javax.swing.JLabel lblNombreJugador;
    private javax.swing.JLabel lblValorDado;
    private javax.swing.JTable tableJuego;
    // End of variables declaration//GEN-END:variables
}
