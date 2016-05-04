package Index;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;
import static java.awt.GraphicsDevice.WindowTranslucency.TRANSLUCENT;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Shruti
 */
public class IndexJFrame extends javax.swing.JFrame 
{
    public IndexJFrame() 
    {
        super(" ");        
        setLayout(new GridBagLayout());
        setSize(800,200);
        setLocationRelativeTo(null);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        this.addComponents();
    }
    public void addComponents()
    {
        JLabel jLabel=new JLabel("Public-Key Cryptography using RSA  ");
        jLabel.setFont(new Font("Lucida Bright",Font.ITALIC,20));
        jLabel.setSize(420, 30);
        jLabel.setForeground(Color.DARK_GRAY);
        add(jLabel);
        JButton btnText = new JButton("Encrypt Text");
        JButton btnImage = new JButton("Encrypt Image");
        JButton btnClose = new JButton("Close");
        add(btnText);
        add(btnImage);
        add(btnClose);
        ActionListener al;
        al = new ActionListener() 
        {
                @Override
                public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        };
        btnClose.addActionListener (al);
        ActionListener al1;
        al1 = new ActionListener() 
        {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    dispose();
                            new Text.PublicKeyHolder().setVisible(true);               
            }
        };
        btnText.addActionListener (al1);
        
        ActionListener al2;
        al2 = new ActionListener() 
        {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    dispose();
                            new ImageEncrypt.PublicKeyHolder().setVisible(true);               
            }
        };
        btnImage.addActionListener (al2);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) 
    {        
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        
        if (!gd.isWindowTranslucencySupported(TRANSLUCENT)) 
        {
            System.err.println("Translucency is not supported");
            System.exit(0);        
        }
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
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                IndexJFrame obj = new IndexJFrame();
                obj.setVisible(true);
                obj.setOpacity(0.90f);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
