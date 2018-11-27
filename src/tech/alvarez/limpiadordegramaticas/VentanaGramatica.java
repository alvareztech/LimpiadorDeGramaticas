package tech.alvarez.limpiadordegramaticas;

public class VentanaGramatica extends javax.swing.JDialog {

    public Gramatica G;

    public VentanaGramatica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        G = new Gramatica();
        initComponents();
    }

    public Gramatica getGramatica() {
        return G;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pProducciones = new javax.swing.JPanel();
        tfProduccionI = new javax.swing.JTextField();
        tfProduccionD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bAdicionarProduccion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lProducciones = new javax.swing.JList();
        bEliminarProduccion = new javax.swing.JButton();
        pGramatica = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taGramatica = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lInformacion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grámatica");
        setBounds((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - 412) / 2, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height - 341) / 2, 412, 341);
        setResizable(false);

        pProducciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Producciones"));

        jLabel1.setText("->");

        bAdicionarProduccion.setText("Adicionar");
        bAdicionarProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarProduccionActionPerformed(evt);
            }
        });

        lProducciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lProduccionesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lProducciones);

        bEliminarProduccion.setText("X");
        bEliminarProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarProduccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pProduccionesLayout = new javax.swing.GroupLayout(pProducciones);
        pProducciones.setLayout(pProduccionesLayout);
        pProduccionesLayout.setHorizontalGroup(
                pProduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pProduccionesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pProduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pProduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pProduccionesLayout.createSequentialGroup()
                                                        .addComponent(tfProduccionI, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tfProduccionD))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pProduccionesLayout.createSequentialGroup()
                                                        .addComponent(bAdicionarProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bEliminarProduccion))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pProduccionesLayout.setVerticalGroup(
                pProduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pProduccionesLayout.createSequentialGroup()
                                .addGroup(pProduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfProduccionI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(tfProduccionD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pProduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bAdicionarProduccion)
                                        .addComponent(bEliminarProduccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pGramatica.setBorder(javax.swing.BorderFactory.createTitledBorder("Gramática"));

        taGramatica.setColumns(20);
        taGramatica.setFont(new java.awt.Font("Consolas", 0, 13));
        taGramatica.setRows(5);
        jScrollPane1.setViewportView(taGramatica);

        javax.swing.GroupLayout pGramaticaLayout = new javax.swing.GroupLayout(pGramatica);
        pGramatica.setLayout(pGramaticaLayout);
        pGramaticaLayout.setHorizontalGroup(
                pGramaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pGramaticaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pGramaticaLayout.setVerticalGroup(
                pGramaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pGramaticaLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lInformacion.setText("Crea tu gramática ...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lInformacion)
        );

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pProducciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pGramatica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pProducciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pGramatica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAdicionarProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarProduccionActionPerformed
        try {
            if (esMayuscula(tfProduccionI.getText().charAt(0)) && !tfProduccionD.getText().equals("")) {
                Produccion P = new Produccion(tfProduccionI.getText().charAt(0), tfProduccionD.getText());
                G.adicionarProduccion(P);
                actualizar();
            } else {
                lInformacion.setText("Inserte una producción valida !");
            }
            tfProduccionI.setText("");
            tfProduccionD.setText("");
        } catch (Exception e) {
            lInformacion.setText("Inserte una producción");
        }
    }//GEN-LAST:event_bAdicionarProduccionActionPerformed

    public boolean esMayuscula(char x) {
        if (x > 64 && x < 91)
            return true;
        return false;
    }

    private void bEliminarProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarProduccionActionPerformed
        try {
            G.eliminarProduccion(lProducciones.getSelectedIndex() + 1);
            ConjuntoProducciones C = G.getProducciones();
            G = new Gramatica();
            for (int i = 0; i < C.n; i++)
                G.adicionarProduccion(C.C[i]);
            actualizar();
        } catch (Exception e) {
            lInformacion.setText("Seleccione produccion a eliminar");
        }
    }//GEN-LAST:event_bEliminarProduccionActionPerformed

    private void lProduccionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lProduccionesValueChanged

    }//GEN-LAST:event_lProduccionesValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (G.getAlfabetoT().nroElems() != 0 && G.getAlfabetoN().nroElems() != 0) {
            this.setVisible(false);

            ((VentanaPrincipal) this.getParent()).mostrarG1();
        } else {
            lInformacion.setText("Inserte Grámatica valida !");
            G = new Gramatica();
        }
        taGramatica.setText("");
        lProducciones.setListData(new String[0]);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void actualizar() {
        taGramatica.setText("");
        taGramatica.append("G = (N, T, P, S)");
        taGramatica.append("\n");
        taGramatica.append(" N = " + G.getAlfabetoN().getImpresion());
        taGramatica.append("\n");
        taGramatica.append(" T = " + G.getAlfabetoT().getImpresion());
        taGramatica.append("\n");
        taGramatica.append(" P:\n" + G.getProducciones().getImpresion());
        lProducciones.setListData(G.getProducciones().getImpresionV());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaGramatica dialog = new VentanaGramatica(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionarProduccion;
    private javax.swing.JButton bEliminarProduccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lInformacion;
    private javax.swing.JList lProducciones;
    private javax.swing.JPanel pGramatica;
    private javax.swing.JPanel pProducciones;
    private javax.swing.JTextArea taGramatica;
    private javax.swing.JTextField tfProduccionD;
    private javax.swing.JTextField tfProduccionI;
    // End of variables declaration//GEN-END:variables

}
