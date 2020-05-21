/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Control.ControlComments;
import Control.ControlPosts;
import Entities.Comment;
import Entities.Post;
import Entities.User;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Brenda Bojorquez
 */
public class FrmPost extends javax.swing.JFrame {

    private User user;
    private Post post;
    private ControlPosts controlPost;
    private ControlComments controlComments;
    
    /**
     * Creates new form Post
     */
    public FrmPost(User user, Post post) {
        this.user=user;
        this.post=post;
        this.controlComments=new ControlComments();
        this.controlPost=new ControlPosts();
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

        pnlMenu = new javax.swing.JPanel();
        lblLogOut = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPost = new javax.swing.JTextArea();
        lblDate = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        pnlComments = new javax.swing.JScrollPane();
        lstComments = new javax.swing.JList<>();
        btnEliminarPost = new javax.swing.JButton();
        btnEliminarComentario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenu.setBackground(new java.awt.Color(64, 103, 127));

        lblLogOut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut.setText("LOGOUT");
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });

        lblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(lblLogOut)
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInicio)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUser.setText("jLabel1");

        txtPost.setEditable(false);
        txtPost.setColumns(20);
        txtPost.setRows(5);
        jScrollPane1.setViewportView(txtPost);

        lblDate.setText("jLabel1");

        lblComments.setText("jLabel1");

        lstComments.setModel(new DefaultComboBoxModel<Comment>(this.cargarComments()));
        pnlComments.setViewportView(lstComments);

        btnEliminarPost.setText("Eliminar Post");

        btnEliminarComentario.setText("Eliminar comentario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarComentario)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarPost))
                        .addComponent(jScrollPane1)
                        .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblComments, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlComments, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(btnEliminarPost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarComentario)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        int answer=JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?");
        if(answer==0){
            Inicio i=new Inicio();
            i.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        int answer = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?");
        if (answer == 0) {
            Principal p = new Principal(user);
            p.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblInicioMouseClicked

    private Comment[] cargarComments() {
        List<Comment> comments = this.post.getComments();
        Comment[] array = new Comment[comments.size()];
        int i = 0;
        if (comments.isEmpty()) {
            return null;
        }
        for (Comment comment : array) {
            array[i] = comment;
            i++;
        }
        return array;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarComentario;
    private javax.swing.JButton btnEliminarPost;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblUser;
    private javax.swing.JList<Comment> lstComments;
    private javax.swing.JScrollPane pnlComments;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTextArea txtPost;
    // End of variables declaration//GEN-END:variables
}