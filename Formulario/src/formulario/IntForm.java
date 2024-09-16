/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Sofía
 */
public class IntForm extends JFrame implements ActionListener {
    JLabel lab1, lab2, lab3, lab4;
    JTextField txtEvent, txtEmail, txtDate;
    JButton btnSave, btnClean;
    JTabbedPane tabbedPane;
    JPanel Panel;
    
    
    IntForm(){
        lab1 = new JLabel("Event description");
        lab1.setBounds(40, 100, 200, 20);
        
        lab2 = new JLabel("Forward e-mail");
        lab2.setBounds(40, 150, 200, 20);
        
        lab3 = new JLabel ("Date");
        lab3.setBounds(40, 200, 200, 20);
        
        lab4= new JLabel("Frequency");
        lab4.setBounds(40, 250, 200, 20);
        
        txtEvent = new JTextField();
        txtEvent.setBounds(150, 100, 200, 20);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(150, 150, 200, 20);
        
        txtDate = new JTextField();
        txtDate.setBounds(150, 200, 200, 20);
        
        btnSave = new JButton("SAVE");
        btnSave.setBounds(150, 300, 100, 20);
        
        btnClean = new JButton("CLEAN");
        btnClean.setBounds(300, 300, 100, 20);
        
        Panel = new JPanel();
        Panel.setLayout(null);
        
        Panel.add(lab1);
        Panel.add(lab2);
        Panel.add(lab3);
        Panel.add(txtEvent);
        Panel.add(txtEmail);
        Panel.add(txtDate);
        Panel.add(btnSave);
        Panel.add(btnClean);
        
        add(Panel);
        setSize(500,500);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
