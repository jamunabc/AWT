package com.AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyWindow {
public MyWindow() {
	Frame frame=new Frame("MyWindow");
	Label label=new Label("Name");
	label.setBounds(50,50,50,30);
	label.setBackground(Color.green);
	//Adding textfield
	TextField txtField=new TextField();
	txtField.setBounds(105,50,200,30);
	//Adding button
	Button button=new Button("login");
	button.setBounds(50,80,250,30);
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		
		
			System.out.println("Hello I am");
			String userInput=txtField.getText();
			System.out.println(userInput);
	
		}
		});
	
	frame.add(label);
	frame.add(txtField);
	frame.add(button);
	frame.setSize(400,400);
	frame.setLayout(null);
	frame.setVisible(true);
	
	

}
public static void main(String[]args) {
new MyWindow();

}
}
