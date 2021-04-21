package com.sofka.views;

import javax.swing.JOptionPane;

public class VentanaDialogRegistro extends javax.swing.JDialog {

    private String nombreJugador;
    private String nombreCarro;
    private String marcaCarro;

    public VentanaDialogRegistro(java.awt.Frame parent, boolean modal,Integer numeroJugador) {
        super(parent, modal);
     
        initComponents();
        this.lblNumeroJugador.setText(numeroJugador.toString());
        
        //por defecto(prueba)
        this.txtNombreJugador.setText("jugador");
        this.txtNombreCarro.setText("carro");
        this.txtMarcaCarro.setText("mazda");
        
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getNombreCarro() {
        return nombreCarro;
    }

    public void setNombreCarro(String nombreCarro) {
        this.nombreCarro = nombreCarro;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }
    
    private boolean validarCuadrosTexto(){
        
        if(this.txtNombreJugador.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Ingresa un nombre al conductor");
            return false;
        }
         if(this.txtNombreCarro.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Indica cual es el nombre del carro");
            return false;
        }
          if(this.txtMarcaCarro.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Indica cual es la marca del Carro");
            return false;
        }
        
        return true;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        txtNombreJugador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCarro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarcaCarro = new javax.swing.JTextField();
        lblNombreJugador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNumeroJugador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuraciones de Juego");
        setResizable(false);

        jLabel1.setText("Nombre Conductor");

        btnCrear.setText("Crear Jugador");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Carro");

        jLabel3.setText("Marca Carro");

        lblNombreJugador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreJugador.setText("Jugador No: ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Configuracion de la Carrera");

        lblNumeroJugador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumeroJugador.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtMarcaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumeroJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroJugador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMarcaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
      
       if(this.validarCuadrosTexto()){
            this.marcaCarro = txtMarcaCarro.getText();
            this.nombreCarro = txtNombreCarro.getText();
            this.nombreJugador = txtNombreJugador.getText();
             this.dispose();
       }
             
    }//GEN-LAST:event_btnCrearActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNombreJugador;
    private javax.swing.JLabel lblNumeroJugador;
    private javax.swing.JTextField txtMarcaCarro;
    private javax.swing.JTextField txtNombreCarro;
    private javax.swing.JTextField txtNombreJugador;
    // End of variables declaration//GEN-END:variables
}
