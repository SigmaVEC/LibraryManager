/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libman;

/**
 *
 * @author root
 */
public class IdStatus extends javax.swing.JFrame {

    /**
     * Creates new form IdStatus
     */
    public IdStatus() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameOutput = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        classOutput = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        backButton.setText("<");
        backButton.setPreferredSize(new java.awt.Dimension(50, 50));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Student Details");

        idLabel.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        idLabel.setText("Student ID :");

        idInput.setPreferredSize(new java.awt.Dimension(10, 30));
        idInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idInputActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        nameLabel.setText("Name:");

        nameOutput.setText("<Enter a student ID>");

        classLabel.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        classLabel.setText("Class:");

        classOutput.setText("<Enter a student ID>");

        tableModel = new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AccNo", "Title", "Publisher", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
	table.setModel(tableModel);
        tableScroll.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableScroll)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addGap(9, 9, 9)
                        .addComponent(idInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(classLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        dispose();
	MainUI.main(null);
    }//GEN-LAST:event_backButtonActionPerformed

    private void idInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idInputActionPerformed
	String idNo = idInput.getText();
	String[] accNo = util.SQLQuery("Library","SELECT AccNo FROM Borrowed WHERE MemberId='"+idNo+"' AND Returned='no'");
        String[] bookTitle = util.SQLQuery("Library","SELECT Title FROM BookDetails JOIN Borrowed ON BookDetails.AccNo=Borrowed.AccNo WHERE MemberId='"+idNo+"' AND Returned='no'");
	String[] bookPublisher = util.SQLQuery("Library","SELECT Publisher FROM BookDetails JOIN Borrowed ON BookDetails.AccNo=Borrowed.AccNo WHERE MemberId='"+idNo+"' AND Returned='no'");
	String[] borrowDate = util.SQLQuery("Library","SELECT DateBorrowed FROM Borrowed WHERE MemberId='"+idNo+"' AND Returned='no'");
	String studentName = util.SQLQuery("Library","SELECT DISTINCT Name FROM Borrowed WHERE MemberId='"+idNo+"'")[0];
	String className = util.SQLQuery("Library","SELECT DISTINCT Class FROM Borrowed WHERE MemberId='"+idNo+"'")[0];

	tableModel.setRowCount(0);
	
	for(int i = 0; i < accNo.length; i++) {
		String[] row = new String[] {
			accNo[i], bookTitle[i], bookPublisher[i], util.getDate(borrowDate[i], Integer.parseInt(util.getServerData("Borrowal Period")))
		};
		tableModel.addRow(row);
	}

	nameOutput.setText(studentName);
	classOutput.setText(className);
	table.setModel(tableModel);
    }//GEN-LAST:event_idInputActionPerformed

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
        	util.setLookAndFeel();
	} catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IdStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IdStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IdStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IdStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IdStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel classOutput;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameOutput;
    private javax.swing.table.DefaultTableModel tableModel;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
