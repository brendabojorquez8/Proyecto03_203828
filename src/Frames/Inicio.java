package Frames;

import Control.ControlUsers;
import Entities.User;
import Enums.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Brenda Bojorquez
 */
public class Inicio extends javax.swing.JFrame {

    private ControlUsers controlUsuario;

    public Inicio() {
        initComponents();
        this.controlUsuario = new ControlUsers();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Images/Logo2.png"));

        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogIn = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_pss = new javax.swing.JLabel();
        pnlRegistro = new javax.swing.JPanel();
        lblRegistrar = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtEmailRegister = new javax.swing.JTextField();
        lblEmailRegister = new javax.swing.JLabel();
        txtPasswordRegister = new javax.swing.JPasswordField();
        lblPasswordRegister = new javax.swing.JLabel();
        chsDOB = new com.toedter.calendar.JDateChooser();
        lblDOB = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        lblGender = new javax.swing.JLabel();
        pnlMusic = new javax.swing.JScrollPane();
        lstMusic = new javax.swing.JList<>();
        pnlMovies = new javax.swing.JScrollPane();
        lstMovies = new javax.swing.JList<>();
        btnRegistrar = new javax.swing.JButton();
        lb_correo = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JPasswordField();
        lb_confirm = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_DOB = new javax.swing.JLabel();
        pnlGif = new javax.swing.JPanel();
        lblGif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("¡Bienvenido!");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(1125, 630));
        setMinimumSize(new java.awt.Dimension(1125, 630));
        setPreferredSize(new java.awt.Dimension(1125, 630));
        setResizable(false);

        pnlLogIn.setBackground(new java.awt.Color(64, 103, 127));

