/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorproject;

/**
 *
 * @author pc1
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        Sqrt = new javax.swing.JButton();
        Modulo = new javax.swing.JButton();
        MultInv = new javax.swing.JButton();
        Equals = new javax.swing.JButton();
        PosNeg = new javax.swing.JButton();
        Div = new javax.swing.JButton();
        Mult = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        DecPoint = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Hundred = new javax.swing.JButton();
        ClearEverything = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        One = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        CubeRoot = new javax.swing.JButton();
        Power10th = new javax.swing.JButton();
        Log = new javax.swing.JButton();
        Factorial = new javax.swing.JButton();
        SquareRoot = new javax.swing.JButton();
        Ln = new javax.swing.JButton();
        Square = new javax.swing.JButton();
        BS = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        CalcText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Sqrt.setText("Sqrt");
        Sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SqrtActionPerformed(evt);
            }
        });

        Modulo.setText("Mod");
        Modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModuloActionPerformed(evt);
            }
        });

        MultInv.setText("1/x");

        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        PosNeg.setText("+-");
        PosNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosNegActionPerformed(evt);
            }
        });

        Div.setText("/");
        Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivActionPerformed(evt);
            }
        });

        Mult.setText("*");
        Mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultActionPerformed(evt);
            }
        });

        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        Three.setText("3");
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });

        DecPoint.setText(".");
        DecPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecPointActionPerformed(evt);
            }
        });

        Clear.setText("C");

        Nine.setText("9");
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });

        Six.setText("6");
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });

        Two.setText("2");
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });

        Hundred.setText("00");
        Hundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HundredActionPerformed(evt);
            }
        });

        ClearEverything.setText("CE");

        Eight.setText("8");
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });

        Five.setText("5");
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });

        One.setText("1");
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });

        tan.setText("tan");

        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        CubeRoot.setText("³√");

        Power10th.setText("10^x");

        Log.setText("log");

        Factorial.setText("n!");

        SquareRoot.setText("√");

        Ln.setText("ln");

        Square.setText("x²");

        BS.setText("←");

        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        sin.setText("sin");

        Four.setText("4");
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });

        cos.setText("cos");

        CalcText.setEditable(false);
        CalcText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CalcText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        CalcText.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sin)
                            .addComponent(cos)
                            .addComponent(tan)
                            .addComponent(Ln)
                            .addComponent(Square))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Log)
                            .addComponent(Factorial)
                            .addComponent(SquareRoot)
                            .addComponent(CubeRoot)
                            .addComponent(Power10th))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BS)
                            .addComponent(Seven)
                            .addComponent(Four)
                            .addComponent(One)
                            .addComponent(Zero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ClearEverything)
                            .addComponent(Eight)
                            .addComponent(Five)
                            .addComponent(Two)
                            .addComponent(Hundred))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Clear)
                            .addComponent(Nine)
                            .addComponent(Six)
                            .addComponent(Three)
                            .addComponent(DecPoint))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PosNeg)
                            .addComponent(Minus)
                            .addComponent(Plus)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Div, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Mult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sqrt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Modulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Equals, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MultInv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CalcText))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CalcText, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClearEverything, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MultInv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DecPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(PosNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Div, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Mult, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ln, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Square, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Log, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(Factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Power10th, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Hundred, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixActionPerformed
        // TODO add your handling code here:
        if (CalcText.getText().equals("0"))
            CalcText.setText("6");
        else 
            CalcText.setText(CalcText.getText() + "6");
    }//GEN-LAST:event_SixActionPerformed

    private void DecPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecPointActionPerformed
        // TODO add your handling code here:
        
        CalcText.setText(CalcText.getText() + ".");
    }//GEN-LAST:event_DecPointActionPerformed

    private void SqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SqrtActionPerformed
        // TODO add your handling code here:
        CalcText.setText(Math.sqrt(Double.parseDouble(CalcText.getText())) + "");
    }//GEN-LAST:event_SqrtActionPerformed

    private void ModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModuloActionPerformed
        // TODO add your handling code here:        
        operator = '%';
        CalcText.setText("0"); 
    }//GEN-LAST:event_ModuloActionPerformed

    private void HundredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HundredActionPerformed
        // TODO add your handling code here:
        if (CalcText.getText().equals("0"))
            return;
        
        CalcText.setText(CalcText.getText() + "00");
    }//GEN-LAST:event_HundredActionPerformed

    // Only 00 and 0 will be invalid if the value is just zero
    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        // TODO add your handling code here:
        if (CalcText.getText().equals("0"))
            return;
        
        CalcText.setText(CalcText.getText() + "0");
    }//GEN-LAST:event_ZeroActionPerformed

    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
        // TODO add your handling code here:
        if (CalcText.getText().equals("0"))
            CalcText.setText("1");
        else 
            CalcText.setText(CalcText.getText() + "1");
    }//GEN-LAST:event_OneActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
        // TODO add your handling code here:
        if (CalcText.getText().equals("0"))
            CalcText.setText("2");
        else 
            CalcText.setText(CalcText.getText() + "2");
    }//GEN-LAST:event_TwoActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
        // TODO add your handling code here:   
        if (CalcText.getText().equals("0"))
            CalcText.setText("3");
        else 
            CalcText.setText(CalcText.getText() + "3");
    }//GEN-LAST:event_ThreeActionPerformed

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourActionPerformed
        // TODO add your handling code here:
        if (CalcText.getText().equals("0"))
            CalcText.setText("4");
        else 
            CalcText.setText(CalcText.getText() + "4");
    }//GEN-LAST:event_FourActionPerformed

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveActionPerformed
        // TODO add your handling code here:
        if (CalcText.getText().equals("0"))
            CalcText.setText("5");
        else 
            CalcText.setText(CalcText.getText() + "5");
    }//GEN-LAST:event_FiveActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
        // TODO add your handling code here:
        if (CalcText.getText().equals("0"))
            CalcText.setText("7");
        else 
            CalcText.setText(CalcText.getText() + "7");
    }//GEN-LAST:event_SevenActionPerformed

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightActionPerformed
        // TODO add your handling code here:
        if (CalcText.getText().equals("0"))
            CalcText.setText("8");
        else 
            CalcText.setText(CalcText.getText() + "8");
    }//GEN-LAST:event_EightActionPerformed

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
        // TODO add your handling code here:
        if (CalcText.getText().equals("0"))
            CalcText.setText("9");
        else 
            CalcText.setText(CalcText.getText() + "9");
    }//GEN-LAST:event_NineActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        // TODO add your handling code here:
        operator = '+';
        CalcText.setText("0");       
    }//GEN-LAST:event_PlusActionPerformed

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsActionPerformed
        // TODO add your handling code here:
        if (operator == ' ')
            return;
        
        val2 = Double.parseDouble(CalcText.getText());
        //CalcText.setText(SwitchOperator() + "");
        SwitchOperator();
        // resets the operator
        operator = ' ';
    }//GEN-LAST:event_EqualsActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        // TODO add your handling code here:
        operator = '-';
        
    }//GEN-LAST:event_MinusActionPerformed

    private void MultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultActionPerformed
        // TODO add your handling code here:
        operator = '*';
        CalcText.setText("0"); 
    }//GEN-LAST:event_MultActionPerformed

    private void DivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivActionPerformed
        // TODO add your handling code here:
        operator = '/';
        CalcText.setText("0"); 
    }//GEN-LAST:event_DivActionPerformed

    private void PosNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosNegActionPerformed
        // TODO add your handling code here:
        if (!(CalcText.getText().charAt(0) == '-'))
            CalcText.setText("-" + CalcText.getText());
        
        else 
            CalcText.setText(CalcText.getText().substring(1));
    }//GEN-LAST:event_PosNegActionPerformed

    /*
        if (!(operator == ' '))
        {
            val2 = Double.parseDouble(CalcText.getText());
            val1 = SwitchOperator();
        }
            
        else 
            val1 = Double.parseDouble(CalcText.getText());
    
    
    
    */
    
    private void SwitchOperator()
    {
        double temp = 0;
        
        if (!(operator == ' '))
        {
            val2 = Double.parseDouble(CalcText.getText());
            switch(operator)
            {
                case '+':
                    temp = val1 + val2;
                    break;

                case '-':
                    temp = val1 - val2;
                    break;

                case '%':
                    temp = val1 % val2;
                    break;

                case '*':
                    temp = val1 * val2;
                    break;

                case '/':
                    temp = val1 / val2;
                    break;
            }
            
            
        }
        
        else 
            val1 = Double.parseDouble(CalcText.getText());
        
        
    CalcText.setText("0"); 
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

    private char operator = ' ';
    private double val1, val2;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BS;
    private javax.swing.JTextField CalcText;
    private javax.swing.JButton Clear;
    private javax.swing.JButton ClearEverything;
    private javax.swing.JButton CubeRoot;
    private javax.swing.JButton DecPoint;
    private javax.swing.JButton Div;
    private javax.swing.JButton Eight;
    private javax.swing.JButton Equals;
    private javax.swing.JButton Factorial;
    private javax.swing.JButton Five;
    private javax.swing.JButton Four;
    private javax.swing.JButton Hundred;
    private javax.swing.JButton Ln;
    private javax.swing.JButton Log;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Modulo;
    private javax.swing.JButton Mult;
    private javax.swing.JButton MultInv;
    private javax.swing.JButton Nine;
    private javax.swing.JButton One;
    private javax.swing.JButton Plus;
    private javax.swing.JButton PosNeg;
    private javax.swing.JButton Power10th;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JButton Sqrt;
    private javax.swing.JButton Square;
    private javax.swing.JButton SquareRoot;
    private javax.swing.JButton Three;
    private javax.swing.JButton Two;
    private javax.swing.JButton Zero;
    private javax.swing.JButton cos;
    private javax.swing.JButton sin;
    private javax.swing.JButton tan;
    // End of variables declaration//GEN-END:variables
}
