/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author C2A601-08
 */
public class EventsTab {
    
    public EventsTab(){
    
}
    
    public List chargeEventList(){
        
        List<String> fileLineList = new ArrayList<>();
        
        try{
            FileReader fr = new FileReader("./src/formulario/events.txt");
            BufferedReader br = new BufferedReader(fr);
         
            String d;
            while((d=br.readLine())!= null){
                    fileLineList.add(d);
            }
            br.close();
            
            }catch(Exception e){
            e.printStackTrace();
        }
        return fileLineList;
    }
    
}
