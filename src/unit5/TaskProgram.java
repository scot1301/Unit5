package unit5;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class TaskProgram extends javax.swing.JFrame {
ArrayList list;
ListIterator li;
int curtask, tottask;
Task t;
    
    public TaskProgram() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curtask=0;
        tottask=0;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblttask = new javax.swing.JLabel();
        lblctask = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        program = new javax.swing.JMenu();
        itemshowat = new javax.swing.JMenuItem();
        itemexit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        replaceascurrenttask = new javax.swing.JMenuItem();
        removetask = new javax.swing.JMenuItem();
        restorecurrenttask = new javax.swing.JMenuItem();
        clearscreen = new javax.swing.JMenuItem();
        insert = new javax.swing.JMenu();
        beforetask = new javax.swing.JMenuItem();
        aftertask = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        jScrollPane1.setViewportView(txtdesc);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setDoubleBuffered(false);

        jLabel5.setText("Total Tasks:");

        lblttask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblttask.setText("N/A");
        lblttask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblctask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblctask.setText("N/A");
        lblctask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Current Task:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblctask, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblttask, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblctask)
                    .addComponent(jLabel5)
                    .addComponent(lblttask))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnfirst.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnprev.setText("<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnlast.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnnext.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        program.setText("Program");

        itemshowat.setText("Show All Tasks");
        itemshowat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemshowatActionPerformed(evt);
            }
        });
        program.add(itemshowat);

        itemexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        itemexit.setText("Exit");
        itemexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemexitActionPerformed(evt);
            }
        });
        program.add(itemexit);

        jMenuBar1.add(program);

        edit.setText("Edit");

        replaceascurrenttask.setText("Replace This as Current Task");
        replaceascurrenttask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceascurrenttaskActionPerformed(evt);
            }
        });
        edit.add(replaceascurrenttask);

        removetask.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        removetask.setText("Remove Current Task");
        removetask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removetaskActionPerformed(evt);
            }
        });
        edit.add(removetask);

        restorecurrenttask.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        restorecurrenttask.setText("Restore Current Task to Screen");
        restorecurrenttask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restorecurrenttaskActionPerformed(evt);
            }
        });
        edit.add(restorecurrenttask);

        clearscreen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        clearscreen.setText("Clear Screen");
        clearscreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearscreenActionPerformed(evt);
            }
        });
        edit.add(clearscreen);

        jMenuBar1.add(edit);

        insert.setText("Insert");

        beforetask.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, java.awt.event.InputEvent.CTRL_MASK));
        beforetask.setText("Before Current Task");
        beforetask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beforetaskActionPerformed(evt);
            }
        });
        insert.add(beforetask);

        aftertask.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, java.awt.event.InputEvent.CTRL_MASK));
        aftertask.setText("After Current Task");
        aftertask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aftertaskActionPerformed(evt);
            }
        });
        insert.add(aftertask);

        jMenuBar1.add(insert);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnfirst)
                        .addGap(28, 28, 28)
                        .addComponent(btnprev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnnext)
                        .addGap(28, 28, 28)
                        .addComponent(btnlast)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnprev)
                    .addComponent(btnlast)
                    .addComponent(btnnext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if(curtask==tottask)return;
        curtask++;
        lblctask.setText("" + curtask);
        li.next();
        li.next();
        t=(Task)li.previous();
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_btnnextActionPerformed

    private void clearscreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearscreenActionPerformed
        txtname.setText("");
        txtdesc.setText("");
        JOptionPane.showMessageDialog(this, "Screen Cleared");
    }//GEN-LAST:event_clearscreenActionPerformed

    private void itemexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemexitActionPerformed

    private void itemshowatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemshowatActionPerformed
        String result="";
        for (int x=0; x<list.size();x++){
            t=(Task)list.get(x);
            result+= "Task " + (x+1) + ":\n" + t.toString()+"\n";
        }
        JOptionPane.showMessageDialog(this,result);
    }//GEN-LAST:event_itemshowatActionPerformed

    private void aftertaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aftertaskActionPerformed
        String nm=txtname.getText();
        String d=txtdesc.getText();
        Task t = new Task(nm, d);
        if (t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if (tottask>0) li.next();
        
        li.add(t);
        li.previous();
        curtask++;
        tottask++;
        lblttask.setText(""+tottask);
        lblctask.setText(""+curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_aftertaskActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        if (curtask==tottask)return;
        while(li.hasNext())
            li.next();
        t=(Task)li.previous();
        curtask=tottask;
        lblctask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_btnlastActionPerformed

    private void replaceascurrenttaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceascurrenttaskActionPerformed
        if (tottask==0){
            JOptionPane.showMessageDialog(this, "No task to replace this with, us Insert instead");
            return;
        }
        String nm=txtname.getText();
        String d=txtdesc.getText();
        Task t = new Task(nm, d);
        if (t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        li.next();
        li.set(t);
        li.previous();
                
    }//GEN-LAST:event_replaceascurrenttaskActionPerformed

    private void removetaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removetaskActionPerformed
        if(tottask==0)return;
        li.next();
        li.remove();
        tottask--;
        lblttask.setText(""+tottask);
        if(tottask==0){
            txtname.setText("");
            txtdesc.setText("");
            curtask=0;
            lblctask.setText("N/A");
            return;
        }
        else if(tottask>1)
        {
            li.next();
            t=(Task)li.previous();
        }
        else if(tottask==1){
            t=(Task)li.previous();
            curtask=1;
            lblctask.setText(""+curtask);
        }
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_removetaskActionPerformed

    private void beforetaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beforetaskActionPerformed
        String nm=txtname.getText();
        String d=txtdesc.getText();
        Task t = new Task(nm, d);
        if (t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if (tottask<0) li.previous();
        
        li.add(t);
        li.previous();
        curtask++;
        tottask++;
        lblttask.setText(""+tottask);
        lblctask.setText(""+curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_beforetaskActionPerformed

    private void restorecurrenttaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restorecurrenttaskActionPerformed
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_restorecurrenttaskActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        if(curtask==1)return;
        curtask--;
        lblctask.setText("" + curtask);
        t =(Task)li.previous();
        //li.previous();
        //t=(Task)li.next();
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        if (curtask==1)return;
        while(li.hasPrevious())
           t=(Task) li.previous();
       
        curtask=1;
        lblctask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_btnfirstActionPerformed

    
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
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aftertask;
    private javax.swing.JMenuItem beforetask;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JMenuItem clearscreen;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu insert;
    private javax.swing.JMenuItem itemexit;
    private javax.swing.JMenuItem itemshowat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblctask;
    private javax.swing.JLabel lblttask;
    private javax.swing.JMenu program;
    private javax.swing.JMenuItem removetask;
    private javax.swing.JMenuItem replaceascurrenttask;
    private javax.swing.JMenuItem restorecurrenttask;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
