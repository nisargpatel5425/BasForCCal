package BasForCCal;
import javax.swing.*;

import org.antlr.runtime.RecognitionException;

import java.awt.event.*;    
import java.io.*;    
/**
 * @author Ashwini Ukarde
 *
 */

public class GUI extends JFrame implements ActionListener{    
	JMenuBar jMenubar;    
	JMenu jMenu;    
	JMenuItem jOpen;    
	JTextArea jTextArea;  
	
	GUI(){    
		jOpen=new JMenuItem("Open File");    
		jOpen.addActionListener(this);            
		jMenu=new JMenu("File");    
		jMenu.add(jOpen);             
		jMenubar=new JMenuBar();    
		jMenubar.setBounds(0,0,1000,20);    
		jMenubar.add(jMenu);              
		jTextArea=new JTextArea(1000,1000);    
		jTextArea.setBounds(0,20,1000,1000);              
		add(jMenubar);    
	add(jTextArea);              
	}    

public void actionPerformed(ActionEvent e) {    
if(e.getSource()==jOpen){    
    JFileChooser selectFiles=new JFileChooser();    
    selectFiles.setMultiSelectionEnabled(true); 
    int approveOption=selectFiles.showOpenDialog(this);    
    if(approveOption ==JFileChooser.APPROVE_OPTION){    
    	File files[] =selectFiles.getSelectedFiles(); 
    	int t=0;
    	 while (t++ < files.length) {
        String filepath=files[t - 1].getPath(); 
        Example example= new Example();
        try {
			example.parseProg(filepath);
		} catch (IOException | RecognitionException e1) {
			e1.printStackTrace();
		}
       }                
    }    
}    
}  public static void main(String[] args) {    
	GUI gui=new GUI();    
	gui.setSize(1000,1000);      
	gui.setVisible(true);    
	gui.setDefaultCloseOperation(EXIT_ON_CLOSE);    
}    
}  

