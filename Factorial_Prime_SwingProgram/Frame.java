import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		
		final JTextField textField = new JTextField(20);
		textField.setBounds(130,100,100,40);
		
		JButton prime = new JButton("Prime");
		prime.setBounds(130,150,100,40);
		JButton factorial = new JButton("Factorial");
		factorial.setBounds(130,200,100,40);
		JButton clear = new JButton("Clear");
		clear.setBounds(130,250,100,40);
		
		final JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(100,300,200,200);
		
		
		prime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae){
				final String textFieldArea = textField.getText();
				if(textFieldArea.length() > 0){
					textArea.append("Prime \n");
				  	try{
				  		for(String s:getPrime(Integer.parseInt(textFieldArea))){
				  			textArea.append(s+"\n");
				  		}
				  	}catch(Exception e){
			  			textArea.append("Invalid input\n");
			  		}
				}else{
					textArea.append("Enter some number\n");
				}
			}
		});
		
		factorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae){
				String textFieldArea = textField.getText();
				if(textFieldArea.length() > 0){
				  	try{
				  		textArea.append("Factorial : " + factorial(Integer.parseInt(textFieldArea)) + "\n");
				  			
				  	}catch(Exception e){
			  			textArea.append("Invalid input\n");
			  		}
				}else{
					textArea.append("Enter some number\n");
				}
			}
		});
		
		clear.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae){
			textArea.setText("");
			textField.setText("");
		   }
		});
		
		frame.setLayout(null);
		frame.setSize(400,600);
		frame.add(textField);
		frame.add(prime);
		frame.add(factorial);
		frame.add(clear);
		frame.add(scroll);
		frame.setVisible(true);
		
		}
		
		public static long factorial(int n){
			long fact = 1;
			for(int i = 1; i <= n; i++){
				fact *= i;
			}
			return fact;
		}
		
		public static ArrayList<String> getPrime(int n){
			int count = 0, num = 2;
			ArrayList<String> result = new ArrayList<String>();
			while(count != n){
				boolean prime = true;
				for(int i = 2; i <= Math.sqrt(num); i++){
					if(num % i == 0){
						prime = false;
						break;
					}
				}
					
				if(prime){
					count++;
					result.add(""+num);
				}
				
				num++;		
			}
			return result;
		}
}
