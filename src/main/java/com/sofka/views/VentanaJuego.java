package com.sofka.views;

import com.sofka.models.Carril;
import com.sofka.models.Carro;
import com.sofka.models.Conductor;
import com.sofka.models.Pista;

import javax.swing.table.DefaultTableModel;

public class VentanaJuego extends javax.swing.JFrame {

    private Pista pista;
    private Carril carrilActual;
    private DefaultTableModel diseñoTable;
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
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comienza Carrera");

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

        lblCarrilJugador.setText("s");

        jLabel3.setText("Carril Jugador");

        jLabel4.setText("ValorDado:");

        lblValorDado.setText("Valor:");

        jLabel5.setText("Distancia a Recorrer:");

        lblDistanciaARecorrer.setText("0");

        lblDistanciaARecorrer1.setText("Mts");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("La carrera ha comenzado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLanzarDado)
                                        .addGap(145, 145, 145))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombreJugador)
                                .addGap(98, 98, 98)
                                .addComponent(lblCarrilJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorDado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDistanciaARecorrer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDistanciaARecorrer1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1)))
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblCarrilJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(lblValorDado)
                            .addComponent(jLabel5)
                            .addComponent(lblDistanciaARecorrer)
                            .addComponent(lblDistanciaARecorrer1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreJugador)))
                .addGap(18, 18, 18)
                .addComponent(btnLanzarDado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 181, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLanzarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarDadoActionPerformed

        Integer valorDado = conductorActual.getDado().lanzar();
        Integer distancia = valorDado * 100;
        lblValorDado.setText(valorDado.toString());
        lblDistanciaARecorrer.setText(distancia.toString());
        
        
        
        
//        this.diseñoTable.addRow(new Object[]{
//            pista.getCarriles().get(0).getCarro().getNombre(), distancia
//        });



    }//GEN-LAST:event_btnLanzarDadoActionPerformed


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
    private javax.swing.JLabel jLabel6;
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
