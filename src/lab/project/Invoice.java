/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Invoice extends javax.swing.JFrame {

    public Invoice() {
        initComponents();
        jLabel5.setText("User: "+fetchusername()+" to "+fetchlocation()+" on a "+fetchvehicle());
        jLabel6.setText("Amount: "+cost()+" BDT");
        
        
    }
    
    //String[] place = {"Mir", "Bash", "Ban", "Gul", "Dmd"};
    //String[] vehicle = {"Car", "Bike", "CNG"};
    
    
    static double cost(){
        switch(fetchvehicle()){
            case "Car":
                switch(fetchlocation()){
                    case "Mirpur": return 250;
                    case "Gulshan": return 400;
                    case "Banani": return 320;
                    case "Bashundhara": return 150;
                    case "Dhanmondi": return 350;
                    default: System.out.println("Error calculating fees.");
                }
            case "Motorcycle": 
                switch(fetchlocation()){
                    case "Mirpur": return 150;
                    case "Gulshan": return 200;
                    case "Banani": return 120;
                    case "Bashundhara": return 90;
                    case "Dhanmondi": return 130;
                    default: System.out.println("Error calculating fees.");
                }
            case "CNG": 
                switch(fetchlocation()){
                    case "Mirpur": return 220;
                    case "Gulshan": return 350;
                    case "Banani": return 260;
                    case "Bashundhara": return 230;
                    case "Dhanmondi": return 250;
                    default: System.out.println("Error calculating fees.");
                }
            default: System.out.println("Error calculating fees.");
        } return 0;
    }
    
    static String fetchvehicle(){
        try{
            File f1 = new File("Vehicle.txt");
            Scanner dataReader = new Scanner(f1);
            while(dataReader.hasNextLine()){
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
                return fileData;
            }
            dataReader.close();
            
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Error!");
        }
        return null;
    }
    
    static String fetchlocation(){
        try{
            File f1 = new File("location.txt");
            Scanner dataReader = new Scanner(f1);
            while(dataReader.hasNextLine()){
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
                return fileData;
            }
            dataReader.close();
            
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Error!");
        }
        return null;
    }
    
    static String fetchusername(){
        try{
            File f1 = new File("riderusername.txt");
            Scanner dataReader = new Scanner(f1);
            while(dataReader.hasNextLine()){
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
                return fileData;
            }
            dataReader.close();
            
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Error!");
        }
        return null;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setText("   Thank you for using Ride Buddies!");

        jLabel2.setText("*T&C apply");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel7.setText("***INVOICE***");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel7)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        
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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
