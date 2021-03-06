/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libman;

import java.sql.ResultSet;

/**
 *
 * @author root
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form IdStatus
     */
    public ReturnBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        accNoLabel = new javax.swing.JLabel();
        accNoInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameOutput = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        returnDateOutput = new javax.swing.JLabel();
        returnDateLabel = new javax.swing.JLabel();
        classOutput = new javax.swing.JLabel();
        overdueLabel = new javax.swing.JLabel();
        overdueOutput = new javax.swing.JLabel();
        notifier = new javax.swing.JLabel();
        titleSeparator = new javax.swing.JSeparator();

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
        title.setText("Return Book");

        accNoLabel.setText("AccNo");

        accNoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accNoInputActionPerformed(evt);
            }
        });

        nameLabel.setText("Name  :");

        classLabel.setText("Class   :");

        returnDateLabel.setText("Return by:");

        overdueLabel.setText("OverDue");

        overdueOutput.setText("");

        notifier.setForeground(new java.awt.Color(0, 0, 255));
        notifier.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accNoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(accNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classLabel)
                            .addComponent(nameLabel)
                            .addComponent(returnDateLabel)
                            .addComponent(overdueLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnDateOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(overdueOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(258, 258, 258))
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(notifier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleSeparator)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accNoLabel))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnDateOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overdueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(overdueOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(notifier)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
	setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
	setVisible(false);
	dispose();
        MainUI.main(null);
    }                                        

    private int accNoInputActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        String accno = accNoInput.getText(),name,Class,returned,dateBorrowed,overdue;
	accNoInput.setText("");
        String q = "select * from Borrowed where accno like '"+accno+"';"; 
        String n = "delete from Borrowed where AccNo like '"+accno+"';";
        ResultSet r = util.getResult("Library", q);
	util.SQLUpdate("Library",n);
	try {	
		if (!r.next() ) {
			notifier.setText("Book not Borrowed");
			notifier.setForeground(new java.awt.Color(255, 0, 0));
			nameOutput.setText("");
               		classOutput.setText("");
              		returnDateOutput.setText("");
               		overdueOutput.setText("");
	    		return 0;
		}
		r.beforeFirst();
	} catch(Exception e) {
		e.printStackTrace();	
	}

        try {
            	while(r.next()){
               		name = r.getString("Name");
               		Class = r.getString("Class");
               		dateBorrowed = r.getString("DateBorrowed");
               		String returnDate = util.getDate(dateBorrowed, Integer.parseInt(util.getServerData("Borrowal Period")));
               		if (returnDate.compareTo(util.getDate()) < 0)
                   		overdue = "yes";
               		else
                   		overdue = "no";

               		nameOutput.setText(name);
               		classOutput.setText(Class);
               		returnDateOutput.setText(returnDate);
               		overdueOutput.setText(overdue);
            	}
		notifier.setForeground(new java.awt.Color(0, 0, 255));
            	notifier.setText("Book Returned");
        } catch(Exception e) {
            e.printStackTrace();
        }

        return 1;
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
		util.setLookAndFeel();
	} catch(Exception e){
		e.printStackTrace();	
	}
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton backButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel overdueOutput;
    private javax.swing.JLabel notifier;
    private javax.swing.JLabel accNoLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameOutput;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel returnDateOutput;
    private javax.swing.JLabel returnDateLabel;
    private javax.swing.JLabel classOutput;
    private javax.swing.JLabel overdueLabel;
    private javax.swing.JSeparator titleSeparator;
    private javax.swing.JTextField accNoInput;
    // End of variables declaration                   
}