        btnEntrar.setBackground(new java.awt.Color(178, 178, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");

        lb_email.setForeground(new java.awt.Color(64, 103, 127));
        lb_email.setText("jLabel3");

        lb_pss.setForeground(new java.awt.Color(64, 103, 127));
        lb_pss.setText("jLabel4");

        javax.swing.GroupLayout pnlLogInLayout = new javax.swing.GroupLayout(pnlLogIn);
        pnlLogIn.setLayout(pnlLogInLayout);
        pnlLogInLayout.setHorizontalGroup(
            pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogInLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_pss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnEntrar)
                .addGap(26, 26, 26))
        );
        pnlLogInLayout.setVerticalGroup(
            pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_email)
                    .addComponent(lb_pss))
                .addContainerGap())
        );

        pnlRegistro.setBackground(new java.awt.Color(255, 255, 255));

        lblRegistrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(0, 0, 102));
        lblRegistrar.setText("¿No tienes cuenta? ¡Regístrate, es gratis!");

        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setText("Nombre");

        txtEmailRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailRegisterMouseClicked(evt);
            }
        });

        lblEmailRegister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmailRegister.setText("Email");

        txtPasswordRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordRegisterMouseClicked(evt);
            }
        });

        lblPasswordRegister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPasswordRegister.setText("Password");

        chsDOB.setBackground(new java.awt.Color(255, 255, 255));
        chsDOB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chsDOBMouseClicked(evt);
            }
        });

        lblDOB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDOB.setText("Fecha de Nacimiento");

        cmbGender.setModel(new DefaultComboBoxModel<>(Gender.values()));

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGender.setText("Género");

        pnlMusic.setBorder(javax.swing.BorderFactory.createTitledBorder("Música"));
        pnlMusic.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marca los géneros que te gusten", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        lstMusic.setModel(new DefaultComboBoxModel<>(MusicalGenre.values()));
        pnlMusic.setViewportView(lstMusic);

        pnlMovies.setBorder(javax.swing.BorderFactory.createTitledBorder("Películas"));
        pnlMovies.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marca los géneros que te gusten", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        lstMovies.setModel(new DefaultComboBoxModel<>(MovieGenre.values()));
        pnlMovies.setViewportView(lstMovies);

        btnRegistrar.setBackground(new java.awt.Color(102, 153, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lb_correo.setForeground(new java.awt.Color(255, 255, 255));
        lb_correo.setText("a");

        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setText("a");

        lblConfirm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblConfirm.setText("Confirmar Password");

        txtConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConfirmMouseClicked(evt);
            }
        });

        lb_confirm.setForeground(new java.awt.Color(255, 255, 255));
        lb_confirm.setText("a");
        lb_confirm.setToolTipText("");

        lb_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lb_nombre.setText("a");

        lb_DOB.setForeground(new java.awt.Color(255, 255, 255));
        lb_DOB.setText("a");

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistrar)
                    .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlRegistroLayout.createSequentialGroup()
                            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlRegistroLayout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(lblName))
                                .addComponent(lblDOB, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlRegistroLayout.createSequentialGroup()
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                    .addComponent(lblEmailRegister))
                                .addGroup(pnlRegistroLayout.createSequentialGroup()
                                    .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlRegistroLayout.createSequentialGroup()
                                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(lb_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chsDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lb_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPasswordRegister, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblConfirm, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGap(18, 18, 18)
                            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lb_confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmailRegister)
                                .addComponent(txtPasswordRegister)
                                .addComponent(lb_correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                        .addGroup(pnlRegistroLayout.createSequentialGroup()
                            .addComponent(pnlMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlMusic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblRegistrar)
                .addGap(27, 27, 27)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(lblEmailRegister)
                    .addComponent(txtEmailRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lb_correo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPasswordRegister)
                            .addComponent(txtPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_confirm))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nombre)
                        .addGap(1, 1, 1)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chsDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDOB))
                        .addGap(4, 4, 4)
                        .addComponent(lb_DOB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMovies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlGif.setBackground(new java.awt.Color(255, 255, 255));
        pnlGif.setMaximumSize(new java.awt.Dimension(400, 456));
        pnlGif.setMinimumSize(new java.awt.Dimension(400, 456));
        pnlGif.setPreferredSize(new java.awt.Dimension(400, 456));

        lblGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wink2.gif"))); // NOI18N
        lblGif.setMaximumSize(new java.awt.Dimension(400, 580));
        lblGif.setMinimumSize(new java.awt.Dimension(400, 580));
        lblGif.setPreferredSize(new java.awt.Dimension(400, 580));

        javax.swing.GroupLayout pnlGifLayout = new javax.swing.GroupLayout(pnlGif);
        pnlGif.setLayout(pnlGifLayout);
        pnlGifLayout.setHorizontalGroup(
            pnlGifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGifLayout.createSequentialGroup()
                .addComponent(lblGif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlGifLayout.setVerticalGroup(
            pnlGifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGifLayout.createSequentialGroup()
                .addComponent(lblGif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGif, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validarCampos()) {
            User user = new User();
            user.setEmail(txtEmailRegister.getText());
            user.setPassword(txtPasswordRegister.getText());
            user.setDateOfBirth(chsDOB.getDate());
            user.setName(txtName.getText());
            user.setGender((Gender) cmbGender.getSelectedItem());
            user.setMovieGenres(lstMovies.getSelectedValuesList());
            user.setMusicalGenres(lstMusic.getSelectedValuesList());

            if (this.controlUsuario.insert(user)) {
                JOptionPane.showMessageDialog(this, "Usuario registrado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo registrar al usuario", "Error", JOptionPane.ERROR_MESSAGE);

            }

            limpiarCampos();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
//        eliminarTodo();
        User us = controlUsuario.findByEmail(txtEmail.getText());
        System.out.println(us);
        if (us != null) {
            if (us.getPassword().equals(txtPassword.getText())) {
                Principal p=new Principal(us);
                p.setVisible(true);
                this.dispose();
            } else {
                lb_pss.setText("Contraseña incorrecta");
                lb_pss.setForeground(Color.yellow);
            }
        } else {
            lb_email.setText("Correo no registrado");
            lb_email.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        labelWhite();
    }//GEN-LAST:event_txtNameMouseClicked

    private void chsDOBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chsDOBMouseClicked
        labelWhite();
    }//GEN-LAST:event_chsDOBMouseClicked

    private void txtEmailRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailRegisterMouseClicked
        labelWhite();
    }//GEN-LAST:event_txtEmailRegisterMouseClicked

    private void txtPasswordRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordRegisterMouseClicked
        labelWhite();
    }//GEN-LAST:event_txtPasswordRegisterMouseClicked

    private void txtConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmMouseClicked
        labelWhite();
    }//GEN-LAST:event_txtConfirmMouseClicked

    private void eliminarTodo() {
        List<User> users = controlUsuario.find();
        for (User user : users) {
            System.out.println(user);
//            controlUsuario.remove(user);
        }
    }

    private void limpiarCampos() {
        txtName.setText("");
        txtConfirm.setText("");
        txtEmailRegister.setText("");
        txtPasswordRegister.setText("");
        labelWhite();
    }

    private void labelWhite() {
        lb_DOB.setForeground(Color.WHITE);
        lb_confirm.setForeground(Color.WHITE);
        lb_correo.setForeground(Color.WHITE);
        lb_nombre.setForeground(Color.WHITE);
        lb_password.setForeground(Color.WHITE);
    }

    private boolean validarCampos() {
        boolean validate = true;
        if (txtName.getText().isEmpty()) {
            lb_nombre.setText("Ingrese el nombre");
            lb_nombre.setForeground(Color.RED);
            validate = false;
        }

        if (txtEmailRegister.getText().isEmpty()) {
            lb_correo.setText("Ingrese correo");
            lb_correo.setForeground(Color.RED);
            validate = false;
        } else if (!checkEmail()) {
            lb_correo.setText("El correo no es válido");
            lb_correo.setForeground(Color.RED);
            validate = false;
        }

        if (chsDOB.getCalendar() == null) {
            lb_DOB.setText("Ingrese la fecha de nacimiento");
            lb_DOB.setForeground(Color.RED);
            validate = false;
        }

        if (txtPasswordRegister.getText().isEmpty()) {
            lb_password.setText("Ingrese contraseña");
            lb_password.setForeground(Color.RED);
            validate = false;
        }

        if (txtConfirm.getText().isEmpty()) {
            lb_confirm.setText("Repita contraseña");
            lb_confirm.setForeground(Color.RED);
            validate = false;
        } else if (!txtPasswordRegister.getText().equals(txtConfirm.getText())) {
            lb_confirm.setText("Las contraseñas no coinciden");
            lb_confirm.setForeground(Color.RED);
            validate = false;
        }
        if (String.valueOf(cmbGender.getSelectedItem()).isEmpty()
                && String.valueOf(lstMovies.getSelectedValue()).isEmpty()
                && String.valueOf(lstMusic.getSelectedValue()).isEmpty()) {
            validate = false;
        }

        return validate;
    }

    private boolean checkEmail() {
        List<User> usuarios = controlUsuario.find();
        if (usuarios.isEmpty()) {
            usuarios.add(new User());
        }
        for (User usuario : usuarios) {
            if (txtEmailRegister.equals(usuario.getEmail())) {
                lb_correo.setText("Correo ya registrado");
                lb_correo.setForeground(Color.RED);
                return false;
            }
        }

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(txtEmailRegister.getText());

        return mather.find();
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistrar;
    private com.toedter.calendar.JDateChooser chsDOB;
    private javax.swing.JComboBox<Gender> cmbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_DOB;
    private javax.swing.JLabel lb_confirm;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_pss;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmailRegister;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGif;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordRegister;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JList<MovieGenre> lstMovies;
    private javax.swing.JList<MusicalGenre> lstMusic;
    private javax.swing.JPanel pnlGif;
    private javax.swing.JPanel pnlLogIn;
    private javax.swing.JScrollPane pnlMovies;
    private javax.swing.JScrollPane pnlMusic;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailRegister;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordRegister;
    // End of variables declaration//GEN-END:variables
}
