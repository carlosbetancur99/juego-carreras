package com.sofka.views;

import com.sofka.models.Carro;
import com.sofka.models.Conductor;
import com.sofka.models.Pista;
import com.sofka.usecase.AgregarCarroACarrilUseCase;
import com.sofka.usecase.GenerarPistaUseCase;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VentanaInformacionPrevia extends javax.swing.JFrame {

    private Pista pista;
    private DefaultTableModel diseñoTable;
    private Integer numCarriles;
    private List<Carro> carros = new ArrayList<>();
    public VentanaJuego vF;

    public VentanaInformacionPrevia(Integer carriles) {

        this.numCarriles = carriles;
        initComponents();
        pista = GenerarPistaUseCase.generarPista(carriles);
        this.crearTabla();
        this.agregraDatos();
        //mostrar la pista y sus carriles

        lblNombrePista.setText(pista.getNombrePista());
        lblNumCarriles.setText(String.valueOf(pista.getCarriles().size()));
        lblDistancia.setText(pista.getLONGITUD_KM().toString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnIniciarCarrera = new javax.swing.JButton();
        lblNombrePista = new javax.swing.JLabel();
        lblNumCarriles = new javax.swing.JLabel();
        lblDistancia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInformacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Informacion de la Carrera");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nombre de la pista: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Numero carriles:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Distancia Km: ");

        btnIniciarCarrera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIniciarCarrera.setText("Iniciar Carrera");
        btnIniciarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarCarreraActionPerformed(evt);
            }
        });

        lblNombrePista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombrePista.setText("jLabel1");

        lblNumCarriles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumCarriles.setText("jLabel1");

        lblDistancia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombrePista, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDistancia))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumCarriles, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(btnIniciarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblNombrePista, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblNumCarriles, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnIniciarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarCarreraActionPerformed
        vF.setVisible(Boolean.TRUE);
        this.setVisible(Boolean.FALSE);
        
        
    }//GEN-LAST:event_btnIniciarCarreraActionPerformed

    private void crearTabla() {
        this.diseñoTable = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rows, int colunms) {
                return false;
            }
        };

        String[] tablaTitulos = new String[]{"Conductor", "Carro", "Carril"};
        this.diseñoTable.setColumnIdentifiers(tablaTitulos);
        this.tableInformacion.setModel(diseñoTable);

    }

    public void agregraDatos() {
        for (int i = 1; i <= numCarriles; i++) {
            VentanaDialogRegistro ventanadialogRegistro = new VentanaDialogRegistro(this, true, i);
            ventanadialogRegistro.setVisible(Boolean.TRUE);
            this.setVisible(Boolean.FALSE);

            carros.add(new Carro(
                    ventanadialogRegistro.getNombreCarro(),
                    ventanadialogRegistro.getMarcaCarro(),
                    new Conductor(ventanadialogRegistro.getNombreJugador())));
        }

        pista = AgregarCarroACarrilUseCase.agregarCarrosACarriles(pista, carros);

        pista.getCarriles().forEach(carril -> {
            this.diseñoTable.addRow(new Object[]{
                carril.getCarro().getConductor().getNombre(), carril.getCarro().getNombre(), carril.getNumeroCarril()
            });
        });
        
        vF= new VentanaJuego(pista);
        

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarCarrera;
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
