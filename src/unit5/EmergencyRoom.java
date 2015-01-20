package unit5;

import javax.swing.JOptionPane;

public class EmergencyRoom extends javax.swing.JFrame {

    Patient p;
    LinkedPriorityQueue linkpq;
    String text;
    
    public EmergencyRoom() {
        initComponents();
        linkpq = new LinkedPriorityQueue(3);
        text = "";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jbrFair = new javax.swing.JRadioButton();
        jbrSer = new javax.swing.JRadioButton();
        jbrCrit = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtconditioninfo = new javax.swing.JTextArea();
        btntreatF = new javax.swing.JButton();
        btnschedule = new javax.swing.JButton();
        btntreatA = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menushowranked = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patient Name:");

        buttonGroup1.add(jbrFair);
        jbrFair.setText("Fair ");

        buttonGroup1.add(jbrSer);
        jbrSer.setText("Serious");

        buttonGroup1.add(jbrCrit);
        jbrCrit.setText("Critical");

        jLabel2.setText("Condition Level:");

        txtconditioninfo.setColumns(20);
        txtconditioninfo.setRows(5);
        jScrollPane1.setViewportView(txtconditioninfo);

        btntreatF.setText("Treat First");
        btntreatF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntreatFActionPerformed(evt);
            }
        });

        btnschedule.setText("Schedule");
        btnschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscheduleActionPerformed(evt);
            }
        });

        btntreatA.setText("Treat All");
        btntreatA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntreatAActionPerformed(evt);
            }
        });

        btnclear.setText("Clear Form");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        menuexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        menuexit.setText("Exit");
        menuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuexitActionPerformed(evt);
            }
        });
        jMenu1.add(menuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Info");

        menushowranked.setText("Show Scheduled Patients");
        menushowranked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menushowrankedActionPerformed(evt);
            }
        });
        jMenu2.add(menushowranked);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbrCrit)
                            .addComponent(jbrFair)
                            .addComponent(jLabel2)
                            .addComponent(jbrSer)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnclear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btntreatF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btntreatA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnschedule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnschedule)
                        .addGap(18, 18, 18)
                        .addComponent(btntreatF)
                        .addGap(18, 18, 18)
                        .addComponent(btntreatA))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbrFair)
                        .addGap(6, 6, 6)
                        .addComponent(jbrSer)
                        .addGap(5, 5, 5)
                        .addComponent(jbrCrit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnclear)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscheduleActionPerformed
        String nm="";
        String cdn;
        String result="";
        if(p.setName(nm)==false){
            JOptionPane.showMessageDialog(this, "Error - Please enter a name");
            return;
        }
        if(jbrFair.isSelected()){
            nm = txtname.getText();
            cdn = jbrFair.getText();
            p = new Patient(nm, cdn);
            linkpq.enqueue(p, 0);
            result += nm + "\t" + cdn + "\tis waiting...\n";
            text += result;
            txtconditioninfo.setText(text);
        }
        else if(jbrSer.isSelected()){
            cdn = jbrSer.getText();
            p = new Patient(nm, cdn);
            linkpq.enqueue(p, 1);
            result += nm + "\t" + cdn + "\tis waiting...\n";
            text += result;
            txtconditioninfo.setText(text);
        }
        else if(jbrCrit.isSelected()){
            cdn = jbrCrit.getText();
            p = new Patient(nm, cdn);
            linkpq.enqueue(p, 2);
            result += nm + "\t" + cdn + "\tis waiting...\n";
            text += result;            
            txtconditioninfo.setText(text);
        }
        
        buttonGroup1.clearSelection();
        txtname.setText("");
        
        
    }//GEN-LAST:event_btnscheduleActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtname.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btntreatFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntreatFActionPerformed
        if(p.getCondition()==jbrCrit.getText()){
            text += "Patient " + p.getName() + " is treated\n";
            txtconditioninfo.setText(text);
            linkpq.peekFront();
            linkpq.dequeue();
        }
        else if (p.getCondition()==jbrSer.getText()){
            text += "Patient " + p.getName() + " is treated\n";
            txtconditioninfo.setText(text);
            linkpq.peekFront();
        }
        else if (p.getCondition()==jbrFair.getText()){
            text += "Patient " + p.getName() + " is treated\n";
            txtconditioninfo.setText(text);
            linkpq.peekFront();
            linkpq.dequeue();
        }
    }//GEN-LAST:event_btntreatFActionPerformed

    private void menushowrankedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menushowrankedActionPerformed
        /*String result="";
        for (int x=0; x<list.size();x++){
            p=(Patient)list.get(x);
            result+= p.toString();
        }
        JOptionPane.showMessageDialog(this,result);*/
    }//GEN-LAST:event_menushowrankedActionPerformed

    private void btntreatAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntreatAActionPerformed
        if(linkpq.peekFront() == ""){
            JOptionPane.showMessageDialog(this, "There are no patients to treat");
            return;
        }
        
        while(linkpq.peekFront() != ""){
            text += linkpq.dequeue() + "has been treated\n";
            txtconditioninfo.setText(text);
        }
    }//GEN-LAST:event_btntreatAActionPerformed

    private void menuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuexitActionPerformed
    
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
            java.util.logging.Logger.getLogger(EmergencyRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmergencyRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmergencyRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmergencyRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmergencyRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnschedule;
    private javax.swing.JButton btntreatA;
    private javax.swing.JButton btntreatF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jbrCrit;
    private javax.swing.JRadioButton jbrFair;
    private javax.swing.JRadioButton jbrSer;
    private javax.swing.JMenuItem menuexit;
    private javax.swing.JMenuItem menushowranked;
    private javax.swing.JTextArea txtconditioninfo;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
