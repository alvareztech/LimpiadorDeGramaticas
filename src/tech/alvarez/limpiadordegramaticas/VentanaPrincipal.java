package tech.alvarez.limpiadordegramaticas;

public class VentanaPrincipal extends javax.swing.JFrame {
    private Gramatica G;
    private Gramatica G2;
    private VentanaGramatica VG;

    public VentanaPrincipal() {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        VG = new VentanaGramatica(this, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taGramatica1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taGramatica2 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        lInformacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bLimpieza = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Limpiador de Grámaticas v.1  |  Daniel Alvarez");
        setBounds((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - 680) / 2, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height - 442) / 2, 680, 442);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Gramática"));

        taGramatica1.setColumns(20);
        taGramatica1.setFont(new java.awt.Font("Consolas", 0, 13));
        taGramatica1.setRows(5);
        jScrollPane1.setViewportView(taGramatica1);

        jButton3.setText("Nueva Gramática");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Producciones"));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tech/alvarez/limpiadordegramaticas/images/Fireworks 2.png"))); // NOI18N
        jButton1.setText("Renombradoras");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tech/alvarez/limpiadordegramaticas/images/Sun.png"))); // NOI18N
        jButton2.setText("Inutiles");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tech/alvarez/limpiadordegramaticas/images/Shamrock.png"))); // NOI18N
        jButton4.setText("Inaccesibles");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Gramática Resultante"));

        taGramatica2.setColumns(20);
        taGramatica2.setFont(new java.awt.Font("Consolas", 0, 13));
        taGramatica2.setRows(5);
        jScrollPane2.setViewportView(taGramatica2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lInformacion.setText("Inserte una grámatica...");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lInformacion)
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lInformacion)
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bLimpieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tech/alvarez/limpiadordegramaticas/images/Leaf.png"))); // NOI18N
        bLimpieza.setText("Higuienizar");
        bLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiezaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bLimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bLimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        jTabbedPane1.addTab("Limpieza de Grámaticas", jPanel1);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        jLabel1.setText("Limpiador de Grámaticas v.1");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setText("Daniel Alvarez");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("www.danyalvarez.com");

        jLabel4.setText("POR:");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("Proyecto realizado en el curso de Lenguajes Formales");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("de la carrera de Informática de la Universidad Mayor de San Andrés.");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tech/alvarez/limpiadordegramaticas/images/UMSA - Copy.jpg"))); // NOI18N

        jLabel8.setText("La Paz - Bolivia");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setText("Los Algoritmos utilizados para la limpieza de grámaticas fueron");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setText("extraidos del libro de \"LENGUAJES FORMALES\" de Lic. Lucio Torrico.");

        jLabel11.setText("Diciembre de 2009");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel12.setText("Programa escrito totalmente en Java.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7))
                                                .addContainerGap(69, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                                                        .addComponent(jLabel10)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                                                        .addComponent(jLabel12)
                                                                        .addGap(18, 18, 18))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                                                        .addComponent(jLabel8)
                                                                        .addGap(148, 148, 148)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                                                .addComponent(jLabel11)
                                                                .addGap(140, 140, 140)))
                                                .addComponent(jLabel5))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addContainerGap(104, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8)
                                                .addContainerGap())))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel10)
                                .addContainerGap(105, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 0, 14)); // NOI18N
        jLabel13.setText("\"Estamos vivos solo para ser felices\"");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(193, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(186, 186, 186))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(jLabel4)
                                .addContainerGap(331, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1)
                                .addContainerGap(74, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(111, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(235, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(228, 228, 228))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(213, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Créditos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiezaActionPerformed
        try {
            G2 = G;
            G2.limpiar();
            mostrarG2();
        } catch (Exception e) {
            lInformacion.setText("Crea una grámatica !");
        }
    }//GEN-LAST:event_bLimpiezaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VG.setVisible(true);
        VG.G = new Gramatica();
        taGramatica2.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            G2 = G;
            G2.eliminarProduccionesRenombradoras();
            mostrarG2();
        } catch (Exception e) {
            lInformacion.setText("Crea una grámatica !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            G2 = G;
            G2.eliminarNoTerminalesInutiles();
            mostrarG2();
        } catch (Exception e) {
            lInformacion.setText("Crea una grámatica !");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            G2 = G;
            G2.eliminarNoTerminalesInaccesibles();
            mostrarG2();
        } catch (Exception e) {
            lInformacion.setText("Crea una grámatica !");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void mostrarG1() {
        G = VG.getGramatica();
        taGramatica1.setText("");
        taGramatica1.append("G = (N, T, P, S)");
        taGramatica1.append("\n");
        taGramatica1.append(" N = " + G.getAlfabetoN().getImpresion());
        taGramatica1.append("\n");
        taGramatica1.append(" T = " + G.getAlfabetoT().getImpresion());
        taGramatica1.append("\n");
        taGramatica1.append(" P:\n" + G.getProducciones().getImpresion());
    }

    public void mostrarG2() {
        taGramatica2.setText("");
        taGramatica2.append("G = (N, T, P, S)");
        taGramatica2.append("\n");
        taGramatica2.append(" N = " + G2.getAlfabetoN().getImpresion());
        taGramatica2.append("\n");
        taGramatica2.append(" T = " + G2.getAlfabetoT().getImpresion());
        taGramatica2.append("\n");
        taGramatica2.append(" P:\n" + G2.getProducciones().getImpresion());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLimpieza;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lInformacion;
    private javax.swing.JTextArea taGramatica1;
    private javax.swing.JTextArea taGramatica2;
    // End of variables declaration//GEN-END:variables

}
