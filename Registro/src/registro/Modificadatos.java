/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javis
 */
public class Modificadatos extends javax.swing.JFrame {

    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();
    DefaultTableModel modelo2 = new DefaultTableModel();
    String NumRegistro;
    
    public Modificadatos() {
        getContentPane().setBackground(new java.awt.Color(0, 139, 139));
        initComponents();
        
            modelo2.addColumn("Id");
            modelo2.addColumn("Nombre");
            modelo2.addColumn("ApePaterno");
            modelo2.addColumn("ApeMaterno");
            modelo2.addColumn("Correo");
            modelo2.addColumn("Direccion");
            modelo2.addColumn("Tipo");
            modelo2.addColumn("idCuota");
            modelo2.addColumn("Teleforno");
            modelo2.addColumn("Movil");
            modelo2.addColumn("Traje");
            
        tabla.setModel(modelo2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        NumR = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        charro = new javax.swing.JRadioButton();
        socio = new javax.swing.JRadioButton();
        simp = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rentado = new javax.swing.JRadioButton();
        propio = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ApePat = new javax.swing.JTextField();
        Nom = new javax.swing.JCheckBox();
        apeP = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        ApeMat = new javax.swing.JTextField();
        apeM = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        FechaN = new com.toedter.calendar.JDateChooser();
        date = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        Telfijo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TelMovil = new javax.swing.JTextField();
        telf = new javax.swing.JCheckBox();
        telm = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        DireccionP = new javax.swing.JTextField();
        calle = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        PostalC = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Colon = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        CodigoP = new javax.swing.JCheckBox();
        col = new javax.swing.JCheckBox();
        mail = new javax.swing.JCheckBox();
        traje = new javax.swing.JCheckBox();
        tipo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Modificar Datos  ");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Num. Registro");

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo:");

        buttonGroup1.add(charro);
        charro.setText("Charro");

        buttonGroup1.add(socio);
        socio.setText("Socio");
        socio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socioActionPerformed(evt);
            }
        });

        buttonGroup1.add(simp);
        simp.setText("Socio- Charro");
        simp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Traje ");

        buttonGroup2.add(rentado);
        rentado.setText("Rentado");

        buttonGroup2.add(propio);
        propio.setText("Propio");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla);

        jLabel4.setText("Nombre");

        jLabel5.setText("ApePaterno");

        Nom.setText("Modificar");

        apeP.setText("Modificar");

        jLabel7.setText("ApeMaterno");

        apeM.setText("Modificar");

        jLabel8.setText("Fecha de nacimiento");

        date.setText("Modificar");

        jLabel9.setText("Telefono fijo");

        jLabel12.setText("Movil");

        telf.setText("Modificar");

        telm.setText("Modificar");

        jLabel13.setText("Calle");

        calle.setText("Modificar");

        jLabel14.setText("Codigo Postal");

        jLabel15.setText("Colonia");

        Colon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tlaltenco", "Selene", "Tlahuac", "Amp. Lopez Portillo", "Zacatenco", "Otra" }));

        jLabel16.setText("Correo");

        CodigoP.setText("Modificar");

        col.setText("Modificar");

        mail.setText("Modificar");

        traje.setText("Modificar");

        tipo.setText("Modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NumR, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(FechaN, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ApeMat))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombre)
                                .addComponent(ApePat, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Telfijo)
                            .addComponent(TelMovil)
                            .addComponent(DireccionP, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telm)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nom)
                                    .addComponent(apeP)
                                    .addComponent(apeM)
                                    .addComponent(date)
                                    .addComponent(telf))
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel6))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PostalC)
                                            .addComponent(Colon, 0, 86, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CodigoP)
                                            .addComponent(col)))
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(socio)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(charro))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(propio)
                                                .addGap(18, 18, 18)
                                                .addComponent(rentado)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(traje, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(simp, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mail)
                            .addComponent(tipo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NumR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nom)
                            .addComponent(jLabel14)
                            .addComponent(PostalC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apeP)
                            .addComponent(jLabel15)
                            .addComponent(Colon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apeM)
                            .addComponent(jLabel16)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(propio)
                                .addComponent(rentado)
                                .addComponent(traje))))
                    .addComponent(FechaN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Telfijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TelMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telm, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DireccionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(calle))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(socio)
                                    .addComponent(charro)
                                    .addComponent(simp)
                                    .addComponent(tipo))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(62, 62, 62)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void socioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_socioActionPerformed

    private void simpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    limpiartabla();  
            NumRegistro=NumR.getText().trim();
            
            
            String sql ="";
            sql = "SELECT * FROM registrodatos WHERE idRegistro= '"+NumRegistro+"' ";
              String datos[] = new String [12];
               Statement st;
                    
        try{
         st = (Statement) cn.createStatement();
                ResultSet rs = (ResultSet) st.executeQuery(sql);
               
                while(rs.next()){
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(6);
                    datos[6]=rs.getString(7);
                    datos[7]=rs.getString(8);
                    datos[8]=rs.getString(9);
                    datos[9]=rs.getString(10);
                    datos[10]=rs.getString(11);
        
                    modelo2.addRow(datos);
                }
            
        }catch(SQLException ex){
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }          
        tabla.setModel(modelo2);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    String nom, ApePaterno, ApeMaterno, fecha, Direccion, Correo, Movil, Tel, cuota, Otros, Colonia, CodigoPostal;
    NumRegistro=NumR.getText().trim();
    int id=Integer.parseInt(NumRegistro);
    
        if(Nom.isSelected()){
            nom=nombre.getText().trim().toUpperCase();
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Nombre= ? WHERE idRegistro= ? ");
                    pps.setString( 1, nom);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
            
        }
        
        if(apeP.isSelected()){
            ApePaterno=ApePat.getText().trim().toUpperCase();
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET ApePaterno= ? WHERE idRegistro= ? ");
                    pps.setString( 1, ApePaterno);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
        }
     
        if(apeM.isSelected()){
            ApeMaterno=ApeMat.getText().trim().toUpperCase();
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET ApeMaterno= ? WHERE idRegistro= ? ");
                    pps.setString( 1, ApeMaterno);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
        }
        
        if(date.isSelected()){
            int mes=FechaN.getCalendar().get(Calendar.MONTH);
            int dia=FechaN.getCalendar().get(Calendar.DAY_OF_MONTH);
            int año=FechaN.getCalendar().get(Calendar.YEAR);
            String fecha1=dia+"/"+ mes +"/"+año;
            try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET fecha= ? WHERE idRegistro= ? ");
                    pps.setString( 1, fecha1);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
        }
        
        if(telf.isSelected()){
            Tel=Telfijo.getText().trim().toUpperCase();
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Telefono= ? WHERE idRegistro= ? ");
                    pps.setString( 1, Tel);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
        }
        
        if(telm.isSelected()){
            Movil=TelMovil.getText().trim().toUpperCase();
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Movil= ? WHERE idRegistro= ? ");
                    pps.setString( 1, Movil);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
        }
        if(calle.isSelected()){
            Direccion=DireccionP.getText().trim().toUpperCase();
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Direccion= ? WHERE idRegistro= ? ");
                    pps.setString( 1, Direccion);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
        }
        if(mail.isSelected()){
            Correo=email.getText().trim();
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Correo= ? WHERE idRegistro= ? ");
                    pps.setString( 1, Correo);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
        }
        if(col.isSelected()){
        Object ob;
        ob= Colon.getSelectedItem();
        Colonia=ob.toString();
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Colonia= ? WHERE idRegistro= ? ");
                    pps.setString( 1, Colonia);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
        }
        
        if(CodigoP.isSelected()){
            CodigoPostal=PostalC.getText().trim();
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET CodigoPostal= ? WHERE idRegistro= ? ");
                    pps.setString( 1, CodigoPostal);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
        }
        if(traje.isSelected()){
            if(propio.isSelected()){
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Traje= ? WHERE idRegistro= ? ");
                    pps.setString( 1, "PROPIO");
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
            }else if(rentado.isSelected()){
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Traje= ? WHERE idRegistro= ? ");
                    pps.setString( 1, "RENTADO");
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
            }
        }
        if(tipo.isSelected()){
            if(socio.isSelected()){
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Tipo= ? WHERE idRegistro= ? ");
                    pps.setInt( 1, 1);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
            }else if(charro.isSelected()){
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Tipo= ? WHERE idRegistro= ? ");
                    pps.setInt( 1, 2);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
            }else if(simp.isSelected()){
                try{
                    PreparedStatement pps =cn.prepareStatement("UPDATE registrodatos SET Tipo= ? WHERE idRegistro= ? ");
                    pps.setInt( 1, 3);
                    pps.setInt(2, id);
                    pps.executeUpdate();
                }catch(SQLException ex){
                }
            }
        
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public void limpiartabla(){
        int i=0;
        System.out.println("-"+modelo2.getRowCount());
        int e=modelo2.getRowCount();
        while( i < e)
        {
            modelo2.removeRow(0);
            i++;
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Modificadatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificadatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificadatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificadatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificadatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApeMat;
    private javax.swing.JTextField ApePat;
    private javax.swing.JCheckBox CodigoP;
    private javax.swing.JComboBox<String> Colon;
    private javax.swing.JTextField DireccionP;
    private com.toedter.calendar.JDateChooser FechaN;
    private javax.swing.JCheckBox Nom;
    private javax.swing.JTextField NumR;
    private javax.swing.JTextField PostalC;
    private javax.swing.JTextField TelMovil;
    private javax.swing.JTextField Telfijo;
    private javax.swing.JCheckBox apeM;
    private javax.swing.JCheckBox apeP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox calle;
    private javax.swing.JRadioButton charro;
    private javax.swing.JCheckBox col;
    private javax.swing.JCheckBox date;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox mail;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton propio;
    private javax.swing.JRadioButton rentado;
    private javax.swing.JRadioButton simp;
    private javax.swing.JRadioButton socio;
    private javax.swing.JTable tabla;
    private javax.swing.JCheckBox telf;
    private javax.swing.JCheckBox telm;
    private javax.swing.JCheckBox tipo;
    private javax.swing.JCheckBox traje;
    // End of variables declaration//GEN-END:variables
}
