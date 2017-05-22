import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MasterClass {
		
	JLabel lalsrc, laldest;
	JTextField srctxt, desttxt;
	JPanel p1, p2;
	JFrame frm;
	JButton startButton, stopButton;
	JProgressBar progress;
	JScrollPane scroll;
	JTextArea txtarea;
	String source, destination;
	
	public void setGuiComponents(){
		
		lalsrc = new JLabel("Source File: ");
		laldest = new JLabel("Destination FIle: ");
		srctxt = new JTextField(10);
		desttxt = new JTextField(10);
		startButton = new JButton("Copy");
		stopButton = new JButton("Stop");
		txtarea = new JTextArea("",10,30);
		scroll = new JScrollPane(txtarea);
		
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(lalsrc);
		p1.add(srctxt);
		p1.add(laldest);
		p1.add(desttxt);
		p1.add(startButton);
		p1.add(scroll);
		
		frm = new JFrame();
		frm.setVisible(true);
		frm.setSize(800, 800);
		frm.setLayout(new GridLayout(3,1));
		frm.add(p1);
	}
	
	public void setActions(){
		
		frm.addWindowListener(new WindowAdapter(){
			public void WindowClosed(WindowEvent e){
				System.exit(0);
			}
		});
		
		startButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				source = srctxt.getText();
				destination = desttxt.getText();
				copyingfiles(source, destination);
				showProgressBar();
				
			}
		});	
		
		stopButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				hideProgressBar();
				displayContents(destination);
			}
		});
	}
	
	public void showProgressBar(){
		progress = new JProgressBar(0,100);
		progress.setString("Copying....");
		progress.setStringPainted(true);
		progress.setIndeterminate(true);
		p1.add(progress);
		p1.add(stopButton);
		frm.setVisible(true);
	}
	
	public void hideProgressBar(){
		progress.setVisible(false);
		stopButton.setVisible(false);
	}
	
	public void copyingfiles(String src, String dest){
		try{
			
			InputStream in = new FileInputStream(new File(src));
			OutputStream out = new FileOutputStream(new File(dest));
			
			byte[] buf = new byte[1024];
			int len;
			
			while((len = in.read(buf)) > 0 )
				out.write(buf, 0, len);
			
			in.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void displayContents(String dest) {
		try{
			String contents = new Scanner(new File(dest)).useDelimiter("//Z").next();
			
	           txtarea.setText(contents);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
		
	public MasterClass(){
		setGuiComponents();
		setActions();
	}
	
	
	public static void main(String[] args){
			MasterClass fromm = new MasterClass();
		}
}
