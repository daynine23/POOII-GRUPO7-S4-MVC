/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class CalendarTabbedPane extends JPanel{
    JLabel lab1, lab2, lab3, lab4;
    JTextField txtEvent, txtEmail, txtDate;
    JRadioButton rbDaily, rbWeekly, rbMonthly;
    ButtonGroup bGroup;
    JCheckBox ckAlarm;
    JButton btnSave, btnClean;
    JTabbedPane tabbedPane;
    JPanel panel;
    JTable eTable;
    JScrollPane sp;
    
    public CalendarTabbedPane() {
        super(new GridLayout(1, 1));
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        JComponent panel1 = makeFormPanel();
        tabbedPane.addTab("New Event", null, panel1,
                "New Event");
        tabbedPane.setMnemonicAt(0, HEIGHT);
        
        JComponent panel2 = makeTablePanel();
        tabbedPane.addTab("Events", null, panel2,
                "Events");
        tabbedPane.setMnemonicAt(1, HEIGHT);
        
        //Add the tabbed pane to this panel.
        add(tabbedPane);
        
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
    protected JComponent makeFormPanel() {
        lab1 = new JLabel("Event description");
        lab1.setBounds(40, 100, 200, 20);
        
        lab2 = new JLabel("Forward e-mail");
        lab2.setBounds(40, 150, 200, 20);
        
        lab3 = new JLabel ("Date");
        lab3.setBounds(40, 200, 200, 20);
        
        lab4 = new JLabel("Frequency");
        lab4.setBounds(40, 250, 200, 20);
        
        rbDaily = new JRadioButton("Daily");
        rbDaily.setBounds(150, 250, 80, 20);
        rbDaily.setSelected(true);
        //rbDaily.setOpaque(true);
        //rbDaily.setBackground(Color.red);
        
        rbWeekly = new JRadioButton("Weekly");
        rbWeekly.setBounds(250, 250, 80, 20);
        
        rbMonthly = new JRadioButton("Monthly");
        rbMonthly.setBounds(350, 250, 80, 20);
        
        bGroup = new ButtonGroup();
        
        bGroup.add(rbDaily);
        bGroup.add(rbWeekly);
        bGroup.add(rbMonthly);
        
        ckAlarm = new JCheckBox("Alarm");
        ckAlarm.setBounds(40, 300, 100, 20);
        
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
        
        panel = new JPanel();
        panel.setLayout(null);
        
        panel.add(lab1);
        panel.add(lab2);
        panel.add(lab3);
        panel.add(lab4);
        panel.add(rbDaily);
        panel.add(rbWeekly);
        panel.add(rbMonthly);
        panel.add(ckAlarm);
        panel.add(txtEvent);
        panel.add(txtEmail);
        panel.add(txtDate);
        panel.add(btnSave);
        panel.add(btnClean);
        
        add(panel);
        setSize(500,500);
        setVisible(true);
        
        return panel;
    }
    
    protected JComponent makeTablePanel() {
        String[][] data = {
            { "09/25/2024", "Fiesta", "DAILY", "gianny.romie@gmail.com", "OFF" },
            { "01/04/2026", "Cumpleaños de Mario", "DAILY", "gianny.romie@gmail.com", "ON" },
            { "01/04/2026", "50 años de Sagasti", "WEEKLY", "gianny.romie@gmail.com", "ON" }
        };
 
        // Column Names
        String[] columnNames = { "Date", "Description", "Frequency", "E-mail", "Alarm"};
 
        // Initializing the JTable
        eTable = new JTable(data, columnNames);
        eTable.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        sp = new JScrollPane(eTable);
        return sp;
    }
    
    /** Returns an ImageIcon, or null if the path was invalid.
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = TabbedPaneDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }*/
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TabbedPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create and set up the content pane.
        JComponent newContentPane = new CalendarTabbedPane();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.getContentPane().add(new CalendarTabbedPane(),
                BorderLayout.CENTER);
        
        //Display the window.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(500, 500);
    }
    
}
