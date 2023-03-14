/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.TrainerR;

/**
 * 
 * @author criizzversion4:17
 */
public class TrainR_UI extends javax.swing.JFrame {

    /**
     * Creates new form TrainR_UI
     */
    public TrainR_UI() {
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

        PanelHeader = new javax.swing.JPanel();
        LabelHeader = new javax.swing.JLabel();
        PanelParent = new javax.swing.JPanel();
        CardLoginPage = new javax.swing.JPanel();
        ButtonLogin = new javax.swing.JButton();
        ButtonNewUser = new javax.swing.JButton();
        CardNewUserPage = new javax.swing.JPanel();
        ButtonCreateAccount = new javax.swing.JButton();
        ButtonBackFromNewUser = new javax.swing.JButton();
        CardStartWorkout = new javax.swing.JPanel();
        ButtonBackFromStartWorkout = new javax.swing.JButton();
        ButtonStartWorkout = new javax.swing.JButton();
        CardWorkout = new javax.swing.JPanel();
        ButtonBackFromWorkout = new javax.swing.JButton();
        ButtonFinishWorkout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelHeader.setBackground(new java.awt.Color(204, 255, 204));
        PanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelHeader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelHeader.setText("TrainR");
        LabelHeader.setToolTipText("");

        javax.swing.GroupLayout PanelHeaderLayout = new javax.swing.GroupLayout(PanelHeader);
        PanelHeader.setLayout(PanelHeaderLayout);
        PanelHeaderLayout.setHorizontalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHeaderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LabelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelHeaderLayout.setVerticalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelParent.setLayout(new java.awt.CardLayout());

        CardLoginPage.setBackground(new java.awt.Color(153, 153, 255));
        CardLoginPage.setBorder(javax.swing.BorderFactory.createTitledBorder("Login Page"));
        CardLoginPage.setPreferredSize(new java.awt.Dimension(500, 400));

        ButtonLogin.setText("Login");

        ButtonNewUser.setText("New User?");

        javax.swing.GroupLayout CardLoginPageLayout = new javax.swing.GroupLayout(CardLoginPage);
        CardLoginPage.setLayout(CardLoginPageLayout);
        CardLoginPageLayout.setHorizontalGroup(
            CardLoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardLoginPageLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(ButtonLogin)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardLoginPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonNewUser)
                .addContainerGap())
        );
        CardLoginPageLayout.setVerticalGroup(
            CardLoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardLoginPageLayout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(ButtonLogin)
                .addGap(134, 134, 134)
                .addComponent(ButtonNewUser)
                .addContainerGap())
        );

        PanelParent.add(CardLoginPage, "card3");

        CardNewUserPage.setBackground(new java.awt.Color(255, 255, 204));
        CardNewUserPage.setBorder(javax.swing.BorderFactory.createTitledBorder("New User Page"));
        CardNewUserPage.setPreferredSize(new java.awt.Dimension(500, 400));

        ButtonCreateAccount.setText("Create Account");

        ButtonBackFromNewUser.setText("Back");

        javax.swing.GroupLayout CardNewUserPageLayout = new javax.swing.GroupLayout(CardNewUserPage);
        CardNewUserPage.setLayout(CardNewUserPageLayout);
        CardNewUserPageLayout.setHorizontalGroup(
            CardNewUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardNewUserPageLayout.createSequentialGroup()
                .addGroup(CardNewUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardNewUserPageLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(ButtonCreateAccount))
                    .addGroup(CardNewUserPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonBackFromNewUser)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        CardNewUserPageLayout.setVerticalGroup(
            CardNewUserPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardNewUserPageLayout.createSequentialGroup()
                .addContainerGap(268, Short.MAX_VALUE)
                .addComponent(ButtonCreateAccount)
                .addGap(84, 84, 84)
                .addComponent(ButtonBackFromNewUser)
                .addContainerGap())
        );

        PanelParent.add(CardNewUserPage, "card2");

        CardStartWorkout.setBackground(new java.awt.Color(255, 0, 153));
        CardStartWorkout.setBorder(javax.swing.BorderFactory.createTitledBorder("Start Workout Page"));
        CardStartWorkout.setPreferredSize(new java.awt.Dimension(500, 400));

        ButtonBackFromStartWorkout.setText("Back");

        ButtonStartWorkout.setText("Start Workout");

        javax.swing.GroupLayout CardStartWorkoutLayout = new javax.swing.GroupLayout(CardStartWorkout);
        CardStartWorkout.setLayout(CardStartWorkoutLayout);
        CardStartWorkoutLayout.setHorizontalGroup(
            CardStartWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardStartWorkoutLayout.createSequentialGroup()
                .addGroup(CardStartWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardStartWorkoutLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonBackFromStartWorkout))
                    .addGroup(CardStartWorkoutLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(ButtonStartWorkout)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        CardStartWorkoutLayout.setVerticalGroup(
            CardStartWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardStartWorkoutLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(ButtonStartWorkout)
                .addGap(136, 136, 136)
                .addComponent(ButtonBackFromStartWorkout)
                .addContainerGap())
        );

        PanelParent.add(CardStartWorkout, "card4");

        CardWorkout.setBackground(new java.awt.Color(0, 255, 255));
        CardWorkout.setBorder(javax.swing.BorderFactory.createTitledBorder("Workout Page"));
        CardWorkout.setPreferredSize(new java.awt.Dimension(500, 400));

        ButtonBackFromWorkout.setText("Back");

        ButtonFinishWorkout.setText("Finish Workout");

        javax.swing.GroupLayout CardWorkoutLayout = new javax.swing.GroupLayout(CardWorkout);
        CardWorkout.setLayout(CardWorkoutLayout);
        CardWorkoutLayout.setHorizontalGroup(
            CardWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardWorkoutLayout.createSequentialGroup()
                .addComponent(ButtonBackFromWorkout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                .addComponent(ButtonFinishWorkout)
                .addContainerGap())
        );
        CardWorkoutLayout.setVerticalGroup(
            CardWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardWorkoutLayout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addGroup(CardWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBackFromWorkout)
                    .addComponent(ButtonFinishWorkout))
                .addContainerGap())
        );

        PanelParent.add(CardWorkout, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelParent, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelParent, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TrainR_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainR_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainR_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainR_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainR_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBackFromNewUser;
    private javax.swing.JButton ButtonBackFromStartWorkout;
    private javax.swing.JButton ButtonBackFromWorkout;
    private javax.swing.JButton ButtonCreateAccount;
    private javax.swing.JButton ButtonFinishWorkout;
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JButton ButtonNewUser;
    private javax.swing.JButton ButtonStartWorkout;
    private javax.swing.JPanel CardLoginPage;
    private javax.swing.JPanel CardNewUserPage;
    private javax.swing.JPanel CardStartWorkout;
    private javax.swing.JPanel CardWorkout;
    private javax.swing.JLabel LabelHeader;
    private javax.swing.JPanel PanelHeader;
    private javax.swing.JPanel PanelParent;
    // End of variables declaration//GEN-END:variables
}
