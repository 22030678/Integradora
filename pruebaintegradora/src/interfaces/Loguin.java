/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author rafae
 */
public class Loguin {
    
}

//INTERFACE LOGUIN
package Interfaces;

import dataBase.MetodosUsuario;

/**...4 lines */
public class Loguin extends javax.swing.JFrame {
    
/** Creates new form Loguin...3 lines */ 
    String usuario, password;
    
    
    //CREAR CUENTA//
private void jLabel2MouseClicked (java.awt.event.MouseEvent evt) (
//Instancianos la interface y la mostrams RegistrarUsuario Ru new 
        RegistrarUsuario Ru=new RegistrarUsuario();
Ru.setVisible( b:true);
}

//ENTER
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

this. usuario=vUsuario1.getText(); 
this.password=vContrasenial.getText ();

MetodosUsuario mu=new MetodosUsuario();
mu.ConsultarUsuario(usuario, contrasenia=password);
}

    // CAMBIO DE CONTRASEÑA//
private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
//Instancianos la interface y la mostramos
CambiarPassword Cp=new CambiarPassword(); 
Cp.setVisible(b:true);

//Eliminar cuenta
private void jLabelMouseClicked(java.awt.event.MouseEvent evt) {
EliminarUsuario eu=new EliminarUsuario(); 
eu.setVisible(b:true);

