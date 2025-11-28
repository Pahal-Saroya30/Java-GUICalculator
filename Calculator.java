package myui;

import javax.swing.JOptionPane;

public class Calculator extends javax.swing.JFrame {

    private double result = 0;
    private String inStr = "0";
    private char lastOperator = ' ';
    //private Object t1;

    public Calculator() {
        initComponents();
        t1.setText("0");
        setSize(900, 800);
    }

    private void net(String inDigit) {
        if (inStr.equals("0")) {
            inStr = inDigit;    // no leading zero 
        } else if (inStr.equals("Error")) {
            inStr = inDigit;
        } else {
            inStr += inDigit;     // accumulate input digit
        }
        t1.setText(inStr);
        // Clear buffer if last operator is "="
        if (lastOperator == '=') {
            result = 0;
            lastOperator = ' ';
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t1 = new javax.swing.JTextField();
        jPower = new javax.swing.JButton();
        bSqRoot = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        bCuRoot = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bMulti = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bEquals = new javax.swing.JButton();
        bAdd = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bSubtract = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        t1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(t1);
        t1.setBounds(100, 120, 470, 70);

        jPower.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jPower.setText("^");
        jPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPowerActionPerformed(evt);
            }
        });
        getContentPane().add(jPower);
        jPower.setBounds(100, 210, 90, 60);

        bSqRoot.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bSqRoot.setText("Sq");
        bSqRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSqRootActionPerformed(evt);
            }
        });
        getContentPane().add(bSqRoot);
        bSqRoot.setBounds(220, 210, 90, 60);

        b7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(100, 290, 90, 70);

        b8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(220, 290, 90, 70);

        bCuRoot.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bCuRoot.setText("Cu");
        bCuRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCuRootActionPerformed(evt);
            }
        });
        getContentPane().add(bCuRoot);
        bCuRoot.setBounds(350, 210, 90, 60);

        bClear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bClear.setText("C");
        bClear.setToolTipText("");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });
        getContentPane().add(bClear);
        bClear.setBounds(480, 210, 90, 60);

        b9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(350, 290, 90, 70);

        bDiv.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bDiv.setText("/");
        bDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivActionPerformed(evt);
            }
        });
        getContentPane().add(bDiv);
        bDiv.setBounds(480, 290, 90, 70);

        b4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(100, 380, 90, 70);

        b5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(220, 380, 90, 70);

        b6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(350, 380, 90, 70);

        bMulti.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bMulti.setText("*");
        bMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiActionPerformed(evt);
            }
        });
        getContentPane().add(bMulti);
        bMulti.setBounds(480, 380, 90, 70);

        b0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        getContentPane().add(b0);
        b0.setBounds(100, 560, 90, 70);

        bEquals.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bEquals.setText("=");
        bEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(bEquals);
        bEquals.setBounds(220, 560, 220, 70);

        bAdd.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bAdd.setText("+");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });
        getContentPane().add(bAdd);
        bAdd.setBounds(480, 560, 90, 70);

        b1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(100, 470, 90, 70);

        b2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(220, 470, 90, 70);

        b3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(350, 470, 90, 70);

        bSubtract.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bSubtract.setText("-");
        bSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubtractActionPerformed(evt);
            }
        });
        getContentPane().add(bSubtract);
        bSubtract.setBounds(480, 470, 90, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPowerActionPerformed
        compute();
        lastOperator = '^';
    }//GEN-LAST:event_jPowerActionPerformed

    private void bCuRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCuRootActionPerformed
        compute2();
    }//GEN-LAST:event_bCuRootActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        String inDigit = b4.getText();
        net(inDigit);
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        String inDigit = b6.getText();
        net(inDigit);
    }//GEN-LAST:event_b6ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        String inDigit = b0.getText();
        net(inDigit);
    }//GEN-LAST:event_b0ActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        compute();
        lastOperator = '+';
    }//GEN-LAST:event_bAddActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String inDigit = b1.getText();
        net(inDigit);
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        String inDigit = b3.getText();
        net(inDigit);
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        String inDigit = b2.getText();
        net(inDigit);
    }//GEN-LAST:event_b2ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        String inDigit = b5.getText();
        net(inDigit);
    }//GEN-LAST:event_b5ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        String inDigit = b7.getText();
        net(inDigit);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        String inDigit = b8.getText();
        net(inDigit);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        String inDigit = b9.getText();
        net(inDigit);
    }//GEN-LAST:event_b9ActionPerformed

    private void bEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEqualsActionPerformed
        compute();
        lastOperator = '=';
    }//GEN-LAST:event_bEqualsActionPerformed

    private void bMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiActionPerformed
        compute();
        lastOperator = '*';
    }//GEN-LAST:event_bMultiActionPerformed

    private void bSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubtractActionPerformed
        compute();
        lastOperator = '-';
    }//GEN-LAST:event_bSubtractActionPerformed

    private void bDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivActionPerformed
        compute();
        lastOperator = '/';
    }//GEN-LAST:event_bDivActionPerformed

    private void bSqRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSqRootActionPerformed
        compute1();
    }//GEN-LAST:event_bSqRootActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        result = 0;
        inStr = "0";
        lastOperator = ' ';
        t1.setText("0");
    }//GEN-LAST:event_bClearActionPerformed

    private void compute1() {
        double inNum = Double.parseDouble(t1.getText());
        //JOptionPane.showMessageDialog(null, ""+inStr+"="+inNum);
        inStr = "0";
        result = Math.sqrt(inNum);
        t1.setText(String.valueOf((float) Math.sqrt(inNum)));
    }

    private void compute2() {
        double inNum = Double.parseDouble(t1.getText());
        inStr = "0";
        result = Math.cbrt(inNum);
        t1.setText(String.valueOf((float) Math.cbrt(inNum)));
    }

    private void compute() {
        int f = 1;
        double inNum = Double.parseDouble(inStr);
        inStr = "0";
        if (lastOperator == ' ') {
            result = inNum;
        } else if (lastOperator == '+') {
            result += inNum;
        } else if (lastOperator == '-') {
            result -= inNum;
        } else if (lastOperator == '*') {
            result *= inNum;
        } else if (lastOperator == '/') {
            if (inNum != 0) {
                result /= inNum;
            } else {
                f = 0;
                result = 0;
                inStr = "Error";
                lastOperator = ' ';
                t1.setText("Error");
            }
        } else if (lastOperator == '^') {
            double pow = 1;
            for (int i = 1; i <= (int) inNum; i++) {
                pow = pow * result;
            }
            result = pow;
        } else if (lastOperator == '=') {
            // Keep the result for the next operation
        }
        if (f == 1) {
            t1.setText(String.valueOf((float) result));
        } else {
            t1.setText("Error");
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bCuRoot;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bEquals;
    private javax.swing.JButton bMulti;
    private javax.swing.JButton bSqRoot;
    private javax.swing.JButton bSubtract;
    private javax.swing.JButton jPower;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
